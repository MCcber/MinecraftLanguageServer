using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Service;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    /// <summary>
    /// 方括号计算键（[K]: V）的模板：Tuple 元素 0 = 键类型，元素 1 = 值类型，
    /// 两个元素按各自类型递归生成模板，供验证器管线识别动态 Key Map。
    /// </summary>
    public class TupleDTOTemplateBuilder(DocumentDTOTemplateBuildStrategyRegistry registry) : IDocumentDTOTemplateBuildStrategy
    {
        #region Field
        private DocumentDTOTemplateBuildStrategyRegistry registry = registry;
        #endregion

        #region Method
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (schema.TupleElementTypeList is null)
            {
                return currentDTO;
            }

            currentDTO.Children = [];
            foreach (var elementType in schema.TupleElementTypeList)
            {
                currentDTO.Children.Add(registry.Get(elementType.Kind).Build(elementType, "", isRequired));
            }
            return currentDTO;
        }
        #endregion
    }
}
