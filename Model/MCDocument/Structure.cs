namespace MinecraftLanguageServer.Model.MCDocument
{
    public class Structure
    {
        public string Identifier { get; set; } = "";
        public List<Prelim>? PrelimList { get; set; }
        public List<StructField>? StructFieldList { get; set; }
    }
}
