using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageModelLibrary.Model.MCDocument;
using MinecraftLanguageServer.MCDocumentService;
using Newtonsoft.Json;
using System.IO.Pipes;
using System.Text;

namespace MinecraftLanguageServer.DataContext
{
    public class MCDocumentBuildService
    {
        #region Field
        private readonly NamedPipeServerStream mcdocumentPiperServerStream = new("MCDocumentLanguageServerPipe", PipeDirection.InOut);
        private AntlrInputStream mcdocInputStream = new();
        private mcdocLexer? mcdocLexer;
        private CommonTokenStream? mcdocTokenStream;
        #endregion

        #region Method
        public MCDocumentBuildService()
        {
            Task.Run(ReceiveClient);
        }

        /// <summary>
        /// 接收数据
        /// </summary>
        private async void ReceiveClient()
        {
            while (true)
            {
                try
                {
                    byte[] documentByteArray = new byte[2048];
                    await mcdocumentPiperServerStream.WaitForConnectionAsync();
                    await mcdocumentPiperServerStream.ReadAsync(documentByteArray);
                    string filePath = Encoding.UTF8.GetString(documentByteArray);
                    filePath = filePath.TrimEnd('\0');
                    string fileContent = filePath;
                    if (File.Exists(filePath))
                    {
                        fileContent = File.ReadAllText(filePath);
                    }
                    await Service(fileContent);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private async Task Service(string currentCode)
        {
            #region Field
            //初始化监听器
            MCDocmentListener mcdocListener = new();
            #endregion

            #region 创建主语法树的词法语法分析器
            // 创建词法分析器
            mcdocInputStream = new AntlrInputStream(currentCode);
            mcdocLexer = new mcdocLexer(mcdocInputStream);
            mcdocTokenStream = new CommonTokenStream(mcdocLexer);
            // 创建语法分析器
            mcdocParser parser = new(mcdocTokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            var context = parser.file();
            #endregion

            #region 根据当前键入内容生成抽象语法树
            await Task.Run(() =>
            {
                ParseTreeWalker.Default.Walk(mcdocListener, context);
            });
            #endregion

            #region 将结果发送回客户端
            MCDocumentFileModel model = mcdocListener.GetResult();
            byte[] resultArray = new byte[2048];
            string value = JsonConvert.SerializeObject(model);
            resultArray = Encoding.UTF8.GetBytes(value);
            await mcdocumentPiperServerStream.WriteAsync(resultArray);
            #endregion
        }
        #endregion
    }
}