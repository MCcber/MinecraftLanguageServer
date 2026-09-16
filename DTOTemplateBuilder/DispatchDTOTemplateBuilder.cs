using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Service;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class DispatchDTOTemplateBuilder(DocumentDTOTemplateBuildStrategyRegistry registry) : IDocumentDTOTemplateBuildStrategy
    {
        private readonly DocumentDTOTemplateBuildStrategyRegistry registry = registry;

        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (schema.BaseType is not null)
            {
                // 尝试剥掉外层的Generic
                MetaType effectiveType = schema.BaseType;
                if (effectiveType.Kind is MetaTypeKind.Generic && effectiveType.TypeArgumentList?.Count == 1)
                {
                    effectiveType = effectiveType.TypeArgumentList[0];
                }

                // 递归构建实际类型
                var effectiveTemplateBuilder = registry.Get(effectiveType.Kind);
                var baseDto = effectiveTemplateBuilder.Build(effectiveType);

                if (effectiveType.AttributeList is not null && baseDto.FeatureMap is not null)
                {
                    foreach (var attr in effectiveType.AttributeList)
                    {
                        baseDto.FeatureMap[attr.Key] = attr.Value;
                    }
                }

                if (string.IsNullOrEmpty(currentDTO.FieldName))
                {
                    currentDTO.FieldName = schema.Name ?? schema.DispatcherResource ?? "";
                }
                currentDTO.TypeName ??= schema.MetaTypeName;
                currentDTO.Children = baseDto.Children;
                currentDTO.Value = baseDto.Value;

                // 如果调度的目标类型是联合体，需要把联合体的选项信息也复制过来
                // 否则 UnionTypeNameList / SelectedUnionChild 会丢失
                if (effectiveType.Kind is MetaTypeKind.Union)
                {
                    currentDTO.OriginKind = MetaTypeKind.Union;
                    currentDTO.UnionTypeNameList = baseDto.UnionTypeNameList;
                    currentDTO.SelectedUnionTypeName = baseDto.SelectedUnionTypeName;
                    currentDTO.SelectedUnionChildren = baseDto.SelectedUnionChildren is not null ? [.. baseDto.SelectedUnionChildren] : [];
                }
                else if (effectiveType.Kind is MetaTypeKind.List && baseDto.ElementType is not null)
                {
                    currentDTO.OriginKind = MetaTypeKind.List;
                    currentDTO.ElementType = baseDto.ElementType;
                }

                //在FeatureMap中记录原始泛型信息，便于调试，后续可删
                if (schema.BaseType.Kind is MetaTypeKind.Generic)
                {
                    currentDTO.FeatureMap ??= [];
                    currentDTO.FeatureMap["Generic"] = new()
                    {
                        Kind = MetaValueKind.Literal,
                        LiteralValue = schema.BaseType?.BaseType?.LiteralValue ?? ""
                    };
                }
            }
            return currentDTO;
        }
    }
}
