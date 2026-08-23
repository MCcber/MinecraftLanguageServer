using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class ReferenceDTOTemplateBuilder : IDocumentDTOTemplateBuildStrategy
    {
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            // 引用在编辑器中可能显示为路径，或无法编辑
            currentDTO.Value = schema.ReferencePath ?? "";
            return currentDTO;
        }
    }
}
