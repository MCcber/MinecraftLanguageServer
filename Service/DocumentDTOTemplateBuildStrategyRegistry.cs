using MinecraftLanguageModelLibrary.Data;
using MinecraftLanguageServer.DTOTemplateBuilder;
using MinecraftLanguageServer.Interface;

namespace MinecraftLanguageServer.Service
{
    public class DocumentDTOTemplateBuildStrategyRegistry
    {
        private readonly Dictionary<MetaTypeKind, IDocumentDTOTemplateBuildStrategy> _strategies = [];

        public void Register(MetaTypeKind kind, IDocumentDTOTemplateBuildStrategy strategy)
            => _strategies[kind] = strategy;

        public IDocumentDTOTemplateBuildStrategy Get(MetaTypeKind kind)
            => _strategies.TryGetValue(kind, out var s) ? s : _strategies[MetaTypeKind.Any];

        /// <summary>
        /// 分配构造策略
        /// </summary>
        /// <param name="resource"></param>
        /// <param name="helper"></param>
        /// <returns></returns>
        public static DocumentDTOTemplateBuildStrategyRegistry Create()
        {
            DocumentDTOTemplateBuildStrategyRegistry registry = new();
            registry.Register(MetaTypeKind.Struct, new StructDTOTemplateBuilder(registry));
            registry.Register(MetaTypeKind.Union, new UnionDTOTemplateBuilder(registry));
            registry.Register(MetaTypeKind.Enum, new EnumDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Literal, new LiteralDTOTemplateBuilder());
            registry.Register(MetaTypeKind.ByteArray, new ArrayDTOBuilder());
            registry.Register(MetaTypeKind.IntArray, new ArrayDTOBuilder());
            registry.Register(MetaTypeKind.LongArray, new ArrayDTOBuilder());
            registry.Register(MetaTypeKind.UUIDArray, new ArrayDTOBuilder());
            registry.Register(MetaTypeKind.List, new ListDTOTemplateBuilder(registry));
            registry.Register(MetaTypeKind.Generic, new GenericDTOTemplateBuilder(registry));
            registry.Register(MetaTypeKind.Reference, new ReferenceDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Dispatch, new DispatchDTOTemplateBuilder(registry));
            registry.Register(MetaTypeKind.Indexed,new IndexedDTOTemplateBuilder());

            // 标量基础类型共用基础值策略（设置默认值）
            registry.Register(MetaTypeKind.Byte, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Short, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Int, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Long, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Float, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Double, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.String, new BaseTypeDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Boolean, new BaseTypeDTOTemplateBuilder());

            // 兜底类型：必须注册 Any，否则 Get 的兜底分支会在未注册 kind 时再次抛 KeyNotFoundException
            registry.Register(MetaTypeKind.Any, new AnyDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Tuple, new TupleDTOTemplateBuilder(registry));
            registry.Register(MetaTypeKind.None, new AnyDTOTemplateBuilder());
            registry.Register(MetaTypeKind.Identifier, new AnyDTOTemplateBuilder());

            return registry;
        }
    }
}
