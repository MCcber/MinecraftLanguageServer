using MinecraftLanguageServer.Model.MCDocument.UnAttributedTypeContent;

namespace MinecraftLanguageServer.Model.MCDocument
{
    public class UnAttributedType
    {
        KeyWordType? KeyWordType { get; set; }
        StringType? StringType { get; set; }
        LiteralType? LiteralType { get; set; }
        NumericType? NumericType { get; set; }
        PrimitiveArrayType? PrimitiveArrayType { get; set; }
        ListType? ListType { get; set; }
        TupleType? TupleType { get; set; }
        EnumType? EnumType { get; set; }
        Structure? Structure { get; set; }
        ReferenceType? ReferenceType { get; set; }
        DispatchType? DispatchType { get; set; }
        UnionType? UnionType { get; set; }
        IndexOnAType? IndexOnAType { get; set; }
    }
}
