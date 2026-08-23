using MinecraftLanguageModelLibrary.Data;

namespace MinecraftLanguageServer.Service
{
    public static class MetaTypeDataViewModelGenerator
    {
        private static readonly DocumentDTOTemplateBuildStrategyRegistry registry = DocumentDTOTemplateBuildStrategyRegistry.Create();

        public static MetaTypeEditorFieldDTO StartBuildDTO(MetaType schema,string fieldName = "", bool isRequired = false, string watermark = "",HashSet<MetaType>? visitor = null)
        {
            #region 阻止自循环结构无限嵌套
            visitor ??= [];

            if (!visitor.Add(schema))
            {
                MetaTypeEditorFieldDTO result = new()
                {
                    ID = "",
                    TypeKind = schema.Kind,
                    FeatureMap = new(schema.AttributeList ?? []),
                    TypeName = schema.BaseType?.LiteralValue?.ToString(),
                    Watermark = watermark ?? "",
                    Value = schema.LiteralValue
                };
                result.SetRequired(isRequired);
                if (result.IsRequired)
                {
                    result.Value = result.GetDefaultValue();
                }
                return result;
            }
            #endregion

            #region 处理特供字段/属性
            var dtoTemplateBuilder = registry.Get(schema.Kind);
            var dto = dtoTemplateBuilder.Build(schema, fieldName, isRequired, watermark, visitor);
            #endregion

            return dto;
        }
    }
}