using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.MCFunctionService;
using System.IO.Pipes;
using System.Text;
using System.Text.RegularExpressions;

namespace MinecraftLanguageServer.DataContext
{
    public partial class MCFunctionIntellisenseService
    {
        #region Field
        private readonly NamedPipeServerStream mcfunctionPiperServerStream = new("MCFunctionLanguageServerPipe", PipeDirection.InOut);
        AntlrInputStream? mcfInputStream;
        MCCommandLexer? mcfLexer;
        CommonTokenStream? mcfTokenStream;

        /// <summary>
        /// 命令路径
        /// </summary>
        public StringBuilder CommandPath = new();

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
            Task.Run(ReceiveClient);
        }

        /// <summary>
        /// 接收数据
        /// </summary>
        private async void ReceiveClient()
        {
            try
            {
                byte[] dataArray = new byte[2048];
                await mcfunctionPiperServerStream.WaitForConnectionAsync();
                await mcfunctionPiperServerStream.ReadAsync(dataArray);
                string filePath = Encoding.UTF8.GetString(dataArray);
                filePath = filePath.TrimEnd('\0');
                string fileContent = filePath;
                if (File.Exists(filePath))
                {
                    fileContent = File.ReadAllText(filePath);
                }
                await Service(new(fileContent));
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        /// <summary>
        /// 执行语法分析
        /// </summary>
        /// <returns></returns>
        private async Task Service(StringBuilder CurrentCode)
        {
            #region Field
            //初始化监听器
            MCFunctionListener mcfunctionListener = new();
            #endregion

            #region 创建主语法树的词法语法分析器
            //清空命令路径
            CommandPath.Clear();
            // 创建词法分析器
            mcfInputStream = new AntlrInputStream(CurrentCode.ToString());
            mcfLexer = new MCCommandLexer(mcfInputStream);
            mcfTokenStream = new CommonTokenStream(mcfLexer);
            // 创建语法分析器
            MCCommandParser parser = new(mcfTokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            MCCommandParser.CommandsContext context = parser.commands();
            #endregion

            #region 根据当前键入内容生成抽象语法树
            await Task.Run(() =>
            {
                ParseTreeWalker.Default.Walk(mcfunctionListener, context);
            });
            CommandPath = mcfunctionListener.CommandPath;
            #endregion

            #region 处理execute命令的重定向
            string commandPathString = CommandPath.ToString();
            int lastCommandIndex = commandPathString.LastIndexOf("commands");
            if (lastCommandIndex >= 0)
                commandPathString = commandPathString[lastCommandIndex..];
            if (commandPathString.StartsWith("commands.execute") && Regex.Matches(commandPathString, @"executeOptions").Count > 1)
                CommandPath = new("commands.execute." + commandPathString[commandPathString.LastIndexOf("executeOptions")..]);
            #endregion

            #region 将结果发送回客户端
            byte[] resultArray = new byte[2048];
            resultArray = Encoding.UTF8.GetBytes(CommandPath.ToString());
            await mcfunctionPiperServerStream.WriteAsync(resultArray);
            #endregion
        }
        #endregion
    }
}
