using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class IndexedDTOTemplateBuilder : IDocumentDTOTemplateBuildStrategy
    {
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (schema.BaseType is not null)
            {
                currentDTO.TypeKind = schema.BaseType.Kind;
                if (schema.BaseType.Kind is MetaTypeKind.Dispatch && schema.BaseType.AttributeList is not null)
                {
                    // 复制调度器自身的 Resource / Index 等属性。
                    // 注意：这里不能把外层的 [value] / [modifier] 合并进 Index，
                    // 它只是 dispatch 结果上的字段访问器，不是调度索引本身。
                    foreach (var pair in schema.BaseType.AttributeList)
                    {
                        currentDTO.FeatureMap[pair.Key] = pair.Value;
                    }

                    if (schema.IndexKeyList?.Count > 0)
                    {
                        currentDTO.FeatureMap["Accessor"] = new MetaValue
                        {
                            Kind = MetaValueKind.List,
                            Items = [.. schema.IndexKeyList.Select(item => new MetaValue()
                            {
                                Kind = MetaValueKind.Literal,
                                LiteralValue = item
                            })]
                        };
                    }
                }
            }
            return currentDTO;
        }
    }
}
