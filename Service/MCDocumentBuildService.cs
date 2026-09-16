using Antlr4.Runtime;
using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Listener;
using MinecraftLanguageServer.Visitor;
using System.IO.Pipes;
using System.Text;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace MinecraftLanguageServer.Service
{
    public partial class MCDocumentBuildService
    {
        #region Field
        /// <summary>跨文件去重：已处理过的 Kind|Name 组合</summary>
        private static readonly List<string> ProcessedTypeKeys = [];
        private static readonly object ProcessedTypeKeysLock = new();

        private readonly JsonSerializerOptions jsonSerializerOptions = new()
        {
            // 写入时忽略 null 字段
            DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull,
            // 如果 DTO 属性名和 JSON 大小写不一致，也顺便放行
            PropertyNameCaseInsensitive = true,
            //写入时格式化
            WriteIndented = true
        };
        private Task ReciveTask;
        #endregion

        #region Method
        public MCDocumentBuildService()
        {
            ReciveTask = Task.Run(async () =>
            {
                ReceiveClient();
            });
        }

        /// <summary>
        /// 接收数据
        /// </summary>
        private async void ReceiveClient()
        {
            while (true)
            {
                NamedPipeServerStream mcdocumentPiperServerStream =
                    new("MCDocumentLanguageServerPipe",
                    PipeDirection.InOut,
                    NamedPipeServerStream.MaxAllowedServerInstances,
                    PipeTransmissionMode.Byte,
                    PipeOptions.Asynchronous);
                await mcdocumentPiperServerStream.WaitForConnectionAsync();

                _ = Task.Run(async () =>
                {
                    try
                    {
                        byte[] lengthBuf = new byte[4];
                        await mcdocumentPiperServerStream.ReadExactlyAsync(lengthBuf, 0, lengthBuf.Length);
                        int pathLength = BitConverter.ToInt32(lengthBuf, 0);

                        byte[] pathBuf = new byte[pathLength];
                        await mcdocumentPiperServerStream.ReadExactlyAsync(pathBuf, 0, pathBuf.Length);
                        string contentData = Encoding.UTF8.GetString(pathBuf).TrimEnd('\0');
                        string[] contentArray = contentData.Split('+');
                        string basePath = contentArray[0];
                        string filePath = contentArray[1];
                        string content = File.Exists(filePath) ? File.ReadAllText(filePath) : filePath;
                        string json = await Service(content, basePath, File.Exists(filePath) ? filePath : "");


                        byte[] jsonBytes = Encoding.UTF8.GetBytes(json);
                        byte[] lengthBytes = BitConverter.GetBytes(jsonBytes.Length);
                        await mcdocumentPiperServerStream.WriteAsync(lengthBytes);
                        await mcdocumentPiperServerStream.WriteAsync(jsonBytes);
                    }
                    catch (Exception ex)
                    {
                        Console.WriteLine($"客户端处理异常：{ex.Message}");
                    }
                    finally
                    {
                        mcdocumentPiperServerStream.Dispose();
                    }
                });
            }

            //string content = "dispatch minecraft:environment_attribute_float_modifier[alpha_blend]<T> to struct FloatWithAlpha {\r\n\tvalue: float,\r\n\t/// Defaults to 1.0\r\n\talpha?: float @ 0..1,\r\n}";
            //string json = await Service(content, "");
        }

        private async Task<string> Service(string fileData,string basePath,string filePath = "")
        {
            AntlrInputStream mcdocInputStream = new(fileData);
            mcdocLexer? mcdocLexer = new(mcdocInputStream);
            CommonTokenStream mcdocTokenStream = new(mcdocLexer);
            mcdocParser parser = new(mcdocTokenStream);

            if (filePath.Length > 0)
            {
                parser.RemoveErrorListeners();
                parser.AddErrorListener(new FileErrorListener(filePath));
            }
            var context = parser.file();

            var visitor = new MCDocumentMetaVisitor();
            List<MetaType> metaTypes = (List<MetaType>)visitor.Visit(context);
            List<MetaTypeEditorFieldDTO> metaTypeEditorList = [];
            for (int i = 0; i < metaTypes.Count; i++)
            {
                string name = "";
                if(!string.IsNullOrEmpty(metaTypes[i].Name) && metaTypes[i].Name?.Length > 0)
                {
                    name = metaTypes[i].Name!;
                }
                else if (!string.IsNullOrWhiteSpace(metaTypes[i].MetaTypeName) && metaTypes[i].MetaTypeName?.Length > 0)
                {
                    name = metaTypes[i].MetaTypeName!;
                }

                string key = $"{basePath}::{name}";
                bool skip;
                lock (ProcessedTypeKeysLock)
                {
                    skip = ProcessedTypeKeys.Contains(key);
                    if (!skip)
                    {
                        ProcessedTypeKeys.Add(key);
                    }
                }
                if (skip)
                {
                    continue;
                }

                MetaTypeEditorFieldDTO result = MetaTypeDataViewModelGenerator.StartBuildDTO(metaTypes[i], name);
                metaTypeEditorList.Add(result);
            }
            MCDocumentFile mcDocumentFile = new()
            {
                UsePathList = visitor.UsePathList,
                RootList = metaTypeEditorList
            };

            // 序列化
            string json = JsonSerializer.Serialize(mcDocumentFile, jsonSerializerOptions);
            return json;
        }
        #endregion
    }
}