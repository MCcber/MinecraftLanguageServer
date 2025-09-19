using static MinecraftLanguageServer.Model.MCDocument.MCDocumentEnum;

namespace MinecraftLanguageServer.Model.MCDocument
{
    public class PrimitiveArrayType
    {
        public PrimitiveArrayDataType DataType { get; set; }
        public string? Range { get; set; }
        public string? Count { get; set; }
    }
}