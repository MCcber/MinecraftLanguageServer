using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Service;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class GenericDTOTemplateBuilder(DocumentDTOTemplateBuildStrategyRegistry registry) : IDocumentDTOTemplateBuildStrategy
    {
        private readonly DocumentDTOTemplateBuildStrategyRegistry registry = registry;

        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (schema.BaseType is not null)
            {
                //记录引用的目标泛型结构
                currentDTO.TypeName = schema.BaseType.Name ?? schema.BaseType.MetaTypeName ?? schema.BaseType.Identifier ?? schema.BaseType.LiteralValue?.ToString() ?? null;

                //递归构建BaseType的结构体本体，保留所有字段属性（包括版本）
                var baseTypeBuilder = registry.Get(schema.BaseType.Kind);
                var baseDto = baseTypeBuilder.Build(schema.BaseType, fieldName: fieldName, isRequired: isRequired, watermark, visitor);

                if (schema.BaseType.AttributeList is not null && baseDto.FeatureMap is not null)
                {
                    currentDTO.FeatureMap ??= [];
                    foreach (var attr in schema.BaseType.AttributeList)
                    {
                        currentDTO.FeatureMap[attr.Key] = attr.Value;
                    }
                }

                currentDTO.Children = baseDto.Children;
                currentDTO.Value = baseDto.Value;
            }

            //从TypeArgumentList提取实参存入当前DTO
            if (schema.TypeArgumentList is not null)
            {
                currentDTO.TypeParameterNameList ??= [];
                for (int i = 0; i < schema.TypeArgumentList.Count; i++)
                {
                    if (schema.TypeArgumentList[i] is not null && schema.TypeArgumentList[i].AttributeList is not null)
                    {
                        foreach (var pair in schema.TypeArgumentList[i].AttributeList!)
                        {
                            if(string.IsNullOrEmpty(pair.Key))
                            {
                                continue;
                            }
                            currentDTO.TypeParameterNameList.Add(new Tuple<string, MetaValue>(pair.Key, pair.Value));
                        }
                    }
                    else if (schema.TypeArgumentList[i]?.LiteralValue is not null)
                    {
                        currentDTO.TypeParameterNameList.Add(new Tuple<string, MetaValue>(schema.TypeArgumentList[i].LiteralValue.ToString(), new() { Kind = MetaValueKind.Literal,LiteralValue = schema.TypeArgumentList[i].LiteralValue.ToString() }));
                    }
                }
            }
            return currentDTO;
        }
    }
}
