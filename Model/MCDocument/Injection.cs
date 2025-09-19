using MinecraftLanguageServer.Model.MCDocument.InjectionContent;

namespace MinecraftLanguageServer.Model.MCDocument
{
    public class Injection
    {
        public EnumInjection? EnumInjection { get; set; }
        public StructInjection? StructInjection { get; set; }
    }
}
