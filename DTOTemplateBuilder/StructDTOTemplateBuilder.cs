using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Service;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class StructDTOTemplateBuilder(DocumentDTOTemplateBuildStrategyRegistry registry) : IDocumentDTOTemplateBuildStrategy
    {
        #region Field
        private DocumentDTOTemplateBuildStrategyRegistry registry = registry;
        #endregion

        #region Method
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            currentDTO.Children = [];
            if (schema.FieldList is not null)
            {
                foreach (var metaField in schema.FieldList)
                {
                    // 从 MetaField 提取字段名、必填、注释
                    bool childRequired = metaField.IsRequired;
                    string childWatermark = metaField.Name;
                    var childBuilder = registry.Get(metaField.Type.Kind);
                    // 递归生成子字段 DTO
                    var childDTO = childBuilder.Build(metaField.Type, metaField.Name, childRequired, childWatermark);
                    currentDTO.Children.Add(childDTO);
                }
            }
            return currentDTO;
        } 
        #endregion
    }
}
