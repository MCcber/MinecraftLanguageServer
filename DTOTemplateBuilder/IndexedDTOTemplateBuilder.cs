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
                    foreach (var pair in schema.BaseType.AttributeList)
                    {
                        currentDTO.FeatureMap[pair.Key] = pair.Value;
                    }
                    if (schema.IndexKeyList?.Count > 0 && !currentDTO.FeatureMap.TryAdd("Index", new MetaValue() { Kind = MetaValueKind.List, Items = [.. schema.IndexKeyList.Select(item => new MetaValue() { Kind = MetaValueKind.Literal, LiteralValue = item })] }))
                    {
                        var indexValue = currentDTO.FeatureMap["Index"];
                        if (indexValue.Kind is MetaValueKind.Literal)
                        {
                            indexValue.Items ??= [];
                            indexValue.Kind = MetaValueKind.List;
                            indexValue.Items.Add(new MetaValue() { Kind = MetaValueKind.Literal, LiteralValue = indexValue.LiteralValue?.ToString() });
                            indexValue.LiteralValue = null;
                        }
                        currentDTO.FeatureMap["Index"].Items!.AddRange(schema.IndexKeyList.Select(item => new MetaValue() { Kind = MetaValueKind.Literal, LiteralValue = item }));
                    }
                }
            }
            return currentDTO;
        }
    }
}
