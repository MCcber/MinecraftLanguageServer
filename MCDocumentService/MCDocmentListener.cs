using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MinecraftLanguageServer.Model;
using static mcdocParser;

namespace MinecraftLanguageServer.MCDocumentService
{
    public class MCDocmentListener : mcdocBaseListener
    {
        public MCDocmentListener(MCDocumentIntellisenseModel model)
        {

        }

        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            string currentType = context.GetType().ToString().Replace("mcdocParser+", "").Replace("Context", "");
            string value = context.GetText();
        }

        public override void EnterUseSentence([NotNull] UseSentenceContext context)
        {
            string useSentenceValue = context.GetText();
        }

        public override void EnterStructName([NotNull] StructNameContext context)
        {
            string structNameValue = context.GetText();
        }

        public override void EnterSummary([NotNull] SummaryContext context)
        {
            string summaryValue = context.GetText();
        }

        public override void EnterSuperInvoke([NotNull] SuperInvokeContext context)
        {

        }

        public override void EnterStructReference([NotNull] StructReferenceContext context)
        {

        }

        public override void EnterDocumentAttributes([NotNull] DocumentAttributesContext context)
        {
            string documentAttributesValue = context.GetText();
        }

        public override void EnterFields([NotNull] FieldsContext context)
        {
            string fieldValue = context.GetText();
        }
    }
}
