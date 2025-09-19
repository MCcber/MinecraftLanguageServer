using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.MCDocumentService;
using MinecraftLanguageServer.Model.MCDocument;
using System.IO.Pipes;
using System.Text;

namespace MinecraftLanguageServer.DataContext
{
    public class MCDocumentBuildService
    {
        #region Field
        private MCDocumentFileModel? CurrentDocumentDataContext = new();
        private NamedPipeServerStream mcdocumentPiperServerStream;
        private AntlrInputStream mcdocInputStream = null;
        private mcdocLexer mcdocLexer = null;
        private CommonTokenStream mcdocTokenStream = null;
        CancellationTokenSource cts = new();
        #endregion

        #region Method
        public MCDocumentBuildService()
        {
            mcdocumentPiperServerStream = new("MCDocumentLanguageServerPipe", PipeDirection.InOut);

            Task.Run(ReceiveClient);
            Console.ReadKey();
        }

        /// <summary>
        /// 接收数据
        /// </summary>
        private async void ReceiveClient()
        {
            while (!cts.IsCancellationRequested)
            {
                try
                {
                    byte[] documentByteArray = new byte[1024];
                    await mcdocumentPiperServerStream.WaitForConnectionAsync();
                    await mcdocumentPiperServerStream.ReadAsync(documentByteArray, 0, documentByteArray.Length);
                    string filePath = Encoding.UTF8.GetString(documentByteArray);
                    filePath = filePath.TrimEnd('\0');
                    string fileContent = File.ReadAllText(filePath);
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

            #region 初始化监听器
            MCDocmentListener mcdocListener = new();
            #endregion

            #region 根据当前键入内容生成抽象语法树
            await Task.Run(() =>
            {
                ParseTreeWalker.Default.Walk(mcdocListener, context);
            });

            byte[] resultArray = new byte[2048];
            string value = "success";
            resultArray = Encoding.UTF8.GetBytes(value);
            await mcdocumentPiperServerStream.WriteAsync(resultArray, 0, resultArray.Length);
            #endregion
        }
        #endregion
    }
}
