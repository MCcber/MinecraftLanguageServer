using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using System.Text;
using static MCCommandParser;

namespace MinecraftLanguageServer.MCFunctionService
{
    /// <summary>
    /// 创建自定义的监听器类，继承自 mccommandBaseListener
    /// </summary>
    public class MCFunctionListener() : MCCommandParserBaseListener
    {
        #region Field
        public StringBuilder CommandPath { get; set; } = new();
        #endregion

        #region Event

        #region 处理顶层命令路径
        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            base.EnterEveryRule(context);
            string currentText = context.GetText();
            if (currentText.Length > 0 && context.Start.Text != "<EOF>")
            {
                CommandPath.Append(context.GetType().ToString().Replace("MCCommandParser+", "") + '.');
            }
        }
        #endregion

        #region 处理选择器参数
        public override void EnterSelectorParameter([NotNull] SelectorParameterContext context)
        {
            base.EnterSelectorParameter(context);
            if(context.Start.TokenSource is CommonTokenStream tokenStream && tokenStream.TokenSource is MCCommandLexer lexer)
            {
                lexer.InSelectorParameter = true;
            }
        }

        public override void ExitSelectorParameter([NotNull] SelectorParameterContext context)
        {
            base.ExitSelectorParameter(context);
            if (context.Start.TokenSource is CommonTokenStream tokenStream && tokenStream.TokenSource is MCCommandLexer lexer)
            {
                lexer.InSelectorParameter = false;
            }
        }
        #endregion

        #region 处理SNBT与NBT路径
        public override void EnterNbtPath([NotNull] NbtPathContext context)
        {
            base.EnterNbtPath(context);
            if (context.Start.TokenSource is CommonTokenStream tokenStream && tokenStream.TokenSource is MCCommandLexer lexer)
            {
                lexer.InSNbtContext = true;
            }
        }

        public override void ExitNbtPath([NotNull] NbtPathContext context)
        {
            base.ExitNbtPath(context);
            if (context.Start.TokenSource is CommonTokenStream tokenStream && tokenStream.TokenSource is MCCommandLexer lexer)
            {
                lexer.InSNbtContext = false;
            }
        }

        public override void EnterSNbt([NotNull] SNbtContext context)
        {
            base.EnterSNbt(context);
            if (context.Start.TokenSource is CommonTokenStream tokenStream && tokenStream.TokenSource is MCCommandLexer lexer)
            {
                lexer.InSNbtContext = true;
            }
        }

        public override void ExitSNbt([NotNull] SNbtContext context)
        {
            base.ExitSNbt(context);
            if (context.Start.TokenSource is CommonTokenStream tokenStream && tokenStream.TokenSource is MCCommandLexer lexer)
            {
                lexer.InSNbtContext = false;
            }
        }
        #endregion

        #endregion
    }
}
