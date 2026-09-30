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
            var currentDTO = MetaTypeEditorFieldDTODefaultBuilder.BuildDefault(schema, fieldName, true, watermark);

            //实参一律按位置登记，匿名与元组实参同样保留，客户端据此按位置绑定形参
            if (schema.TypeArgumentList is not null)
            {
                currentDTO.ActualTypeArguments = [];
                foreach (MetaType argumentType in schema.TypeArgumentList)
                {
                    currentDTO.ActualTypeArguments.Add(new MetaValue
                    {
                        Kind = MetaValueKind.Type,
                        TypeValue = argumentType
                    });
                }
            }

            if (schema.BaseType is not null)
            {
                //基类型是调度器或索引时没有具名定义可解析，直接归一化成调度器节点，
                //实参随 ActualTypeArguments 交给客户端填充调度目标的形参
                if (schema.BaseType.Kind is MetaTypeKind.Dispatch or MetaTypeKind.Indexed)
                {
                    var dispatchDTO = registry.Get(schema.BaseType.Kind).Build(schema.BaseType, fieldName, isRequired, watermark, visitor);
                    currentDTO.TypeKind = dispatchDTO.TypeKind;
                    currentDTO.FeatureMap = dispatchDTO.FeatureMap is null ? [] : new(dispatchDTO.FeatureMap);
                    currentDTO.Children = dispatchDTO.Children;
                    currentDTO.ElementType = dispatchDTO.ElementType;
                    return currentDTO;
                }

                //记录引用的目标泛型结构
                currentDTO.TypeName = schema.BaseType.Name ?? schema.BaseType.MetaTypeName ?? schema.BaseType.Identifier ?? schema.BaseType.LiteralValue?.ToString() ?? null;

                //递归构建BaseType的结构体本体，保留所有字段属性（包括版本）
                var baseTypeBuilder = registry.Get(schema.BaseType.Kind);
                var baseDto = baseTypeBuilder.Build(schema.BaseType, fieldName: fieldName, isRequired: isRequired, watermark, visitor);

                if (schema.BaseType.AttributeList is not null && baseDto.FeatureMap is not null)
                {
                    foreach (var attr in schema.BaseType.AttributeList)
                    {
                        currentDTO.FeatureMap[attr.Key] = attr.Value;
                    }
                }

                currentDTO.Children = baseDto.Children;
                currentDTO.Value = baseDto.Value;
            }
            return currentDTO;
        }
    }
}
