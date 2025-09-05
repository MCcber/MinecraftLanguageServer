using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.MCDocumentService;
using MinecraftLanguageServer.McFunctionService;
using MinecraftLanguageServer.Model;
using Newtonsoft.Json;
using System.IO.Pipes;
using System.Text;
using System.Text.RegularExpressions;
using static mccommandParser;

namespace MinecraftLanguageServer.DataContext
{
    public partial class McfunctionIntellisenseService
    {
        #region 字段
        Dictionary<string, MCFunctionIntellisenseModel> DataContextList = [];
        MCFunctionIntellisenseModel? CurrentMCFDataContext = new();
        MCDocumentIntellisenseModel? CurrentDocumentDataContext = new();
        NamedPipeServerStream mcfunctionPiperServerStream;
        CancellationTokenSource cts = new();
        #endregion

        #region 语法、词法分析器所需字段
        AntlrInputStream mcfInputStream = null;
        mccommandLexer mcfLexer = null;
        CommonTokenStream mcfTokenStream = null;
        selectorLexer selectorlexer = null;

        AntlrInputStream mcdocInputStream = null;
        mcdocLexer mcdocLexer = null;
        CommonTokenStream mcdocTokenStream = null;
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
            Console.ReadKey();
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
                    //await mcfunctionPiperServerStream.WaitForConnectionAsync();
                    //using StreamReader reader = new(mcfunctionPiperServerStream);
                    //using StreamWriter writer = new(mcfunctionPiperServerStream);
                    //string data = await reader.ReadToEndAsync();
                    //CurrentMCFDataContext = JsonConvert.DeserializeObject<MCFunctionIntellisenseModel>(data);
                    CurrentMCFDataContext = new()
                    {
                        CurrentCode = "clone from minecraft:test "
                    };
                    CurrentMCFDataContext.CurrentCaretIndex = CurrentMCFDataContext.CurrentCode.Length;
                    await MCFunctionIntellisenseService();
                    //writer.Write(CurrentMCFDataContext);

                    //CurrentDocumentDataContext = new()
                    //{
                    //    CurrentCode = File.ReadAllText(@"D:\C#Project\CommandHelper-EfficiencyV\CBHK\bin\Debug\net8.0-windows10.0.22621.0\Resource\vanilla-mcdoc\java\world\entity\mod.mcdoc")
                    //};

                    //await MCDocumentIntellisenseService();
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
        private async Task MCFunctionIntellisenseService(bool NeedCalculateData = true)
        {
            #region 补全宏变量
            if(CurrentMCFDataContext is null)
            {
                return;
            }
            CurrentMCFDataContext.IsCompleteMacros = CurrentMCFDataContext.CurrentCode.TrimStart().StartsWith('$');
            if (CurrentMCFDataContext.IsCompleteMacros)
            {
                return;
            }
            #endregion

            #region 补全大纲
            if ("#region".StartsWith(CurrentMCFDataContext.CurrentCode.TrimStart()) || "#endregion".StartsWith(CurrentMCFDataContext.CurrentCode.TrimStart()))
            {
                CurrentMCFDataContext.IsCompleteOutline = true;
                return;
            }
            #endregion

            #region 创建主语法树的词法语法分析器
            //清空命令路径
            SyntaxPath.Clear();
            // 创建词法分析器
            mcfInputStream = new AntlrInputStream(CurrentMCFDataContext.CurrentCode);
            mcfLexer = new mccommandLexer(mcfInputStream);
            mcfTokenStream = new CommonTokenStream(mcfLexer);
            // 创建语法分析器
            mccommandParser parser = new(mcfTokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            CommandsContext context = parser.commands();
            #endregion

            #region 初始化监听器
            McfunctionListener mcfunctionListener = new(this, CurrentMCFDataContext)
            {
                CursorOffset = CurrentMCFDataContext.CurrentCaretIndex
            };
            mcfunctionListener.CurrentDataContext.CurrentCode = CurrentMCFDataContext.CurrentCode;
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
            if (CurrentMCFDataContext.IsCompleteSelectorParameters || CurrentMCFDataContext.IsCompleteSelectorParameterValues)
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
                CurrentMCFDataContext.CommandPath = commandPath;
            }
            else
            {
                CurrentMCFDataContext.CommandPath = "commands.";
            }
        }

        private async Task MCDocumentIntellisenseService()
        {
            #region 创建主语法树的词法语法分析器
            //清空命令路径
            SyntaxPath.Clear();
            // 创建词法分析器
            mcdocInputStream = new AntlrInputStream(CurrentDocumentDataContext.CurrentCode);
            mcdocLexer = new mcdocLexer(mcdocInputStream);
            mcdocTokenStream = new CommonTokenStream(mcdocLexer);
            // 创建语法分析器
            mcdocParser parser = new(mcdocTokenStream);
            // 重新执行语法分析器以获取更新后的上下文
            var context = parser.document();
            #endregion

            #region 初始化监听器
            MCDocmentListener mcdocListener = new(CurrentDocumentDataContext);
            #endregion

            #region 根据当前键入内容生成抽象语法树
            //LastContext = CurrentContext;
            await Task.Run(() =>
            {
                ParseTreeWalker.Default.Walk(mcdocListener, context);
            });
            string commandPath = SyntaxPath.ToString();
            #endregion
        }
        #endregion
    }
}
