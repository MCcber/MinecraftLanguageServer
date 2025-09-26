using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.MCFunctionService;
using MinecraftLanguageServer.Model.MCFunction;
using Newtonsoft.Json;
using System.IO.Pipes;
using System.Text;
using System.Text.RegularExpressions;

namespace MinecraftLanguageServer.DataContext
{
    public partial class MCFunctionIntellisenseService
    {
        #region Field
        Dictionary<string, MCFunctionIntellisenseModel> DataContextList = [];
        MCFunctionIntellisenseModel? MCFunctionDataContext = new();
        NamedPipeServerStream mcfunctionPiperServerStream;
        AntlrInputStream mcfInputStream = null;
        MCCommandLexer mcfLexer = null;
        CommonTokenStream mcfTokenStream = null;
        CancellationTokenSource cts = new();

        /// <summary>
        /// 命令路径
        /// </summary>
        public StringBuilder SyntaxPath = new();

        #region 正则属性
        [GeneratedRegex(@"executeOptions")]
        private static partial Regex executeOptionsCount();

        [GeneratedRegex(@"(?<={)[a-zA-Z]+(?=})")]
        private static partial Regex ScoreboardInlineType();

        [GeneratedRegex(@"[a-zA-Z{}0-9$*]+")]
        private static partial Regex InputContent();

        [GeneratedRegex(@"[a-zA-Z0-9\:\._\-+]")]
        private static partial Regex IsWord();

        [GeneratedRegex(@"(?<={)[0-9\-]+(?=})")]
        private static partial Regex ItemSlotMatcher();
        #endregion

        #endregion

        #region Method
        public MCFunctionIntellisenseService()
        {
            mcfunctionPiperServerStream = new("MCFunctionLanguageServerPipe", PipeDirection.InOut);
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
                    byte[] functionByteArray = new byte[2048];
                    await mcfunctionPiperServerStream.WaitForConnectionAsync();
                    await mcfunctionPiperServerStream.ReadAsync(functionByteArray, 0, functionByteArray.Length);
                    string data = Encoding.UTF8.GetString(functionByteArray);
                    data = data.TrimEnd('\0');
                    //MCFunctionDataContext = JsonConvert.DeserializeObject<MCFunctionIntellisenseModel>(data);
                    MCFunctionDataContext = new();
                    await Service("");
                    string result = JsonConvert.SerializeObject(MCFunctionDataContext);
                    functionByteArray = Encoding.UTF8.GetBytes(result);
                    await mcfunctionPiperServerStream.WriteAsync(functionByteArray, 0, functionByteArray.Length);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        /// <summary>
        /// 执行语法分析
        /// </summary>
        /// <returns></returns>
        private async Task Service(string CurrentCode)
        {
            #region 创建主语法树的词法语法分析器
            //清空命令路径
            SyntaxPath.Clear();
            // 创建词法分析器
            mcfInputStream = new AntlrInputStream(CurrentCode);
            mcfLexer = new MCCommandLexer(mcfInputStream);
            mcfTokenStream = new CommonTokenStream(mcfLexer);
            // 创建语法分析器
            MCCommandParser parser = new(mcfTokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            MCCommandParser.CommandsContext context = parser.commands();
            #endregion

            #region 初始化监听器
            MCFunctionListener mcfunctionListener = new(CurrentCode);
            #endregion

            #region 根据当前键入内容生成抽象语法树
            await Task.Run(() =>
            {
                ParseTreeWalker.Default.Walk(mcfunctionListener, context);
            });
            string commandPath = SyntaxPath.ToString();
            #endregion

            #region 处理execute命令的重定向
            int lastCommandIndex = commandPath.LastIndexOf("commands");
            if (lastCommandIndex >= 0)
                commandPath = commandPath[lastCommandIndex..];
            if (commandPath.StartsWith("commands.execute") && Regex.Matches(commandPath, @"executeOptions").Count > 1)
                commandPath = "commands.execute." + commandPath[commandPath.LastIndexOf("executeOptions")..];
            #endregion
        }
        #endregion
    }
}
