using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace MinecraftLanguageServer.MCDocumentService
{
    public class MCDocmentListener : mcdocBaseListener
    {
        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            string currentType = context.GetType().ToString().Replace("mccommandParser+", "").Replace("Radical", "").Replace("Context", "");
        }
    }
}
