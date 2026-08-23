using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Service;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class ListDTOTemplateBuilder(DocumentDTOTemplateBuildStrategyRegistry registry) : IDocumentDTOTemplateBuildStrategy
    {
        #region Field
        private DocumentDTOTemplateBuildStrategyRegistry registry = registry;
        #endregion

        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (schema.ElementType is not null)
            {
                var elementTypeBuilder = registry.Get(schema.ElementType.Kind);
                currentDTO.ElementType = elementTypeBuilder.Build(schema.ElementType, fieldName, isRequired, watermark, visitor);

                if (schema.AttributeList is not null && currentDTO.FeatureMap is not null)
                {
                    foreach (var attr in schema.AttributeList)
                    {
                        currentDTO.FeatureMap[attr.Key] = attr.Value;
                    }
                }
            }
            return currentDTO;
        }
    }
}
