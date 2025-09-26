using MinecraftLanguageServer.Model.MCDocument.EnumContent;
using static MinecraftLanguageServer.Model.MCDocument.MCDocumentEnum;

namespace MinecraftLanguageServer.Model.MCDocument
{
    public class Enumeration
    {
        public Prelim? Prelim { get; set; }
        public EnumMemberType MemberType { get; set; }
        public string Name { get; set; }
        public List<EnumField> EnumFieldList { get; set; }
        public bool IsTop { get; set; } = true;
    }
}
