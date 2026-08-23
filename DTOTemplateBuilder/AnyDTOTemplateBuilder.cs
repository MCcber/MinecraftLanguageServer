using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.Interface;
using MinecraftLanguageServer.Utility;

namespace MinecraftLanguageServer.DTOTemplateBuilder
{
    /// <summary>
    /// 兜底策略：处理 Any、Tuple、None、Identifier 等无特殊构建逻辑的类型，
    /// 仅生成默认模板（保留 schema.LiteralValue 原值，不做额外加工）。
    /// </summary>
    public class AnyDTOTemplateBuilder : IDocumentDTOTemplateBuildStrategy
    {
        public MetaTypeEditorFieldDTO Build(MetaType schema, string fieldName = "", bool isRequired = false, string watermark = "", HashSet<MetaType>? visitor = null)
            => MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, isRequired, watermark);
    }
}
