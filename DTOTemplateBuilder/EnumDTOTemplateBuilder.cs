using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class EnumDTOTemplateBuilder : IDocumentDTOTemplateBuildStrategy
    {
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (schema.EnumMemberList is not null)
            {
                currentDTO.EnumOptionList = new(schema.EnumMemberList);
                currentDTO.SelectedEnumOption = currentDTO.EnumOptionList?[0];
            }
            return currentDTO;
        }
    }
}
