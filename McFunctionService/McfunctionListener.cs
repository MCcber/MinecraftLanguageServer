using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using MinecraftLanguageServer.DataContext;
using MinecraftLanguageServer.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static mccommandParser;
using static selectorParser;

namespace MinecraftLanguageServer.McFunctionService
{
    /// <summary>
    /// 创建自定义的监听器类，继承自 mccommandBaseListener
    /// </summary>
    public class McfunctionListener(McfunctionIntellisenseService mcfunctionContext, McfunctionIntellisenseModel CurrentDataContext) : mccommandBaseListener
    {
        #region  字段
        public McfunctionIntellisenseModel CurrentDataContext = CurrentDataContext;

        public int CursorOffset = 0;

        public bool GetTarget = false;

        public string CurrentCode = "";

        private ParserRuleContext? LastPosContext = new();
        #endregion

        /// <summary>
        /// 处理通用的规则进入事件
        /// </summary>
        /// <param name="context"></param>
        public override void EnterEveryRule(ParserRuleContext context)
        {
            if (CurrentDataContext.RunningPaste || !CurrentDataContext.IsNeedCalculate)
                return;

            #region 提取当前上下文类型
            string currentType = context.GetType().ToString().Replace("mccommandParser+", "").Replace("Radical", "").Replace("Context", "");
            currentType = currentType[0].ToString().ToLower() + currentType[1..];
            #endregion

            #region 分析坐标类上下文是否符合语法
            //处理坐标和子命令同时出现的情况
            bool PosAndLiteral = (context is Pos3DContext || context is Pos2DContext) && LastPosContext is not null && (LastPosContext.Parent is CloneSourceContext || LastPosContext.Parent is CloneDestinationContext);
            if (PosAndLiteral || ((LastPosContext is Pos3DContext || LastPosContext is Pos2DContext) && LastPosContext.Start.StartIndex <= CursorOffset && LastPosContext.Stop.StopIndex + 1 >= CursorOffset))
            {
                CurrentDataContext.CoordinateType = "Absolute";
                int posStartIndex;
                int posEndIndex;
                if (LastPosContext is null)
                {
                    CurrentDataContext.CoordinateCount = 0;
                    return;
                }
                if (!PosAndLiteral)
                {
                    posStartIndex = !GetTarget ? LastPosContext.Start.StartIndex : CursorOffset;
                    posEndIndex = !GetTarget ? context.Start.StartIndex : context.Stop.StartIndex;
                }
                else
                {
                    if (LastPosContext.Parent is CloneSourceContext)
                        posStartIndex = LastPosContext.Start.StopIndex;
                    else
                        posStartIndex = context.Stop.StopIndex;
                    MatchCollection posMatches = Regex.Matches(CurrentDataContext.CurrentCode[posStartIndex..].TrimStart(), @" ");
                    if (posMatches.Count > 2)
                        posEndIndex = posMatches[2].Index;
                    else
                        posEndIndex = CurrentDataContext.CurrentCode.Length;
                }

                if (posStartIndex <= posEndIndex && posStartIndex >= 0 && (CurrentDataContext.CurrentCode.Length >= posEndIndex || PosAndLiteral))
                {
                    GetTarget = true;
                    string posText = CurrentDataContext.CurrentCode[posStartIndex..posEndIndex].Trim();
                    if (Regex.IsMatch(posText, @"[a-z]+"))
                    {
                        int index = Regex.Match(posText, @"[a-z]").Index;
                        posText = CurrentDataContext.CurrentCode[posStartIndex..(index + posStartIndex)].Trim();
                    }
                    int LocalPosCount = Regex.Matches(posText, @"\^").Count;
                    int RelativePosCount = Regex.Matches(posText, @"~").Count;
                    int DecimalPosCount = Regex.Matches(posText, @"[0-9]+").Count;
                    bool HaveLocalAndRelative = RelativePosCount > 0 && LocalPosCount > 0;
                    if (!HaveLocalAndRelative)
                    {
                        int posCount = LocalPosCount + DecimalPosCount;
                        if (posCount > 0 && LastPosContext is Pos3DContext)
                            posCount = 3 - posCount;
                        else
                        if (posCount > 0 && LastPosContext is Pos2DContext)
                            posCount = 2 - posCount;
                        else
                        {
                            posCount = RelativePosCount + DecimalPosCount;
                            if (posCount > 0 && LastPosContext is not null && (LastPosContext is Pos3DContext || LastPosContext.Parent is CloneSourceContext || LastPosContext.Parent is CloneDestinationContext))
                                posCount = 3 - posCount;
                            else
                            if (posCount > 0 && LastPosContext is Pos2DContext)
                                posCount = 2 - posCount;
                        }

                        if (posCount > 0)
                        {
                            if (RelativePosCount > 0)
                                CurrentDataContext.CoordinateType = "Relative";
                            else
                                if (LocalPosCount > 0)
                                CurrentDataContext.CoordinateType = "Local";

                            CurrentDataContext.CoordinateCount = posCount;
                            CurrentDataContext.IsCompletePos = true;
                            LastPosContext = null;
                            GetTarget = true;
                            return;
                        }
                        else
                        {
                            CurrentDataContext.CoordinateCount = 0;
                            mcfunctionContext.SyntaxPath.Append(currentType + '.');
                        }
                    }
                }
            }
            #endregion

            #region 分析选择器上下文
            //必须为选择器上下文并且光标在中括号对之内
            if ((context is SelectorContext || context is OptionalSelectorContext || context is SingleSelectorContext) && !GetTarget &&
                context.Start.StartIndex + 4 <= CursorOffset && CursorOffset < context.Stop.StopIndex + 1)
            {
                #region 创建选择器的词法语法分析器
                int startIndex = context.Start.StartIndex + 1;
                int endIndex = context.Stop.StopIndex + 1;
                if (startIndex < 0)
                    startIndex = 0;
                if (endIndex > CurrentDataContext.CurrentCode.Length)
                    endIndex = CurrentDataContext.CurrentCode.Length;
                string currentText = CurrentDataContext.CurrentCode[startIndex..endIndex];
                if ((currentText.TrimStart()[0..3] == "@a[" ||
                     currentText.TrimStart()[0..3] == "@e[" ||
                     currentText.TrimStart()[0..3] == "@p[" ||
                     currentText.TrimStart()[0..3] == "@r[" ||
                     currentText.TrimStart()[0..3] == "@s[") &&
                     currentText.EndsWith(']') && currentText.Trim().Length >= 4)
                {
                    #region 计算光标在选择器参数群内的相对偏移量以及过滤空白字符
                    currentText = currentText[3..^1];
                    int rawLength = currentText.Length;
                    string startPart = currentText[..(CursorOffset - (context.Start.StartIndex + 4))];
                    int startPartRawLength = startPart.Length;
                    int startPartFilteredLength = Regex.Replace(startPart, @"[\s\r\n]+", "").Length;
                    int StartPartSpaceCount = startPartRawLength - startPartFilteredLength;
                    int InlineOffset = rawLength - currentText.Length;
                    currentText = Regex.Replace(currentText, @"[\s\r\n]+", "");
                    #endregion

                    #region 初始化选择器的语法、词法分析器
                    // 创建词法分析器
                    AntlrInputStream inputStream = new(currentText);
                    selectorLexer selectorlexer = new(inputStream);
                    CommonTokenStream tokenStream = new(selectorlexer);
                    // 创建语法分析器
                    selectorParser selectorparser = new(tokenStream);
                    SelectorParametersContext selectorContext = selectorparser.selectorParameters();
                    #endregion

                    #region 选择器监听器
                    SelectorListener selectorListener = new(CurrentDataContext)
                    {
                        CursorOffset = CursorOffset - (context.Start.StartIndex + 4 + InlineOffset + StartPartSpaceCount)
                    };
                    ParseTreeWalker.Default.Walk(selectorListener, selectorContext);
                    #endregion
                }
                #endregion
                GetTarget = true;
                mcfunctionContext.SyntaxPath.Append(currentType + '.');
            }
            #endregion

            #region 判断是否分析完毕
            bool needReturn = context.Start.StopIndex >= CursorOffset - 1 && GetTarget;
            //不监听后续上下文
            if (needReturn)
                return;
            #endregion

            #region 判断是否进入光标所在上下文
            try
            {
                if (context.Start.StartIndex > CursorOffset ||
                   (context.Start.StartIndex <= CursorOffset &&
                   (context.Start.StopIndex + 1 >= CursorOffset || (context.Start.StopIndex + 1 >= 0 && CursorOffset <= CurrentDataContext.CurrentCode.Length && !CurrentDataContext.CurrentCode[(context.Start.StopIndex + 1)..CursorOffset].Contains(' '))) && !GetTarget))
                {
                    GetTarget = true;
                    mcfunctionContext.SyntaxPath.Append(currentType + '.');
                }
                else
                if (!GetTarget)//如果没遇到光标所在上下文且还未处理光标则不断添加命令路径
                {
                    mcfunctionContext.SyntaxPath.Append(currentType + '.');
                }
            }
            catch
            {

            }
            //后置检查坐标
            if (context is Pos3DContext || context is Pos2DContext || context is CloneSourceContext || context is CloneDestinationContext)
                LastPosContext = context;
            #endregion
        }

        /// <summary>
        /// 处理退出游戏规则名上下文
        /// </summary>
        /// <param name="context"></param>
        public override void ExitGameruleName([NotNull] GameruleNameContext context) => CurrentDataContext.CurrentGameRuleName = context.GetText();

        #region 处理bossbarID
        /// <summary>
        /// 进入添加bossbarID上下文时删除旧的id
        /// </summary>
        /// <param name="context"></param>
        public override void EnterBossbarIdString([Antlr4.Runtime.Misc.NotNull] BossbarIdStringContext context)
        {
            CurrentDataContext.TypingBossbarIdString = true;
            string Variables = context.GetText().Trim();
            CurrentDataContext.currentBossbarIdString = Variables;
        }
        #endregion

        #region 处理ScoreboardObjective
        /// <summary>
        /// 进入添加记分板上下文时删除旧的id
        /// </summary>
        /// <param name="context"></param>
        public override void EnterScoreboardObjective([Antlr4.Runtime.Misc.NotNull] ScoreboardObjectiveContext context)
        {
            #region 扫描记分板变量
            int LeftIndex, RightIndex;
            LeftIndex = context.Start.StartIndex + 1;
            RightIndex = context.Start.StartIndex + 2;
            string Variable = "";
            if (RightIndex < CurrentDataContext.CurrentCode.Length)
            {
                while (RightIndex < CurrentDataContext.CurrentCode.Length && !CurrentDataContext.CurrentCode[LeftIndex..RightIndex].EndsWith(' '))
                    RightIndex++;
                Variable = CurrentDataContext.CurrentCode[LeftIndex..RightIndex];
            }
            else
                if (LeftIndex < CurrentDataContext.CurrentCode.Length)
                Variable = CurrentDataContext.CurrentCode[LeftIndex..].Trim();
            string currentText = context.Stop.Text;
            #endregion
            if (currentText == "trigger")
            {
                CurrentDataContext.TypingTriggerVariable = true;
                CurrentDataContext.currentTriggerVariable = Variable;
            }
            CurrentDataContext.TypingScoreboardVariable = true;
            CurrentDataContext.currentScoreboardVariable = Variable;
        }
        #endregion

        #region 处理ScoreboardType
        /// <summary>
        /// 进入记分板类型上下文时判断删除触发器变量
        /// </summary>
        /// <param name="context"></param>
        public override void EnterScoreboardType([Antlr4.Runtime.Misc.NotNull] ScoreboardTypeContext context)
        {
            #region 扫描左侧的记分板变量
            int LeftIndex, RightIndex;
            LeftIndex = context.Stop.StartIndex - 2;
            RightIndex = context.Stop.StartIndex - 1;
            string Variable = "";
            if (LeftIndex >= 0)
            {
                while (!CurrentDataContext.CurrentCode[LeftIndex..RightIndex].StartsWith(' ') && LeftIndex > 0)
                    LeftIndex--;
                Variable = CurrentDataContext.CurrentCode[(LeftIndex + 1)..(RightIndex + 1)];
            }
            #endregion
            string type = context.Stop.Text;
            if (type == "trigger")
            {
                CurrentDataContext.TypingTriggerVariable = true;
                CurrentDataContext.currentTriggerVariable = Variable;
            }
            CurrentDataContext.TypingScoreboardVariable = true;
            CurrentDataContext.currentScoreboardVariable = Variable;
        }
        #endregion

        #region 处理Storage
        /// <summary>
        /// 进入storageID上下文时删除旧的ID
        /// </summary>
        /// <param name="context"></param>
        public override void EnterStorageId([Antlr4.Runtime.Misc.NotNull] StorageIdContext context)
        {
            CurrentDataContext.TypingStorageIdString = true;
            string Variables = context.GetText();
            CurrentDataContext.currentStorageVariable = Variables;
        }
        #endregion

        #region 处理实体Tag
        /// <summary>
        /// 进入标签上下文时删除旧的ID
        /// </summary>
        /// <param name="context"></param>
        public override void EnterTagValue([Antlr4.Runtime.Misc.NotNull] TagValueContext context)
        {
            CurrentDataContext.TypingTagVariable = true;
            string Variables = context.GetText();
            CurrentDataContext.currentTagVariable = Variables;
        }
        #endregion

        #region 处理队伍名
        public override void EnterTeamName([Antlr4.Runtime.Misc.NotNull] TeamNameContext context)
        {
            CurrentDataContext.TypingTeamNameString = true;
            string Variables = context.GetText();
            CurrentDataContext.currentTeamVariable = Variables;
        }
        #endregion
    }
}
