using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.McFunctionService;
using MinecraftLanguageServer.Model;
using Newtonsoft.Json;
using System.IO.Pipes;
using System.Text;
using System.Text.RegularExpressions;
using System.Windows.Media;
using static mccommandParser;

namespace MinecraftLanguageServer.DataContext
{
    public partial class McfunctionIntellisenseService
    {
        Dictionary<string, McfunctionIntellisenseModel> DataContextList = [];
        McfunctionIntellisenseModel? CurrentDataContext = new();

        #region 字段
        NamedPipeServerStream mcfunctionPiperServerStream;
        CancellationTokenSource cts = new();
        public SolidColorBrush lightBlueBrush = new((Color)ColorConverter.ConvertFromString("#78A2F5"));
        #endregion

        #region 语法、词法分析器所需字段
        AntlrInputStream inputStream = null;
        public mccommandLexer lexer = null;
        CommonTokenStream tokenStream = null;
        selectorLexer selectorlexer = null;
        #endregion

        #region 补全框与相关属性
        /// <summary>
        /// 上下文更新时记载命令路径
        /// </summary>
        public StringBuilder SyntaxPath = new();
        /// <summary>
        /// 上下文更新标记
        /// </summary>
        bool NeedUpdate = false;
        /// <summary>
        /// 存储需要显示的补全数据数量
        /// </summary>
        private int DisplayCount = 0;
        /// <summary>
        /// 截取当前文本时不能被匹配的字符串
        /// </summary>
        public List<string> DonotMatches = [",", "[", "{", "(", "=", " "];
        /// <summary>
        /// 截取当前文本时可被缺省的字符串
        /// </summary>
        public List<string> Matches = [".", ":", "@"];
        #endregion

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

        #region 记录当前游戏规则名
        public string CurrentGameRuleName = "";
        #endregion

        #region 记录当前上下文信息
        public ParserRuleContext? CurrentContext = null;
        public ParserRuleContext? LastContext = null;
        public ParserRuleContext? SelectorInlineContext = null;
        public bool NeedCompletionSelectorParameterValues = false;
        public bool NeedCompletionSelectorParameter = false;
        #endregion

        /// <summary>
        /// 记录当前文档每一行被正确分析的代码结束位置
        /// </summary>
        private Dictionary<int, int> DocumentCorrectCodeEndIndex = [];

        public McfunctionIntellisenseService()
        {
            // 在后台程序中启动管道服务器
            mcfunctionPiperServerStream = new("CBHKLanguageServerPipe", PipeDirection.InOut, NamedPipeServerStream.MaxAllowedServerInstances, PipeTransmissionMode.Message, PipeOptions.Asynchronous);
            Task.Run(ReceiveClient);
        }

        #region Methods
        /// <summary>
        /// 接收数据
        /// </summary>
        private async void ReceiveClient()
        {
            while (!cts.IsCancellationRequested)
            {
                try
                {
                    await mcfunctionPiperServerStream.WaitForConnectionAsync();
                    using StreamReader reader = new(mcfunctionPiperServerStream);
                    using StreamWriter writer = new(mcfunctionPiperServerStream);
                    string data = await reader.ReadToEndAsync();
                    CurrentDataContext = JsonConvert.DeserializeObject<McfunctionIntellisenseModel>(data);
                    await IntellisenseService();
                    writer.Write(CurrentDataContext);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        /// <summary>
        /// 去除byte[]数组缓冲区内的尾部空白区;从末尾向前判断;
        /// </summary>
        /// <param name="bytes"></param>
        /// <returns></returns>
        public byte[] bytesTrimEnd(byte[] bytes)
        {
            int i = bytes.Length - 1;
            while (i >= 0 && bytes[i] == 0x00)
            {
                i--;
            }
            byte[] result = new byte[i + 1];
            Array.Copy(bytes, result, i + 1);
            return result;
        }

        /// <summary>
        /// 执行语法分析
        /// </summary>
        /// <returns></returns>
        private async Task IntellisenseService(bool NeedCalculateData = true)
        {
            #region 补全宏变量
            if(CurrentDataContext is null)
            {
                return;
            }
            CurrentDataContext.IsCompleteMacros = CurrentDataContext.CurrentCode.TrimStart().StartsWith('$');
            if (CurrentDataContext.IsCompleteMacros)
            {
                return;
            }
            #endregion

            #region 补全大纲
            if ("#region".StartsWith(CurrentDataContext.CurrentCode.TrimStart()) || "#endregion".StartsWith(CurrentDataContext.CurrentCode.TrimStart()))
            {
                CurrentDataContext.IsCompleteOutline = true;
                return;
            }
            #endregion

            #region 创建主语法树的词法语法分析器
            //清空命令路径
            SyntaxPath.Clear();
            // 创建词法分析器
            inputStream = new AntlrInputStream(CurrentDataContext.CurrentCode);
            lexer = new mccommandLexer(inputStream);
            tokenStream = new CommonTokenStream(lexer);
            // 创建语法分析器
            mccommandParser parser = new(tokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            CommandsContext context = parser.commands();
            #endregion

            #region 初始化监听器
            McfunctionListener mcfunctionListener = new(this, CurrentDataContext)
            {
                CursorOffset = CurrentDataContext.CurrentCaretIndex
            };
            mcfunctionListener.CurrentDataContext.CurrentCode = CurrentDataContext.CurrentCode;
            #endregion

            #region 根据当前键入内容生成抽象语法树
            LastContext = CurrentContext;
            await Task.Run(() =>
            {
                ParseTreeWalker.Default.Walk(mcfunctionListener, context);
            });
            //恢复抽象语法树的遍历标记
            mcfunctionListener.GetTarget = false;
            string commandPath = SyntaxPath.ToString();
            #endregion

            #region 处理execute命令的重定向
            int lastCommandIndex = commandPath.LastIndexOf("commands");
            if (lastCommandIndex >= 0)
                commandPath = commandPath[lastCommandIndex..];
            if (commandPath.StartsWith("commands.execute") && Regex.Matches(commandPath, @"executeOptions").Count > 1)
                commandPath = "commands.execute." + commandPath[commandPath.LastIndexOf("executeOptions")..];
            #endregion

            #region 补全选择器参数
            if (CurrentDataContext.IsCompleteSelectorParameters || CurrentDataContext.IsCompleteSelectorParameterValues)
            {
                return;
            }
            #endregion

            #region 处理坐标与关键字同层的情况
            //commandPath = commandPath.Replace("cloneFrom.pos3D", "cloneFrom")
            //    .Replace("cloneTo.pos3D", "cloneTo");
            #endregion

            if (NeedCalculateData)
                CurrentDataContext.CommandPath = commandPath;
            else
                CurrentDataContext.CommandPath = "commands.";
        }
        #endregion
    }
}
