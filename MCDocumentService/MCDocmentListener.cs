using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MinecraftLanguageServer.Model.MCDocument;

namespace MinecraftLanguageServer.MCDocumentService
{
    public class MCDocmentListener : mcdocParserBaseListener
    {
        #region Field
        private MCDocumentFileModel result = new();

        private string identifier = "";
        private string stringValue = "";

        #endregion

        #region Method
        public MCDocumentFileModel GetResult()
        {
            return result;
        }
        #endregion

        #region Event
        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            string currentType = context.GetType().ToString().Replace("mcdocParser+", "").Replace("Context", "");
            string value = context.GetText();
        }

        public override void EnterIdentifier([NotNull] mcdocParser.IdentifierContext context)
        {
            base.EnterIdentifier(context);

        }

        public override void EnterUseStatement([NotNull] mcdocParser.UseStatementContext context)
        {
            base.EnterUseStatement(context);
            string value = context.GetText();
        }

        public override void EnterStructKey([NotNull] mcdocParser.StructKeyContext context)
        {
            base.EnterStructKey(context);
            string value = context.GetText();
        }

        public override void EnterTypeSentence([NotNull] mcdocParser.TypeSentenceContext context)
        {
            base.EnterTypeSentence(context);
            string value = context.GetText();
        }
        #endregion
    }
}
