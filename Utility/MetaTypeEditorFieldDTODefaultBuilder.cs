using MinecraftLanguageModelLibrary.Data;

namespace MinecraftLanguageServer.Utility
{
    public static class MetaTypeEditorFieldDTODefaultBuilder
    {
        /// <summary>
        /// 实例化默认DTO模板
        /// </summary>
        /// <param name="schema"></param>
        /// <param name="fieldName"></param>
        /// <param name="isRequired"></param>
        /// <param name="watermark"></param>
        /// <returns></returns>
        public static MetaTypeEditorFieldDTO BuildDefault(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "")
        {
            #region Init
            var result = new MetaTypeEditorFieldDTO
            {
                ID = Guid.NewGuid().ToString(),
                TypeKind = schema.Kind,
                FieldName = fieldName,
                TypeName = schema.BaseType?.LiteralValue?.ToString(),
                Watermark = watermark ?? "",
                Value = schema.LiteralValue
            };
            result.SetRequired(isRequired);
            #endregion

            #region 处理通用字段/属性
            result.FeatureMap ??= [];
            result.FeatureMap = new(schema.AttributeList ?? []);

            //提取泛型形参 (定义阶段)
            // 如果这个 Schema 定义了形参（比如 type ItemStackOfComponent<T>）
            // 将其保存到 DTO 中，作为后续替换时的“模板参数名单”
            if (schema.MetaTypeParameterNameList is not null && schema.MetaTypeParameterNameList.Count > 0)
            {
                result.TypeParameterNameList ??= [];
                foreach (var pair in schema.MetaTypeParameterNameList)
                {
                    result.TypeParameterNameList.Add(new Tuple<string, MetaValue>(pair.Key, pair.Value));
                }
            }
            #endregion

            return result;
        }
    }
}
