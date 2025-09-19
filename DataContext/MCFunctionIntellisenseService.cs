using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.MCFunctionService;
using MinecraftLanguageServer.Model.MCFunction;
using Newtonsoft.Json;
using System.IO.Pipes;
using System.Text;
using System.Text.RegularExpressions;
using static mccommandParser;

namespace MinecraftLanguageServer.DataContext
{
    public partial class MCFunctionIntellisenseService
    {
        #region Field
        Dictionary<string, MCFunctionIntellisenseModel> DataContextList = [];
        MCFunctionIntellisenseModel? MCFunctionDataContext = new();
        NamedPipeServerStream mcfunctionPiperServerStream;
        AntlrInputStream mcfInputStream = null;
        mccommandLexer mcfLexer = null;
        CommonTokenStream mcfTokenStream = null;
        selectorLexer selectorlexer = null;
        CancellationTokenSource cts = new();
        
        /// <summary>
        /// 记录当前游戏规则名
        /// </summary>
        public string CurrentGameRuleName = "";
        /// <summary>
        /// 记录当前文档每一行被正确分析的代码结束位置
        /// </summary>
        private Dictionary<int, int> DocumentCorrectCodeEndIndex = [];

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

        #region 记录当前上下文信息
        public ParserRuleContext? CurrentContext = null;
        public ParserRuleContext? LastContext = null;
        public ParserRuleContext? SelectorInlineContext = null;
        public bool NeedCompletionSelectorParameterValues = false;
        public bool NeedCompletionSelectorParameter = false;
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
                    MCFunctionDataContext = new()
                    {
                        CurrentCode = ""
                    };
                    MCFunctionDataContext.CurrentCaretIndex = MCFunctionDataContext.CurrentCode.Length;
                    await Service();
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
        private async Task Service(bool NeedCalculateData = true)
        {
            #region 补全宏变量
            if(MCFunctionDataContext is null)
            {
                return;
            }
            MCFunctionDataContext.IsCompleteMacros = MCFunctionDataContext.CurrentCode.TrimStart().StartsWith('$');
            if (MCFunctionDataContext.IsCompleteMacros)
            {
                return;
            }
            #endregion

            #region 补全大纲
            if ("#region".StartsWith(MCFunctionDataContext.CurrentCode.TrimStart()) || "#endregion".StartsWith(MCFunctionDataContext.CurrentCode.TrimStart()))
            {
                MCFunctionDataContext.IsCompleteOutline = true;
                return;
            }
            #endregion

            #region 创建主语法树的词法语法分析器
            //清空命令路径
            SyntaxPath.Clear();
            // 创建词法分析器
            mcfInputStream = new AntlrInputStream(MCFunctionDataContext.CurrentCode);
            mcfLexer = new mccommandLexer(mcfInputStream);
            mcfTokenStream = new CommonTokenStream(mcfLexer);
            // 创建语法分析器
            mccommandParser parser = new(mcfTokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            CommandsContext context = parser.commands();
            #endregion

            #region 初始化监听器
            MCFunctionListener mcfunctionListener = new(this, MCFunctionDataContext)
            {
                CursorOffset = MCFunctionDataContext.CurrentCaretIndex
            };
            mcfunctionListener.CurrentDataContext.CurrentCode = MCFunctionDataContext.CurrentCode;
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
            if (MCFunctionDataContext.IsCompleteSelectorParameters || MCFunctionDataContext.IsCompleteSelectorParameterValues)
            {
                return;
            }
            #endregion

            #region 处理坐标与关键字同层的情况
            //commandPath = commandPath.Replace("cloneFrom.pos3D", "cloneFrom")
            //    .Replace("cloneTo.pos3D", "cloneTo");
            #endregion

            if (NeedCalculateData)
            {
                MCFunctionDataContext.CommandPath = commandPath;
            }
            else
            {
                MCFunctionDataContext.CommandPath = "commands.";
            }
        }
        #endregion
    }
}
