using MinecraftLanguageModelLibrary.Data;

namespace MinecraftLanguageServer.Interface
{
    public interface IDocumentDTOTemplateBuildStrategy
    {
        MetaTypeEditorFieldDTO Build(MetaType schema, 
            string fieldName = "", 
            bool isRequired = false, 
            string watermark = "", 
            HashSet<MetaType>? visitor = null);
    }
}
