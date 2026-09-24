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
                // 业务过程：泛型 dispatch 目标不能直接把实参当成目标结构。
                // 例如 dispatch ... to Holder<struct Inner>，目标是 Holder<T>，不是 Inner。
                // 这里只保留泛型基类名与实参列表，真正的泛型替换交给客户端解析链完成。
                if (schema.BaseType.Kind is MetaTypeKind.Generic)
                {
                    MetaType genericBase = schema.BaseType.BaseType ?? new MetaType();
                    string genericName = genericBase.LiteralValue?.ToString()
                        ?? genericBase.Name
                        ?? genericBase.MetaTypeName
                        ?? genericBase.ReferencePath
                        ?? "";

                    currentDTO.TypeName = genericName;
                    currentDTO.TypeParameterNameList = [];
                    if (schema.BaseType.TypeArgumentList is not null)
                    {
                        for (int i = 0; i < schema.BaseType.TypeArgumentList.Count; i++)
                        {
                            currentDTO.TypeParameterNameList.Add(new Tuple<string, MetaValue>(
                                i.ToString(),
                                new MetaValue
                                {
                                    Kind = MetaValueKind.Type,
                                    TypeValue = schema.BaseType.TypeArgumentList[i]
                                }));
                        }
                    }

                    if (string.IsNullOrEmpty(currentDTO.FieldName))
                    {
                        currentDTO.FieldName = schema.Name ?? schema.DispatcherResource ?? "";
                    }

                    currentDTO.FeatureMap ??= [];
                    currentDTO.FeatureMap["Generic"] = new MetaValue
                    {
                        Kind = MetaValueKind.Literal,
                        LiteralValue = genericName
                    };
                }
                else
                {
                    MetaType effectiveType = schema.BaseType;
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
            }
            return currentDTO;
        }
    }
}
