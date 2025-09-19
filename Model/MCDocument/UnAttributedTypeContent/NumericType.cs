using static MinecraftLanguageServer.Model.MCDocument.MCDocumentEnum;

namespace MinecraftLanguageServer.Model.MCDocument.UnAttributedTypeContent
{
    public class NumericType
    {
        public BaseDataType BaseDataType { get; set; }
        public string? Range { get; set; }
        public int? Integer { get; set; }
    }
}