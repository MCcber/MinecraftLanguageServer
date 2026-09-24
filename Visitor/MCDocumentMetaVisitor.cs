using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MinecraftLanguageModelLibrary.Data;
using System.Text.RegularExpressions;
using static mcdocParser;

namespace MinecraftLanguageServer.Visitor
{
    public partial class MCDocumentMetaVisitor : mcdocParserBaseVisitor<object>
    {
        #region Field
        public List<string> UsePathList { get; private set; } = [];

        /// <summary>
        /// 属性栈，隔离每一层的作用域
        /// </summary>
        private readonly Stack<Dictionary<string, MetaValue>> AttributeStack = [];
        /// <summary>
        /// 文档注释栈，隔离每一层的作用域
        /// </summary>
        private readonly Stack<List<string>> DocumentCommentStack = [];

        [GeneratedRegex(@"\s*(?:(?<from>[+-]?(?:\d+(?:\.\d+)?|\.\d+)(?:[eE][+-]?\d+)?)\s*\.\.\s*(?<to>[+-]?(?:\d+(?:\.\d+)?|\.\d+)(?:[eE][+-]?\d+)?)|(?<from>[+-]?(?:\d+(?:\.\d+)?|\.\d+)(?:[eE][+-]?\d+)?)\s*\.\.(?!\.)|(?<!\.)\.\.\s*(?<to>[+-]?(?:\d+(?:\.\d+)?|\.\d+)(?:[eE][+-]?\d+)?)|(?<from>[+-]?(?:\d+(?:\.\d+)?|\.\d+)(?:[eE][+-]?\d+)?))")]
        private static partial Regex GetValueOrLengthRange();
        #endregion

        #region Method
        /// <summary>
        /// 辅助：提取纯文本（跳过引号）
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        private static string StripQuotes(string s) => s?.Trim('"') ?? "";

        /// <summary>
        /// 辅助：从 token 文本里提取标识符
        /// </summary>
        /// <param name="node"></param>
        /// <returns></returns>
        private static string GetText(StructKeyContext node) => node.GetText() ?? "";

        /// <summary>
        ///解析别名指向的实际类型
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        private MetaType? ResolveAlias(TypeAliasContext context)
        {
            //获取别名本身的名称 (例如 "Conditions")
            string aliasName = context.identifier().GetText();
            MetaType resultType = new();

            //访问别名指向的具体结构
            if (Visit(context.typeSentence()) is MetaType type)
            {
                resultType = type;
                resultType.MetaTypeName = aliasName;
            }

            //处理泛型名称定义块 (typeParamBlock)
            var paramBlock = context.typeParamBlock();
            if (paramBlock is not null)
            {
                //获取块内所有的 typeParam 节点
                var paramsNodes = paramBlock.typeParam();
                if (paramsNodes?.Length > 0)
                {
                    resultType.MetaTypeParameterNameList ??= [];

                    for (int i = 0; i < paramsNodes.Length; i++)
                    {
                        MetaValue? typeParamValue = VisitTypeParam(paramsNodes[i]) as MetaValue;
                        if (typeParamValue is not null)
                        {
                            string key = typeParamValue.LiteralValue?.ToString() ?? "";
                            resultType.MetaTypeParameterNameList.TryAdd(key, new() { Kind = MetaValueKind.Literal,LiteralValue = key });
                        }
                    }
                }
            }

            return resultType;
        }

        /// <summary>
        /// 提取类型约束（长度范围、值范围）并应用到 MetaType 的 AttributeList 中
        /// </summary>
        /// <param name="context"></param>
        /// <param name="meta"></param>
        private static void ApplyTypeAndRangeConstraint(ParserRuleContext context, MetaType meta)
        {
            if (context is null)
            {
                return;
            }

            object? lengthFrom = null;
            object? lengthTo = null;
            object? valueFrom = null;
            object? valueTo = null;
            meta.AttributeList ??= [];
            string rangeText = string.Empty;
            Match rangeMatch;

            if (context is StringTypeContext stringTypeContext && stringTypeContext.integerRange() is not null)
            {
                rangeText = stringTypeContext.integerRange().GetText();
                rangeMatch = GetValueOrLengthRange().Match(rangeText);
                lengthFrom = rangeMatch.Groups["from"].Value;
                lengthTo = rangeMatch.Groups["to"].Value;
            }
            else if (context is NumericTypeContext numericTypeContext)
            {
                object? from = new(), to = new();
                if (numericTypeContext.integerRange() is not null)
                {
                    rangeText = numericTypeContext.integerRange().GetText();
                    rangeMatch = GetValueOrLengthRange().Match(rangeText);
                    from = rangeMatch.Groups["from"].Value;
                    to = rangeMatch.Groups["to"].Value;
                }
                else if (numericTypeContext.floatRange() is not null)
                {
                    rangeText = numericTypeContext.floatRange().GetText();
                    rangeMatch = GetValueOrLengthRange().Match(rangeText);
                    from = rangeMatch.Groups["from"].Value;
                    to = rangeMatch.Groups["to"].Value;
                }
                if (numericTypeContext.baseDataType().GetText() == "string")
                {
                    lengthFrom = from;
                    lengthTo = to;
                }
                else
                {
                    valueFrom = from;
                    valueTo = to;
                }
            }
            else if (context is PrimitiveArrayTypeContext primitiveArrayTypeContext && primitiveArrayTypeContext.integerRange() is not null)
            {
                if(primitiveArrayTypeContext.integerRange().Length == 0)
                {
                    return;
                }
                IntegerRangeContext? valueRange = primitiveArrayTypeContext.integerRange()[0];
                IntegerRangeContext? lengthRange = primitiveArrayTypeContext.integerRange()[^1];
                if(lengthRange == valueRange)
                {
                    lengthRange = null;
                }
                if (valueRange is not null)
                {
                    valueFrom = valueRange.Int()[0].GetText();
                    if (valueRange.Int().Length > 1)
                    {
                        valueTo = valueRange.Int()[1].GetText();
                    }
                }
                if (lengthRange is not null)
                {
                    lengthFrom = lengthRange.Int()[0].GetText();
                    if (lengthRange.Int().Length > 1)
                    {
                        lengthTo = lengthRange.Int()[1].GetText();
                    }
                }
            }
            else if (context is ListTypeContext listTypeContext && listTypeContext.integerRange() is not null)
            {
                IntegerRangeContext integerRangeContext = listTypeContext.integerRange();
                if(integerRangeContext.Int().Length == 0)
                {
                    return;
                }
                lengthFrom = integerRangeContext.Int()[0].GetText();
                if (integerRangeContext.Int().Length > 1)
                {
                    lengthTo = integerRangeContext.Int()[1].GetText();
                }
            }

            if (lengthFrom is not null)
            {
                meta.AttributeList["LengthFrom"] = new()
                {
                    Kind = MetaValueKind.Literal,
                    LiteralValue = lengthFrom
                };
            }
            if (lengthTo is not null)
            {
                meta.AttributeList["LengthTo"] = new()
                {
                    Kind = MetaValueKind.Literal,
                    LiteralValue = lengthTo
                };
            }
            if (valueFrom is not null)
            {
                meta.AttributeList["ValueFrom"] = new()
                {
                    Kind = MetaValueKind.Literal,
                    LiteralValue = valueFrom
                };
            }
            if (valueTo is not null)
            {
                meta.AttributeList["ValueTo"] = new()
                {
                    Kind = MetaValueKind.Literal,
                    LiteralValue = valueTo
                };
            }
        }

        /// <summary>
        ///解析单个namedValue
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        private MetaNamedValue ParseNamedValue(NamedValueContext context)
        {
            var name = context.identifier()?.GetText() ?? StripQuotes(context.@string()?.GetText() ?? "");
            MetaValue value;

            if (context.value() is not null)
            {
                value = Visit(context.value()) as MetaValue ?? new MetaValue();
            }
            else if (context.treeValue() is not null)
            {
                value = Visit(context.treeValue()) as MetaValue ?? new MetaValue();
            }
            else
            {
                value = new MetaValue();
            }

            return new MetaNamedValue { Name = name, Value = value };
        }

        public override object VisitDocCommentary(DocCommentaryContext context)
        {
            if (DocumentCommentStack.Count == 0 || context is null)
            {
                return 0;
            }
            List<string> targetList = DocumentCommentStack.Peek();
            targetList.Add(context.GetText());
            return 0;
        }

        public override object VisitAttribute(AttributeContext context)
        {
            if (AttributeStack.Count == 0 || context is null)
            {
                return 0;
            }
            var target = AttributeStack.Peek();

            var key = context.identifier()?.GetText();
            if (key is null)
            {
                return 0;
            }

            MetaValue? value = null;
            if (context.value() is not null)
            {
                value = Visit(context.value()) as MetaValue;
            }
            else if (context.treeValue() is not null)
            {
                value = Visit(context.treeValue()) as MetaValue;
            }

            if (value is not null)
            {
                target[key] = value;
            }

            //返回任意值，不会使用
            return 0;
        }

        public override object VisitPrelim(PrelimContext context)
        {
            if(context is null)
            {
                return 0;
            }

            if (context.docCommentary() is not null)
            {
                var documentCommentaryArray = context.docCommentary();
                for (int i = 0; i < documentCommentaryArray.Length; i++)
                {
                    Visit(documentCommentaryArray[i]);
                }
            }

            AttributeContext[] attributeContextArray = context.attribute();
            if (AttributeStack.Count > 0 && attributeContextArray is not null)
            {
                for (int i = 0; i < attributeContextArray.Length; i++)
                {
                    Visit(attributeContextArray[i]);
                }
            }

            return 0;
        }
        #endregion

        #region VisitorMethod
        public override object VisitFile(FileContext context)
        {
            var types = new List<MetaType>();

            foreach (var child in context.children)
            {
                if (child is UseStatementContext useContext)
                {
                    var path = useContext.path()?.GetText();
                    if (!string.IsNullOrEmpty(path))
                    {
                        UsePathList.Add(path);
                    }
                }
                else if (child is TypeAliasContext aliasContext)
                {
                    var alias = ResolveAlias(aliasContext);
                    if (alias is not null)
                    {
                        types.Add(alias);
                    }
                }
                else if (child is StructContext ||
                        child is EnumTypeContext ||
                        child is DispatchStatementContext ||
                        child is InjectionContext)
                {
                    var result = Visit(child);
                    if (result is MetaType metaType)
                    {
                        types.Add(metaType);
                    }
                }
            }
            return types;
        }

        public override object VisitStruct(StructContext context)
        {
            var meta = new MetaType
            {
                Kind = MetaTypeKind.Struct,
                Name = context.identifier()?.GetText()
            };

            PrelimContext prelimContext = context.prelim();
            if (prelimContext is not null)
            {
                DocumentCommentStack.Push([]);
                AttributeStack.Push([]);
                Visit(prelimContext);

                meta.DocumentComments ??= "";
                meta.DocumentComments += string.Join(',', DocumentCommentStack.Pop());

                // 提取当前层级的注解属性
                var typeAttributes = AttributeStack.Pop();
                if (typeAttributes.Count > 0)
                {
                    meta.AttributeList ??= [];
                    // 将外层属性追加/合并到现有的属性集合中，而不是覆盖它
                    foreach (var pair in typeAttributes)
                    {
                        meta.AttributeList[pair.Key] = pair.Value;
                    }
                }
            }

            // 获取 structBlock
            var block = context.structBlock();
            meta.FieldList = block switch
            {
                StructBlockContext sb => sb.structField()?
                    .Select(metaField => (MetaField)Visit(metaField))
                    .ToList() ?? [],
                _ => []
            };

            return meta;
        }

        public override object VisitStructField(StructFieldContext context)
        {
            var field = new MetaField()
            {
                Type = new(),
            };

            //方括号计算键（如 [K]）的类型：元素 0 = 键类型，元素 1 = 值类型
            MetaType keyElementType = null;
            MetaType valueElementType = null;

            var key = context.structKey();
            if (key is not null)
            {
                if (key.typeSentence() is not null)
                {
                    var keyTypeSentence = Visit(key.typeSentence());
                    if(keyTypeSentence is MetaType keyMetaType)
                    {
                        if (keyMetaType.AttributeList is not null)
                        {
                            field.Type.AttributeList ??= [];
                            foreach (var pair in keyMetaType.AttributeList)
                            {
                                field.Type.AttributeList[pair.Key] = pair.Value;
                            }
                        }
                        else if (keyMetaType.Kind is MetaTypeKind.Literal && keyMetaType.LiteralValue is string keyMetaTypeString && !string.IsNullOrEmpty(keyMetaTypeString))
                        {
                            field.Name = keyMetaTypeString;
                            field.Type.MetaTypeName = keyMetaTypeString;
                        }

                        keyElementType = keyMetaType;
                    }
                }
                else
                {
                    field.Name = GetText(key);
                }
            }
            else
            {
                field.IsSpread = context.tripleDot() is not null;
            }

            field.IsRequired = context.questionMark() is null;


            PrelimContext prelimContext = context.prelim();
            if (prelimContext is not null)
            {
                DocumentCommentStack.Push([]);
                AttributeStack.Push([]);
                Visit(prelimContext);

                field.DocumentComments ??= "";
                field.DocumentComments += string.Join(',', DocumentCommentStack.Pop());

                // 提取当前层级的注解属性
                var typeAttributes = AttributeStack.Pop();
                if (typeAttributes.Count > 0)
                {
                    field.AttributeList ??= [];
                    // 将外层属性追加/合并到现有的属性集合中，而不是覆盖它
                    foreach (var pair in typeAttributes)
                    {
                        field.AttributeList[pair.Key] = pair.Value;
                    }
                }
            }

            if (context.typeSentence() is not null)
            {
                var typeResult = Visit(context.typeSentence());
                if (typeResult is MetaType metaType)
                {
                    valueElementType = metaType;
                    field.Type.LiteralValue ??= metaType.LiteralValue;
                    field.Type.MemberMinValue ??= metaType.MemberMinValue;
                    field.Type.MemberMaxValue ??= metaType.MemberMaxValue;
                    field.Type.BaseType ??= metaType.BaseType;
                    field.Type.ElementType ??= metaType.ElementType;
                    field.Type.Kind = metaType.Kind;
                    field.Type.Name ??= metaType.Name;
                    field.Type.MetaTypeName ??= metaType.MetaTypeName;
                    field.Type.MinLength ??= metaType.MinLength;
                    field.Type.MaxLength ??= metaType.MaxLength;
                    field.Type.DocumentComments ??= metaType.DocumentComments;

                    if (metaType.FieldList is not null)
                    {
                        field.Type.FieldList ??= [];
                        field.Type.FieldList.AddRange(metaType.FieldList);
                    }
                    if (metaType.AttributeList is not null)
                    {
                        Dictionary<string, MetaValue> keyValuePairs = [];
                        field.Type.AttributeList ??= keyValuePairs;

                        keyValuePairs = field.Type.AttributeList;

                        foreach (var pair in metaType.AttributeList)
                        {
                            keyValuePairs[pair.Key] = pair.Value;
                        }
                    }
                    if (field.AttributeList is not null)
                    {
                        Dictionary<string, MetaValue> keyValuePairs = [];
                        field.Type.AttributeList ??= keyValuePairs;
                        keyValuePairs = field.Type.AttributeList;
                        foreach (var pair in field.AttributeList)
                        {
                            keyValuePairs[pair.Key] = pair.Value;
                        }
                    }

                    if (metaType.EnumMemberList is not null)
                    {
                        field.Type.EnumMemberList ??= [];
                        field.Type.EnumMemberList.AddRange(metaType.EnumMemberList);
                    }
                    if(metaType.MetaTypeParameterNameList is not null)
                    {
                        field.Type.MetaTypeParameterNameList ??= [];
                        foreach (var pair in metaType.MetaTypeParameterNameList)
                        {
                            field.Type.MetaTypeParameterNameList[pair.Key] = pair.Value;
                        }
                    }
                    if(metaType.TupleElementTypeList is not null)
                    {
                        field.Type.TupleElementTypeList ??= [];
                        field.Type.TupleElementTypeList.AddRange(metaType.TupleElementTypeList);
                    }
                    if(metaType.TypeArgumentList is not null)
                    {
                        field.Type.TypeArgumentList ??= [];
                        field.Type.TypeArgumentList.AddRange(metaType.TypeArgumentList);
                    }
                    if (metaType.UnionOptionList is not null)
                    {
                        field.Type.UnionOptionList ??= [];
                        field.Type.UnionOptionList.AddRange(metaType.UnionOptionList);
                    }
                }
                else
                {
                    field.Type = new MetaType
                    {
                        Kind = MetaTypeKind.Any,
                        Name = context.typeSentence().GetText()
                    };
                }
            }

            //方括号计算键：字段类型标记为 Tuple，供验证器管线识别动态 Key Map
            if (keyElementType is not null && valueElementType is not null)
            {
                field.Type.Kind = MetaTypeKind.Tuple;
                field.Type.TupleElementTypeList = [keyElementType, valueElementType];
            }

            if (field.IsSpread)
            {
                field.Name = string.Empty;
            }
            return field;
        }

        public override object VisitStructKey(StructKeyContext context)
        {
            // 可以返回字符串或 MetaType，这里直接返回其文本，由 VisitStructField 处理
            return context.GetText();
        }

        public override object VisitEnumType(EnumTypeContext context)
        {
            var meta = new MetaType
            {
                Kind = MetaTypeKind.Enum,
                Name = context.identifier()?.GetText()
            };

            PrelimContext prelim = context.prelim();
            if (prelim is not null)
            {
                DocumentCommentStack.Push([]);
                AttributeStack.Push([]);
                Visit(prelim);

                meta.DocumentComments ??= "";
                meta.DocumentComments = string.Join(',', DocumentCommentStack.Pop());

                // 提取当前层级的注解属性
                var typeAttributes = AttributeStack.Pop();
                if (typeAttributes.Count > 0)
                {
                    meta.AttributeList ??= [];
                    // 将外层属性追加/合并到现有的属性集合中，而不是覆盖它
                    foreach (var pair in typeAttributes)
                    {
                        meta.AttributeList[pair.Key] = pair.Value;
                    }
                }
            }

            // 底层类型
            var underlying = context.enumMemberType()?.GetText()?.ToLower();
            meta.EnumUnderlyingType = new MetaType
            {
                Kind = underlying switch
                {
                    "byte" => MetaTypeKind.Byte,
                    "short" => MetaTypeKind.Short,
                    "int" => MetaTypeKind.Int,
                    "long" => MetaTypeKind.Long,
                    "float" => MetaTypeKind.Float,
                    "double" => MetaTypeKind.Double,
                    "string" => MetaTypeKind.String,
                    _ => MetaTypeKind.Int
                }
            };

            // 从 enumBlock 获取成员
            var block = context.enumBlock();
            meta.EnumMemberList = block switch
            {
                EnumBlockContext eb => eb.enumField()?
                    .Select(f => (EnumMember)Visit(f))
                    .ToList() ?? [],
                _ => []
            };

            return meta;
        }

        public override object VisitEnumField(EnumFieldContext context)
        {
            var member = new EnumMember
            {
                Name = context.identifier()?.GetText()
            };

            PrelimContext prelimContext = context.prelim();
            if (prelimContext is not null)
            {
                DocumentCommentStack.Push([]);
                AttributeStack.Push([]);
                Visit(prelimContext);

                member.Documentation ??= "";
                member.Documentation += string.Join(',', DocumentCommentStack.Pop());

                // 提取当前层级的注解属性
                var typeAttributes = AttributeStack.Pop();
                if (typeAttributes.Count > 0)
                {
                    member.FeatureMap ??= [];
                    // 将外层属性追加/合并到现有的属性集合中，而不是覆盖它
                    foreach (var pair in typeAttributes)
                    {
                        member.FeatureMap[pair.Key] = pair.Value;
                    }
                }
            }

            var valueContext = context.enumValue();
            if (valueContext is not null)
            {
                object result = Visit(valueContext);
                member.Value = result as MetaValue;
                // 安全拆包示例：
                //if (result is ValueTuple<decimal, char> tuple)
                //{
                //    // 成功匹配为元组
                //    string suffixString = tuple.Item2 == '\0' ? "" : tuple.Item2.ToString();
                //    member.Value = tuple.Item1;

                //    if (!string.IsNullOrWhiteSpace(suffixString))
                //    {
                //        member.Unit = char.Parse(suffixString);
                //    }
                //}
                //else
                //{

                //}
            }

            return member;
        }

        public override object VisitEnumValue(EnumValueContext context)
        {
            var mv = new MetaValue { Kind = MetaValueKind.Literal };
            if (context.typedNumber() is not null)
            {
                var result = Visit(context.typedNumber());
                if (result is ValueTuple<decimal, char> tuple)
                {
                    mv.LiteralValue = tuple.Item2 == '\0' ? tuple.Item1 : $"{tuple.Item1}{tuple.Item2}";
                }
            }
            else
            {
                mv.LiteralValue = StripQuotes(context.GetText());
            }
            return mv;
        }

        public override object VisitTypeParam(TypeParamContext context)
        {
            if (context is null)
            {
                return null;
            }
            MetaValue result = new() { Kind = MetaValueKind.Literal,LiteralValue = context.GetText() };
            return result;
        }

        public override object VisitTypeParamBlock([NotNull] TypeParamBlockContext context)
        {
            var typeParamArray = context.typeParam();
            List<MetaValue> resultList = [];
            for (int i = 0; i < typeParamArray.Length; i++)
            {
                MetaValue? metaValue = Visit(typeParamArray[i]) as MetaValue;
                if (metaValue is not null)
                {
                    resultList.Add(metaValue);
                }
            }
            return resultList;
        }

        /// <summary>
        /// TypedNumber（用于 enum value 和 literal）
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitTypedNumber(TypedNumberContext context)
        {
            var text = context.GetText().Trim();

            if(string.IsNullOrEmpty(text))
            {
                return "";
            }

            char lastChar = text[^1];

            //判断最后一个字符是不是字母后缀
            if (char.IsLetter(lastChar))
            {
                //剥离后缀再去 Parse，防止 FormatException
                if (decimal.TryParse(text[..^1], out decimal val))
                {
                    return (val, lastChar);
                }
            }
            else
            {
                //没有后缀的情况，安全返回一个空字符作为默认后缀
                if (decimal.TryParse(text, out decimal val))
                {
                    return (val, '\0');
                }
            }

            return text;
        }

        public override object VisitDispatchStatement(DispatchStatementContext context)
        {
            var meta = new MetaType
            {
                Kind = MetaTypeKind.Dispatch,
            };

            #region 整理注释与属性标注
            PrelimContext prelim = context.prelim();
            meta.AttributeList ??= [];
            if (prelim is not null)
            {
                DocumentCommentStack.Push([]);
                AttributeStack.Push([]);
                Visit(prelim);

                meta.DocumentComments ??= "";
                meta.DocumentComments += string.Join(',', DocumentCommentStack.Pop());

                // 提取当前层级的注解属性
                var typeAttributes = AttributeStack.Pop();
                if (typeAttributes.Count > 0)
                {
                    // 将外层属性追加/合并到现有的属性集合中，而不是覆盖它
                    foreach (var pair in typeAttributes)
                    {
                        meta.AttributeList[pair.Key] = pair.Value;
                    }
                }
            }
            #endregion

            #region 整理调度器资源路径与索引成员
            // 将 resource 和 index 作为特殊属性存入 AttributeList
            var resource = context.resourceLocation()?.GetText();
            // 解析 indexBody 为索引键列表
            var indexBodyContext = context.indexBody();
            List<string> indexKeys = [];
            if (indexBodyContext is not null)
            {
                foreach (var idx in indexBodyContext.index())
                {
                    // 每个 index 可能是 staticIndexKey（字符串/标识符等）或 dynamicIndex
                    // 简单处理：取其文本并去引号
                    string indexString = StripQuotes(idx.GetText());
                    indexKeys.Add(indexString);
                }
                if (indexKeys.Count > 1)
                {
                    meta.AttributeList["Index"] = new MetaValue { Kind = MetaValueKind.List, Items = [.. indexKeys.Select(k => new MetaValue { Kind = MetaValueKind.Literal, LiteralValue = k })] };
                }
                else if (indexKeys.Count == 1)
                {
                    meta.AttributeList["Index"] = new MetaValue { Kind = MetaValueKind.Literal, LiteralValue = indexKeys[0] };
                }

                // 设置调度器资源标识符，使其可以通过索引值在 DocumentItemMap 中被查找到
                // 例如 dispatch minecraft:data_component[attribute_modifiers] to (...)
                // 会将 DispatcherResource 设置为 "attribute_modifiers"
                meta.DispatcherResource = indexKeys[0];
            }

            if (!string.IsNullOrEmpty(resource))
            {
                meta.AttributeList["Resource"] = new MetaValue() { LiteralValue = resource };
            }
            #endregion

            #region 解析内嵌的类型
            if (context.typeSentence() is not null)
            {
                meta.BaseType = (MetaType)Visit(context.typeSentence());

                //防止类型名撞键
                meta.Name = Guid.NewGuid().ToString();

                if (meta.BaseType.BaseType?.Kind is MetaTypeKind.Literal && meta.BaseType.BaseType.LiteralValue is not null)
                {
                    meta.MetaTypeName = meta.BaseType.BaseType.LiteralValue.ToString();
                }
                else if (!string.IsNullOrEmpty(meta.BaseType.Name))
                {
                    meta.MetaTypeName = meta.BaseType.Name;
                }
            }
            #endregion

            #region 解析内嵌的泛型结构
            if (context.typeParamBlock() is not null)
            {
                List<MetaValue>? typeParamBlock = Visit(context.typeParamBlock()) as List<MetaValue>;
                if (typeParamBlock is not null)
                {
                    meta.MetaTypeParameterNameList ??= [];
                    for (int i = 0; i < typeParamBlock.Count; i++)
                    {
                        string? literalValueString = typeParamBlock[i].LiteralValue?.ToString();
                        if (literalValueString is not null)
                        {
                            meta.MetaTypeParameterNameList.Add(literalValueString, typeParamBlock[i]);
                        }
                    }
                }
            }
            #endregion

            return meta;
        }

        public override object VisitTypeSentence(TypeSentenceContext context)
        {
            MetaType baseType = new();
            if (context.unAttributedType() is not null)
            {
                object unAttributeTypeResult = Visit(context.unAttributedType());
                if (unAttributeTypeResult is MetaType unAttributeTypeMetaType)
                {
                    baseType = unAttributeTypeMetaType;
                }
                else
                {
                    baseType = new MetaType { Kind = MetaTypeKind.Any };
                }
            }

            // 处理 indexBody / typeArgBlock 构成的后缀链
            var indexes = context.indexBody();
            var argsBlocks = context.typeArgBlock();
            MetaType result = baseType;

            // 类型自身的属性（不是注释）
            AttributeContext[] attributeArray = context.attribute();
            if (attributeArray is not null)
            {
                AttributeStack.Push([]);
                for (int i = 0; i < attributeArray.Length; i++)
                {
                    Visit(attributeArray[i]);
                }
                // 提取当前层级的注解属性
                var typeAttributes = AttributeStack.Pop();
                if (typeAttributes.Count > 0)
                {
                    result.AttributeList ??= [];
                    // 将外层属性追加/合并到现有的属性集合中，而不是覆盖它
                    foreach (var pair in typeAttributes)
                    {
                        result.AttributeList[pair.Key] = pair.Value;
                    }
                }
            }

            foreach (var ib in indexes)
            {
                var indexed = new MetaType
                {
                    Kind = MetaTypeKind.Indexed,
                    BaseType = result,
                    IndexKeyList = ib.index()?.Select(i => i.GetText()).ToList()
                };
                result = indexed;
            }

            foreach (var ab in argsBlocks)
            {
                var generic = new MetaType
                {
                    Kind = MetaTypeKind.Generic,
                    BaseType = result,
                    TypeArgumentList = ab.typeSentence()?.Select(ts => (MetaType)Visit(ts)).ToList()
                };
                result = generic;
            }

            result ??= new();
            // 注释不处理，保持 null
            return result;
        }

        /// <summary>
        /// UnAttributedType 分支
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitUnAttributedType(UnAttributedTypeContext context)
        {
            // 根据实际存在的子节点判断种类
            if (context.keywordType() is not null)
                return Visit(context.keywordType());
            if (context.stringType() is not null)
                return Visit(context.stringType());
            if (context.literalType() is not null)
                return Visit(context.literalType());
            if (context.numericType() is not null)
                return Visit(context.numericType());
            if (context.primitiveArrayType() is not null)
                return Visit(context.primitiveArrayType());
            if (context.listType() is not null)
                return Visit(context.listType());
            if (context.tupleType() is not null)
                return Visit(context.tupleType());
            if (context.enumType() is not null)
                return Visit(context.enumType());
            if (context.@struct() is not null)
                return Visit(context.@struct());
            if (context.referenceType() is not null)
                return Visit(context.referenceType());
            if (context.dispatcherType() is not null)
                return Visit(context.dispatcherType());
            if (context.unionType() is not null)
                return Visit(context.unionType());
            if (context.indexingOnAType() is not null)
                return Visit(context.indexingOnAType());
            return 0;
        }

        /// <summary>
        /// 具体基础类型
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitKeywordType(KeywordTypeContext context)
        {
            var text = context.GetText().Trim();
            if (text == "any")
            {
                return new MetaType { Kind = MetaTypeKind.Any };
            }
            if(text == "boolean")
            {
                return new MetaType { Kind = MetaTypeKind.Boolean };
            }
            // boolValue 由 literalType 处理，这里一般不会单独出现，但还是处理下
            if (text == "true" || text == "false")
            {
                return new MetaType { Kind = MetaTypeKind.Boolean, LiteralValue = bool.Parse(text) };
            }
            return 0;
        }

        public override object VisitStringType(StringTypeContext context)
        {
            var meta = new MetaType { Kind = MetaTypeKind.String };
            ApplyTypeAndRangeConstraint(context, meta);
            return meta;
        }

        public override object VisitBaseDataType([NotNull] BaseDataTypeContext context)
        {
            string text = context.GetText();
            if (text == "boolean")
            {
                var meta = new MetaType { Kind = MetaTypeKind.Boolean };
                return meta;
            }
            else
            {
                return new MetaType { Kind = MetaTypeKind.Byte };
            }
        }

        public override object VisitLiteralType(LiteralTypeContext context)
        {
            var meta = new MetaType { Kind = MetaTypeKind.Literal };
            if (context.boolValue() is not null)
            {
                meta.Kind = MetaTypeKind.Boolean;
                meta.LiteralValue = bool.Parse(context.boolValue().GetText());
            }
            else if (context.typedNumber() is not null)
            {
                meta.LiteralValue = Visit(context.typedNumber());
            }
            else if (context.@string() is not null)
            {
                meta.LiteralValue = StripQuotes(context.@string().GetText());
            }
            else if (context.identifier() is not null)
            {
                meta.LiteralValue = context.identifier().GetText();
            }
            return meta;
        }

        public override object VisitNumericType(NumericTypeContext context)
        {
            var baseText = context.baseDataType()?.GetText().ToLower();
            var kind = baseText switch
            {
                "string" => MetaTypeKind.String,
                "byte" => MetaTypeKind.Byte,
                "short" => MetaTypeKind.Short,
                "int" => MetaTypeKind.Int,
                "long" => MetaTypeKind.Long,
                "float" => MetaTypeKind.Float,
                "double" => MetaTypeKind.Double,
                "boolean" => MetaTypeKind.Boolean,
                _ => MetaTypeKind.Int
            };
            var meta = new MetaType { Kind = kind };
            ApplyTypeAndRangeConstraint(context, meta);
            return meta;
        }

        public override object VisitPrimitiveArrayType(PrimitiveArrayTypeContext context)
        {
            var meta = new MetaType { Kind = MetaTypeKind.IntArray };
            var text = context.GetText();
            var typeName = text.Split('[')[0].Trim().ToLower();
            // 提取元素类型：如 "int[]" 或 "byte[]@1.."
            switch (typeName)
            {
                case "byte":
                    {
                        meta.Kind = MetaTypeKind.ByteArray;
                        break;
                    }
                case "int":
                    {
                        meta.Kind = MetaTypeKind.IntArray;
                        break;
                    }
                case "long":
                    {
                        meta.Kind = MetaTypeKind.LongArray;
                        break;
                    }
            }
            ApplyTypeAndRangeConstraint(context, meta);
            if (meta.AttributeList is not null)
            {
                meta.AttributeList["ArrayType"] = new()
                {
                    Kind = MetaValueKind.Literal,
                    LiteralValue = string.Create(typeName.Length, typeName, (chars, state) =>
                    {
                        chars[0] = char.ToUpperInvariant(state[0]);
                        for (int i = 1; i < state.Length; i++)
                        {
                            chars[i] = char.ToLowerInvariant(state[i]);
                        }
                    }) + "List"
                };
            }
            return meta;
        }

        public override object VisitListType(ListTypeContext context)
        {
            var meta = new MetaType { Kind = MetaTypeKind.List };
            ApplyTypeAndRangeConstraint(context, meta);
            if (context.typeSentence() is not null)
            {
                meta.ElementType = (MetaType)Visit(context.typeSentence());
            }
            return meta;
        }

        public override object VisitTupleType(TupleTypeContext context)
        {
            var meta = new MetaType
            {
                Kind = MetaTypeKind.Tuple,
                TupleElementTypeList = context.typeSentence()
                    ?.Select(ts => (MetaType)Visit(ts))
                    .ToList()
            };
            return meta;
        }

        public override object VisitUnionType(UnionTypeContext context)
        {
            var meta = new MetaType
            {
                Kind = MetaTypeKind.Union,
                UnionOptionList = context.typeSentence()
                    ?.Select(ts => (MetaType)Visit(ts))
                    .ToList()
            };
            return meta;
        }

        public override object VisitIdentifier([NotNull] IdentifierContext context)
        {
            var identifier = context.GetText();

            // 否则返回普通引用
            return new MetaType
            {
                Kind = MetaTypeKind.String,
                Identifier = identifier
            };
        }

        public override object VisitReferenceType(ReferenceTypeContext context)
        {
            var path = context.GetText();

            // 否则返回普通引用
            return new MetaType
            {
                Kind = MetaTypeKind.Reference,
                ReferencePath = path
            };
        }

        public override object VisitInjection(InjectionContext context)
        {
            // 只会是 enumInjection 或 structInjection
            if (context.enumInjection() is not null)
                return Visit(context.enumInjection());
            if (context.structInjection() is not null)
                return Visit(context.structInjection());
            return 0;
        }

        public override object VisitEnumInjection(EnumInjectionContext context)
        {
            var injectedEnum = (MetaType)Visit(context.enumBlock()); // 你已经能解析 enumBlock
            if (injectedEnum is null)
            {
                return 0;
            }
            // 确保 injectedEnum 的 Kind 是 Enum
            return injectedEnum;
        }

        public override object VisitStructInjection(StructInjectionContext context)
        {
            var injectedStruct = (MetaType)Visit(context.structBlock()); // 解析注入的 structBlock
            if (injectedStruct == null)
            {
                return 0;
            }

            return injectedStruct;
        }

        public override object VisitDispatcherType(DispatcherTypeContext context)
        {
            var meta = new MetaType { Kind = MetaTypeKind.Dispatch };
            meta.AttributeList ??= [];
            string? resource = context.resourceLocation()?.GetText();
            List<IndexContext> indexList = [];
            string indexBodyString = "";
            if(context.indexBody()?.index()?.Length > 1)
            {
                indexList = [.. context.indexBody().index()];
            }
            else
            {
                indexBodyString = context.indexBody().GetText();
            }

            if (resource is not null)
            {
                meta.AttributeList["Resource"] = new()
                {
                    Kind = MetaValueKind.Literal,
                    LiteralValue= resource
                };
            }
            if (indexList.Count > 1)
            {
                MetaValue indexValue = new()
                {
                    Kind = MetaValueKind.List,
                    Items = []
                };
                meta.AttributeList["Index"] = indexValue;
                for (int i = 0; i < indexList.Count; i++)
                {
                    string literalValue = "";
                    if (indexList[i].dynamicIndex() is not null)
                    {
                        literalValue += indexList[i].dynamicIndex().GetText().TrimStart('[').TrimEnd(']');
                    }
                    if (indexList[i].staticIndexKey() is not null)
                    {
                        literalValue += indexList[i].staticIndexKey().GetText().TrimStart('[').TrimEnd(']');
                    }
                    indexValue.Items.Add(new MetaValue() { Kind = MetaValueKind.Literal, LiteralValue = literalValue });
                }
            }
            else
            {
                meta.AttributeList["Index"] = new MetaValue() { Kind = MetaValueKind.Literal, LiteralValue = indexBodyString.TrimStart('[').TrimEnd(']') };
            }
            return meta;
        }

        public override object VisitIndexingOnAType(IndexingOnATypeContext context)
        {
            var meta = new MetaType
            {
                Kind = MetaTypeKind.Indexed,
                IndexKeyList = context.indexBody()?.index()
                    ?.Select(i => i.GetText()).ToList()
            };
            return meta;
        }

        public override object VisitTreeBody(TreeBodyContext context)
        {
            var items = new List<MetaValue>();
            var members = new List<MetaNamedValue>();

            //位置值部分
            if (context.positionalValues() is not null && context.positionalValues().value() is not null)
            {
                foreach (var valueContext in context.positionalValues().value())
                {
                    var value = Visit(valueContext) as MetaValue;
                    if (value is not null)
                    {
                        items.Add(value);
                    }
                }
            }

            //命名值部分
            if (context.namedValues() is not null && context.namedValues().namedValue() is not null)
            {
                foreach (var nameValueContext in context.namedValues().namedValue())
                {
                    // 为简单起见，直接解析 namedValue
                    var named = ParseNamedValue(nameValueContext);
                    members.Add(named);
                }
            }

            //返回元组
            return (items, members);
        }

        public override object VisitValue(ValueContext context)
        {
            var mv = new MetaValue { RawText = context.GetText() };

            if (context.typeSentence() is not null)
            {
                mv.Kind = MetaValueKind.Type;
                mv.TypeValue = Visit(context.typeSentence()) as MetaType;
            }
            else if (context.treeValue() is not null)
            {
                // treeValue 已解析为 MetaValue，复制其内容
                var tree = Visit(context.treeValue()) as MetaValue;
                if (tree is not null)
                {
                    mv.Kind = tree.Kind;
                    mv.Items = tree.Items;
                    mv.Members = tree.Members;
                    mv.LiteralValue = tree.LiteralValue; // 通常 treeValue 不会是 literal，但保留
                }
            }
            else
            {
                // 纯字面量（如标识符、数字、字符串）——但实际上 value 只包含 typeSentence 或 treeValue，不会单独出现字面量，为安全处理
                mv.Kind = MetaValueKind.Literal;
                mv.LiteralValue = context.GetText().Trim('"');
            }

            return mv;
        }

        public override object VisitTreeValue(TreeValueContext context)
        {
            var mv = new MetaValue 
            { 
                RawText = context.GetText()
            };

            if (context.LeftRoundBracket() is not null)
            {
                mv.Kind = MetaValueKind.Tuple;
            }
            else if (context.LeftSquareBracket() is not null)
            {
                mv.Kind = MetaValueKind.List;
            }
            else if (context.LeftCurlyBracket() is not null)
            {
                mv.Kind = MetaValueKind.Object;
            }
            else
            {
                return mv;
            }

            if (context.treeBody() is not null)
            {
                //VisitTreeBody返回(List<MetaValue>? Items, List<MetaNamedValue>? Members)元组
                var bodyResult = Visit(context.treeBody());
                if (bodyResult is ValueTuple<List<MetaValue>?, List<MetaNamedValue>?> tuple)
                {
                    var (items, members) = tuple;
                    if (mv.Kind == MetaValueKind.Object)
                    {
                        var objMembers = new List<MetaNamedValue>();
                        int idx = 0;
                        if (items is not null)
                        {
                            foreach (var item in items)
                            {
                                objMembers.Add(new MetaNamedValue { Name = $"{idx++}", Value = item });
                            }
                        }
                        if (members is not null)
                        {
                            objMembers.AddRange(members);
                        }
                        mv.Members = objMembers;
                    }
                    else
                    {
                        mv.Items = items;
                        mv.Members = members;
                    }
                }
            }

            return mv;
        }
        #endregion
    }
}