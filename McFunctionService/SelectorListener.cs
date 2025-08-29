using Antlr4.Runtime;
using MinecraftLanguageServer.Model;
using static selectorParser;

namespace MinecraftLanguageServer.McFunctionService
{
    /// <summary>
    /// 选择器监听器
    /// </summary>
    public class SelectorListener(McfunctionIntellisenseModel context) : selectorBaseListener
    {
        public McfunctionIntellisenseModel mcfunctionContext = context;

        public int CursorOffset = 0;

        public bool GetTarget = false;

        /// <summary>
        /// 标记应该补全什么数据
        /// </summary>
        /// <param name="context"></param>
        public override void EnterEveryRule(ParserRuleContext context)
        {
            mcfunctionContext.IsCompleteSelectorParameters = true;
            if (!GetTarget && context.Start != null && context.Stop != null && context.Start.StartIndex <= CursorOffset && CursorOffset <= context.Stop.StopIndex + 1)
            {
                mcfunctionContext.IsCompleteSelectorParameterValues = context is not SelectorParametersContext && context is not ParameterContext;
                GetTarget = mcfunctionContext.IsCompleteSelectorParameterValues;
            }
        }
    }
}
