using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    public class ArrayDTOBuilder : IDocumentDTOTemplateBuildStrategy
    {
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
        {
            var result = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
            // 数组默认空，元素类型由 ElementType 决定，但首层无元素
            result.Items ??= [];
            if (schema.AttributeList is not null)
            {
                int lengthFromValue = 0;
                string elementType = "";
                if (schema.AttributeList.TryGetValue("LengthFrom", out MetaValue? lengthFrom) && lengthFrom is not null && lengthFrom.LiteralValue is not null)
                {
                    _ = int.TryParse(lengthFrom.LiteralValue.ToString(), out lengthFromValue);
                }
                if (schema.AttributeList.TryGetValue("ArrayType", out MetaValue? arrayType) && arrayType is not null && arrayType.LiteralValue is not null)
                {
                    elementType = arrayType.LiteralValue.ToString()!.Replace("List", "");
                }

                _ = Enum.TryParse(typeof(MetaTypeKind), elementType, out object? type);
                while (lengthFromValue > 0 && type is not null)
                {
                    result.Items.Add(new()
                    {
                        ID = "",
                        TypeKind = (MetaTypeKind)type,
                        Value = 0
                    });
                    if (schema.AttributeList.ContainsKey("uuid"))
                    {
                        result.TypeKind = MetaTypeKind.UUIDArray;
                    }
                    lengthFromValue--;
                }
            }
            return result;
        }
    }
}
