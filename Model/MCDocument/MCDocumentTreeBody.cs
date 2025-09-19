namespace MinecraftLanguageServer.Model.MCDocument
{
    public class MCDocumentTreeBody
    {
        public List<PositionalValue>? PositionalValueList { get; set; }
        public List<NamedValue>? NamedValueList { get; set; }
        public Tuple<List<PositionalValue>, List<NamedValue>>? PositionalValueAndNamedValue { get; set; }
    }
}