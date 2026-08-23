using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Service;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class UnionDTOTemplateBuilder(DocumentDTOTemplateBuildStrategyRegistry registry) : IDocumentDTOTemplateBuildStrategy
    {
        private readonly DocumentDTOTemplateBuildStrategyRegistry registry = registry;

        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            if (!string.IsNullOrEmpty(schema.Name) && schema.Name.Length > 0)
            {
                currentDTO.FieldName = schema.Name;
            }
            if (!string.IsNullOrEmpty(schema.MetaTypeName))
            {
                currentDTO.TypeName = schema.MetaTypeName;
            }
            // 联合默认选第一个选项
            if (schema.UnionOptionList?.Count > 0)
            {
                currentDTO.UnionTypeNameList ??= [];
                currentDTO.Children ??= [];
                for (int i = 0; i < schema.UnionOptionList.Count; i++)
                {
                    #region 递归解释、留存FeatureMap
                    var optionItem = schema.UnionOptionList[i];
                    var optionBuilder = registry.Get(optionItem.Kind);
                    MetaTypeEditorFieldDTO childDTO = optionBuilder.Build(optionItem, optionItem.Name ?? "");
                    childDTO.SetRequired(true);

                    if (optionItem.AttributeList is not null && childDTO.FeatureMap is not null)
                    {
                        foreach (var attr in optionItem.AttributeList)
                        {
                            childDTO.FeatureMap[attr.Key] = attr.Value;
                        }
                    }
                    #endregion

                    #region 设置联合体选项名称集合
                    string unionName = "";
                    if (!string.IsNullOrEmpty(optionItem.Name))
                    {
                        unionName = optionItem.Name;
                    }
                    else if (optionItem.Kind is MetaTypeKind.Dispatch or MetaTypeKind.Literal or MetaTypeKind.Struct)
                    {
                        unionName = "Object";
                    }
                    else if (!string.IsNullOrEmpty(optionItem.ReferencePath))
                    {
                        unionName = optionItem.Kind.ToString();
                    }
                    else if (!string.IsNullOrEmpty(optionItem.Identifier))
                    {
                        unionName = optionItem.Identifier;
                    }
                    else
                    {
                        unionName = optionItem.Kind.ToString();
                    }

                    EnumMember enumMember = new()
                    {
                        Name = unionName
                    };
                    if (optionItem.LiteralValue is not null)
                    {
                        enumMember.Value = new() { LiteralValue = optionItem.LiteralValue.ToString() };
                    }
                    currentDTO.UnionTypeNameList.Add(new EnumMember() { Name = unionName, Value = new MetaValue() { Kind = MetaValueKind.Literal, LiteralValue = unionName } });

                    currentDTO.Children.Add(childDTO);
                    #endregion
                }

                #region 设置已选中的联合体类型名与联合体类型
                if (currentDTO.UnionTypeNameList.Count > 0)
                {
                    currentDTO.SelectedUnionTypeName = currentDTO.UnionTypeNameList[0];
                }
                if (currentDTO.Children?.Count > 0 && currentDTO.Children[0].Children?.Count > 0)
                {
                    currentDTO.SelectedUnionChildren = [.. currentDTO.Children[0].Children!];
                }
                else if (currentDTO.Children?.Count > 0)
                {
                    currentDTO.SelectedUnionChildren = [currentDTO.Children[0]];
                }
                #endregion
            }
            return currentDTO;
        }
    }
}
