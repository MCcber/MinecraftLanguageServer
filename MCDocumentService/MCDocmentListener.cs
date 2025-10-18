using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MinecraftLanguageModelLibrary.Model.MCDocument;
using MinecraftLanguageModelLibrary.Model.MCDocument.EnumContent;
using MinecraftLanguageModelLibrary.Model.MCDocument.InjectionContent;
using MinecraftLanguageModelLibrary.Model.MCDocument.UnAttributedTypeContent;
using System.Reflection;
using static mcdocParser;
using static MinecraftLanguageModelLibrary.Model.MCDocument.MCDocumentEnum;

namespace MinecraftLanguageServer.MCDocumentService
{
    public partial class MCDocmentListener : mcdocParserBaseListener
    {
        #region Field
        private readonly string[] intUnit = ["b","s","l"];
        private readonly string[] floatUnit = ["d","f"];
        private readonly List<string> BlackList = ["IntegerContext", "IntegerRangeContext", "NamedValueContext", "NamedValuesContext", "TreeBodyContext", "AttributeContext", "StructBlockContext"];
        private readonly MCDocumentFileModel result = new();
        private readonly List<string> reservedWordList = 
        [
            "any",
            "boolean",
            "byte",
            "double",
            "enum",
            "false",
            "float",
            "int",
            "long",
            "short",
            "string",
            "struct",
            "super",
            "true"
        ];

        #endregion

        #region Property

        private readonly Dictionary<string, Stack<List<object>>> DocumentFieldMap = [];
        #endregion

        #region Method
        public MCDocumentFileModel GetResult()
        {
            if(!result.IsCollected)
            {
                #region 收集结构体
                if (DocumentFieldMap.TryGetValue("FileContext.StructContext", out Stack<List<object>>? structSentence) && structSentence is not null)
                {
                    while (structSentence.Count > 0)
                    {
                        result.StructureList.AddRange(structSentence.Pop().Cast<Structure>().Where(item=>item.IsTop));
                    }

                    if (result.StructureList.Count > 1)
                    {
                        result.StructureList.Reverse();
                    }
                }
                #endregion

                #region 收集枚举
                if (DocumentFieldMap.TryGetValue("FileContext.EnumTypeContext", out Stack<List<object>>? enumTypeSentence) && enumTypeSentence is not null)
                {
                    while (enumTypeSentence.Count > 0)
                    {
                        result.EnumerationList.AddRange(enumTypeSentence.Pop().Cast<Enumeration>().Where(item => item.IsTop));
                    }

                    if (result.StructureList.Count > 1)
                    {
                        result.EnumerationList.Reverse();
                    }
                }
                #endregion

                #region 收集TypeAlias
                if (DocumentFieldMap.TryGetValue("FileContext.TypeAliasContext", out Stack<List<object>>? typeAliasSentence) && typeAliasSentence is not null)
                {
                    while (typeAliasSentence.Count > 0)
                    {
                        result.TypeAliaList.AddRange(typeAliasSentence.Pop().Cast<TypeAlia>());
                    }

                    if (result.StructureList.Count > 1)
                    {
                        result.TypeAliaList.Reverse();
                    }
                }
                #endregion

                #region 收集外部引用
                if (DocumentFieldMap.TryGetValue("FileContext.UseStatementContext", out Stack<List<object>>? useStatementSentence) && useStatementSentence is not null)
                {
                    while (useStatementSentence.Count > 0)
                    {
                        result.UseStatementList.AddRange(useStatementSentence.Pop().Cast<UseStatement>());
                    }

                    if (result.UseStatementList.Count > 1)
                    {
                        result.UseStatementList.Reverse();
                    }
                }
                #endregion

                #region 收集注入
                if (DocumentFieldMap.TryGetValue("FileContext.InjectionContext", out Stack<List<object>>? injectionSentence) && injectionSentence is not null)
                {
                    while (injectionSentence.Count > 0)
                    {
                        result.InjectionList.AddRange(injectionSentence.Pop().Cast<Injection>());
                    }

                    if (result.StructureList.Count > 1)
                    {
                        result.InjectionList.Reverse();
                    }
                }
                #endregion

                #region 收集调度命令
                if (DocumentFieldMap.TryGetValue("FileContext.DispatchStatementContext", out Stack<List<object>>? dispatchStatementSentence) && dispatchStatementSentence is not null)
                {
                    while (dispatchStatementSentence.Count > 0)
                    {
                        result.DispatchStatementList.AddRange(dispatchStatementSentence.Pop().Cast<DispatchStatement>());
                    }

                    if (result.StructureList.Count > 1)
                    {
                        result.DispatchStatementList.Reverse();
                    }
                }
                #endregion

                result.IsCollected = true;
            }
            return result;
        }

        /// <summary>
        /// 获取类型名称
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        private static string GetTypeName(RuleContext context)
        {
            return context.GetType().ToString().Replace("mcdocParser+", "");
        }

        /// <summary>
        /// 处理中层和顶层所有节点的添加操作
        /// </summary>
        private void PushToStack(string typeName,object data)
        {
            if (!DocumentFieldMap.TryGetValue(typeName, out Stack<List<object>>? value))
            {
                value = new Stack<List<object>>();
                value.Push([]);
                DocumentFieldMap.Add(typeName, value);
            }

            if(value.Count == 0)
            {
                value.Push([]);
            }
            value.Peek().Add(data);
        }
        #endregion

        #region Event

        #region 添加新的类型列表和新的底层字符串
        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            base.EnterEveryRule(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            if (BlackList.Contains(typeName))
            {
                return;
            }
            string lowerTypeName = typeName.Replace("Context", "").ToLower().Trim();
            string currentValue = context.GetText().Trim();
            if (lowerTypeName != currentValue)
            {
                DocumentFieldMap.TryAdd(parentTypeName + typeName, []);
                DocumentFieldMap[parentTypeName + typeName].Push([]);
            }
        }

        public override void ExitEveryRule([NotNull] ParserRuleContext context)
        {
            base.ExitEveryRule(context);

            Type type = context.GetType();
            string typeName = GetTypeName(context);
            if (BlackList.Contains(typeName))
            {
                return;
            }

            MethodInfo[] methodArray = type.GetMethods(BindingFlags.Public | BindingFlags.Instance | BindingFlags.DeclaredOnly);
            for (int i = 0; i < methodArray.Length; i++)
            {
                if(methodArray[i].ReturnType != typeof(ParserRuleContext) && methodArray[i].ReturnType.BaseType is null)
                {
                    typeName = GetTypeName(context);
                    string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

                    string currentValue = context.GetText().Trim();
                    List<object> targetList = [];
                    if (DocumentFieldMap.TryGetValue(parentTypeName + typeName, out Stack<List<object>>? stack) && stack.Count > 0)
                    {
                        targetList = stack.Peek();
                    }
                    if (targetList.Count == 0 || (targetList.Count > 0 && targetList[^1].GetType() is null))
                    {
                        targetList.Add(currentValue);
                    }
                }
            }

            #region 判断拥有多个父级或拥有多个子语法的节点是否被"走过"
            //if (context is BoolValueContext)
            //{
            //    boolValueOfParentStack.Push(true);
            //}
            //if (context is TypedNumberContext)
            //{
            //    typedNumberOfParentStack.Push(true);
            //}
            //if (context is StringContext)
            //{
            //    stringValueOfParentStack.Push(true);
            //}
            //if (context is IdentifierContext)
            //{
            //    identifierOfParentStack.Push(true);
            //}
            //if (context is KeywordTypeContext)
            //{
            //    keywordTypeOfParentStack.Push(true);
            //}
            //if (context is StringTypeContext)
            //{
            //    stringTypeOfParentStack.Push(true);
            //}
            //if (context is LiteralTypeContext)
            //{
            //    literialTypeOfParentStack.Push(true);
            //}
            //if (context is NumericTypeContext)
            //{
            //    numericTypeOfParentStack.Push(true);
            //}
            //if (context is PrimitiveArrayTypeContext)
            //{
            //    primitiveArrayTypeOfParentStack.Push(true);
            //}
            //if (context is ListTypeContext)
            //{
            //    listTypeOfParentStack.Push(true);
            //}
            //if (context is TupleTypeContext)
            //{
            //    tupleTypeOfParentStack.Push(true);
            //}
            //if (context is EnumTypeContext)
            //{
            //    enumTypeOfParentStack.Push(true);
            //}
            //if (context is StructContext)
            //{
            //    structOfParentStack.Push(true);
            //}
            //if (context is ReferenceTypeContext)
            //{
            //    referenceOfParentStack.Push(true);
            //}
            //if (context is DispatcherTypeContext)
            //{
            //    dispatcherTypeOfParentStack.Push(true);
            //}
            //if (context is UnionTypeContext)
            //{
            //    unionTypeOfParentStack.Push(true);
            //}
            //if (context is IndexingOnATypeContext)
            //{
            //    indexingOnATypeOfParentStack.Push(true);
            //}
            //if (context is PositionalValuesContext)
            //{
            //    positionalValuesOfParentStack.Push(true);
            //}
            //if (context is NamedValuesContext)
            //{
            //    namedValuesOfParentStack.Push(true);
            //}
            //if (context is ValueContext)
            //{
            //    valueOfParentStack.Push(true);
            //}
            //if (context is TreeValueContext)
            //{
            //    treeValueOfParentStack.Push(true);
            //}
            //if (context is AttributeContext)
            //{
            //    attributeOfParentStack.Push(true);
            //}
            //if (context is IndexBodyContext)
            //{
            //    indexBodyOfParentStack.Push(true);
            //}
            //if (context is TypeArgBlockContext)
            //{
            //    typeArgBlockOfParentStack.Push(true);
            //}
            //if (context is PrelimContext)
            //{
            //    prelimOfParentStack.Push(true);
            //}
            //if (context is EnumInjectionContext)
            //{
            //    enumInjectionOfParentStack.Push(true);
            //}
            //if (context is StructInjectionContext)
            //{
            //    structInjectionOfParentStack.Push(true);
            //}
            #endregion
        }
        #endregion

        #region 收集中层数据
        public override void ExitTypedNumber([NotNull] TypedNumberContext context)
        {
            base.ExitTypedNumber(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();
            TypedNumber typedNumber = new();

            string unit = currentValue[^1].ToString().ToLower();
            if (intUnit.Contains(unit))
            {
                typedNumber.IntTypedUnit = char.Parse(unit);
                typedNumber.Integer = int.Parse(currentValue[..^1]);
            }
            else
            if(int.TryParse(currentValue,out int intValue))
            {
                typedNumber.IsIntType = true;
                typedNumber.Integer = intValue;
            }

            if (floatUnit.Contains(unit) && !typedNumber.IsIntType)
            {
                typedNumber.FloatTypedUnit = char.Parse(unit);
                typedNumber.Float = float.Parse(currentValue[..^1]);
            }
            else
            if(float.TryParse(currentValue,out float floatValue) && !typedNumber.IsIntType)
            {
                typedNumber.Float = floatValue;
                typedNumber.IsFloatType = true;
            }

            PushToStack(parentTypeName + typeName, typedNumber);
        }

        public override void ExitEnumValue([NotNull] EnumValueContext context)
        {
            base.ExitEnumValue(context);

            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();
            string stringValue = currentValue.TrimStart().StartsWith('"') ? currentValue : "";

            EnumValue enumValue = new()
            {
                String = stringValue
            };

            if (DocumentFieldMap.TryGetValue(typeName + ".TypedNumberContext", out Stack<List<object>>? typedNumberStack) && typedNumberStack is not null && typedNumberStack.Count > 0)
            {
                List<object>? list = typedNumberStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    enumValue.TypedNumber = list[^1] as TypedNumber;
                }
            }

            PushToStack(parentTypeName + typeName, enumValue);
        }

        public override void ExitEnumField([NotNull] EnumFieldContext context)
        {
            base.ExitEnumField(context);

            string typeName = GetTypeName(context);
            string parentTypeName = "";
            if (context.Parent is not null && context.Parent.Parent is not null)
            {
                parentTypeName = context.Parent.Parent.GetType().ToString().Replace("mcdocParser+", "") + '.';
            }

            EnumField enumField = new();

            if(DocumentFieldMap.TryGetValue(typeName + ".PrelimContext", out Stack<List<object>>? prelimStack) && prelimStack is not null && prelimStack.Count > 0)
            {
                enumField.PrelimList = [..prelimStack.Pop().Cast<Prelim>()];
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".AttributeContext", out Stack<List<object>>? attributeStack) && attributeStack is not null && attributeStack.Count > 0)
            {
                enumField.AttributeList = [.. attributeStack.Pop().Cast<MCDocumentAttribute>()];
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
            {
                List<object> lastObjList = identifierStack.Pop();
                if (lastObjList is not null && lastObjList.Count > 0)
                {
                    enumField.Key = lastObjList[^1].ToString();
                }
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".EnumValueContext", out Stack<List<object>>? enumValueStack) && enumValueStack is not null && enumValueStack.Count > 0)
            {
                List<object> lastObjList = enumValueStack.Pop();
                if (lastObjList is not null && lastObjList.Count > 0)
                {
                    enumField.Value = lastObjList[^1] as EnumValue;
                }
            }

            PushToStack(parentTypeName + typeName, enumField);
        }

        public override void ExitStringType([NotNull] StringTypeContext context)
        {
            base.ExitStringType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();
            string range = "";
            int atIndex = currentValue.IndexOf('@');
            if(atIndex > -1)
            {
                range = currentValue.Trim()[(atIndex + 1)..];
            }

            PushToStack(parentTypeName + typeName,new StringType()
            {
                Range = range
            });
        }

        public override void ExitLiteralType([NotNull] LiteralTypeContext context)
        {
            base.ExitLiteralType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();

            LiteralType literalType = new();

            if (bool.TryParse(currentValue, out bool boolValue))
            {
                literalType.BoolValue = boolValue;
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TypedNumberContext", out Stack<List<object>>? typedNumberStack) && typedNumberStack is not null && typedNumberStack.Count > 0)
            {
                List<object>? list = typedNumberStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    literalType.TypedNumber = list[^1] as TypedNumber;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".StringContext", out Stack<List<object>>? stringStack) && stringStack is not null && stringStack.Count > 0)
            {
                List<object>? list = stringStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    literalType.String = list[^1].ToString();
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
            {
                List<object>? list = identifierStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    literalType.String = list[^1].ToString();
                }
            }

            PushToStack(parentTypeName + typeName, literalType);
        }

        public override void ExitNumericType([NotNull] NumericTypeContext context)
        {
            base.ExitNumericType(context);
            NumericType numericType = new();
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();
            int atIndex = currentValue.IndexOf('@');
            if(atIndex > -1)
            {
                numericType.Range = currentValue[(atIndex + 1)..].Trim();
            }

            if(DocumentFieldMap.TryGetValue(typeName + ".BaseDataTypeContext", out Stack<List<object>>? baseDataTypeStack) && baseDataTypeStack is not null && baseDataTypeStack.Count > 0)
            {
                List<object> list = baseDataTypeStack.Pop();
                if (list.Count > 0 && list[^1] is not null && System.Enum.TryParse(typeof(BaseDataType), list[^1].ToString(), out object? result))
                {
                    numericType.BaseDataType = (BaseDataType)result;
                }
            }

            PushToStack(parentTypeName + typeName, numericType);
        }

        public override void ExitPrimitiveArrayType([NotNull] PrimitiveArrayTypeContext context)
        {
            base.ExitPrimitiveArrayType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string? currentValue = context.GetText();
            int atIndex = currentValue.IndexOf('@');
            PrimitiveArrayType primitiveArrayType = new();

            if (currentValue is not null && currentValue.Length > 0)
            {
                if (atIndex > -1)
                {
                    primitiveArrayType.Range = currentValue[(atIndex + 1)..].Trim();
                    primitiveArrayType.DataType = (PrimitiveArrayDataType)System.Enum.Parse(typeof(PrimitiveArrayDataType), currentValue.Trim()[..atIndex]);
                }
                else
                {
                    primitiveArrayType.DataType = (PrimitiveArrayDataType)System.Enum.Parse(typeof(PrimitiveArrayDataType), currentValue.Trim());
                }

                PushToStack(parentTypeName + typeName, primitiveArrayType);
            }
        }

        public override void ExitListType([NotNull] ListTypeContext context)
        {
            base.ExitListType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();

            ListType listType = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack.Count > 0)
            {
                List<object> typeList = typeStack.Pop();
                if (typeList.Count > 0 && typeList[^1] is not null)
                {
                    listType.Type = typeList[^1] as MCDocumentType;
                }
            }

            int atIndex = currentValue.LastIndexOf('@');
            if(atIndex > -1)
            {
                listType.Range = currentValue[(atIndex + 1)..].Trim();
            }

            PushToStack(parentTypeName + typeName, listType);
        }

        public override void ExitTupleType([NotNull] TupleTypeContext context)
        {
            base.ExitTupleType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null && typeStack.Count > 0)
            {
                List<object>? typeList = typeStack.Pop();
                if (typeList is not null && typeList.Count > 0)
                {
                    PushToStack(parentTypeName + typeName, new TupleType()
                    {
                        Type1 = typeList[0] as MCDocumentType,
                        Type2 = typeList[1] as MCDocumentType
                    });
                }
            }
        }

        public override void ExitPrelim([NotNull] PrelimContext context)
        {
            base.ExitPrelim(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            Prelim prelim = new();

            if(DocumentFieldMap.TryGetValue(typeName + ".CommentaryContext", out Stack<List<object>>? CommentaryStack) && CommentaryStack is not null && CommentaryStack.Count > 0)
            {
                List<string> CommentaryList = [..CommentaryStack.Pop().Cast<string>()];
                prelim.CommentaryList.AddRange(CommentaryList.Cast<string>());
            }

            if(DocumentFieldMap.TryGetValue(typeName + ".DocCommentaryContext", out Stack<List<object>>? DocCommentaryStack) && DocCommentaryStack is not null && DocCommentaryStack.Count > 0)
            {
                List<string> DocCommentaryList = [.. DocCommentaryStack.Pop().Cast<string>()];
                prelim.DocCommentaryList.AddRange(DocCommentaryList.Cast<string>());
            }

            if(DocumentFieldMap.TryGetValue(typeName + ".AttributeContext", out Stack<List<object>>? AttributeStack) && AttributeStack is not null && AttributeStack.Count > 0)
            {
                prelim.Attribute = AttributeStack.Pop().Cast<MCDocumentAttribute>().First();
            }

            PushToStack(parentTypeName + typeName, prelim);
        }

        public override void ExitDispatcherType([NotNull] DispatcherTypeContext context)
        {
            base.ExitDispatcherType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            DispatchType dispatchType = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".ResourceLocationContext", out Stack<List<object>>? resourceStack) && resourceStack is not null && resourceStack.Count > 0)
            {
                List<object>? resourceList = resourceStack.Pop();
                if(resourceList is not null && resourceList.Count > 0)
                {
                    dispatchType.ResourceLocation = resourceList[^1].ToString();
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IndexBodyContext", out Stack<List<object>>? indexBodyStack) && indexBodyStack is not null && indexBodyStack.Count > 0)
            {
                List<object>? indexBodyList = indexBodyStack.Pop();
                if (indexBodyList is not null && indexBodyList.Count > 0)
                {
                    dispatchType.DispatcherIndexBody = indexBodyList[^1] as IndexBody;
                }
            }

            PushToStack(parentTypeName + typeName, dispatchType);
        }

        public override void ExitUnionType([NotNull] UnionTypeContext context)
        {
            base.ExitUnionType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            UnionType unionType = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null && typeStack.Count > 0)
            {
                List<object>? typeList = typeStack.Pop();
                if (typeList is not null && typeList.Count > 0)
                {
                    unionType.TypeList = [..typeList.Cast<MCDocumentType>()];
                }
            }

            PushToStack(parentTypeName + typeName, unionType);
        }

        public override void ExitIndexBody([NotNull] IndexBodyContext context)
        {
            base.ExitIndexBody(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            IndexBody indexBody = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".IndexContext", out Stack<List<object>>? indexStack) && indexStack is not null && indexStack.Count > 0)
            {
                List<object>? indexList = indexStack.Pop();
                if (indexList is not null && indexList.Count > 0)
                {
                    indexBody.IndexList = [.. indexList.Cast<string>()];
                }
            }

            PushToStack(parentTypeName + typeName, indexBody);
        }

        public override void ExitIndexingOnAType([NotNull] IndexingOnATypeContext context)
        {
            base.ExitIndexingOnAType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            IndexOnAType indexOnAType = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".IndexBodyContext", out Stack<List<object>>? indexBodyStack) && indexBodyStack is not null && indexBodyStack.Count > 0)
            {
                List<object>? indexBodyList = indexBodyStack.Pop();
                if (indexBodyList is not null && indexBodyList.Count > 0)
                {
                    indexOnAType.IndexBody = indexBodyList[^1] as IndexBody;
                }
            }

            PushToStack(parentTypeName + typeName, indexOnAType);
        }

        public override void ExitTypeArgBlock([NotNull] TypeArgBlockContext context)
        {
            base.ExitTypeArgBlock(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            TypeArgBlock typeArgBlock = new();
            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null && typeStack.Count > 0)
            {
                List<object>? typeList = typeStack.Pop();
                if (typeList is not null && typeList.Count > 0)
                {
                    typeArgBlock.TypeList = [..typeList.Cast<MCDocumentType>()];
                }
            }

            PushToStack(parentTypeName + typeName, typeArgBlock);
        }

        public override void ExitUnAttributedType([NotNull] UnAttributedTypeContext context)
        {
            base.ExitUnAttributedType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            UnAttributedType unAttributedType = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".KeywordTypeContext", out Stack<List<object>>? keywordTypeStack) && keywordTypeStack is not null && keywordTypeStack.Count > 0)
            {
                List<object> list = keywordTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.KeyWordType = list[^1] as KeyWordType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".StringTypeContext", out Stack<List<object>>? stringTypeStack) && stringTypeStack is not null && stringTypeStack.Count > 0)
            {
                List<object> list = stringTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.StringType = list[^1] as StringType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".LiteralTypeContext", out Stack<List<object>>? literalTypeStack) && literalTypeStack is not null && literalTypeStack.Count > 0)
            {
                List<object> list = literalTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.LiteralType = list[^1] as LiteralType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".NumericTypeContext", out Stack<List<object>>? numericTypeStack) && numericTypeStack is not null && numericTypeStack.Count > 0)
            {
                List<object> list = numericTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.NumericType = list[^1] as NumericType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".PrimitiveArrayTypeContext", out Stack<List<object>>? primitiveArrayTypeStack) && primitiveArrayTypeStack is not null && primitiveArrayTypeStack.Count > 0)
            {
                List<object> list = primitiveArrayTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.PrimitiveArrayType = list[^1] as PrimitiveArrayType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".ListTypeContext", out Stack<List<object>>? listTypeStack) && listTypeStack is not null && listTypeStack.Count > 0)
            {
                List<object> list = listTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.ListType = list[^1] as ListType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TupleTypeContext", out Stack<List<object>>? tupleTypeStack) && tupleTypeStack is not null && tupleTypeStack.Count > 0)
            {
                List<object> list = tupleTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.TupleType = list[^1] as TupleType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".EnumTypeContext", out Stack<List<object>>? enumTypeStack) && enumTypeStack is not null && enumTypeStack.Count > 0)
            {
                List<object> list = enumTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.EnumType = list[^1] as Enumeration;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".StructContext", out Stack<List<object>>? structStack) && structStack is not null && structStack.Count > 0)
            {
                List<object> list = structStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.Structure = list[^1] as Structure;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".ReferenceTypeContext", out Stack<List<object>>? referenceTypeStack) && referenceTypeStack is not null && referenceTypeStack.Count > 0)
            {
                List<object> list = referenceTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.ReferenceType = list[^1] as ReferenceType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".DispatcherTypeContext", out Stack<List<object>>? dispatcherTypeStack) && dispatcherTypeStack is not null && dispatcherTypeStack.Count > 0)
            {
                List<object> list = dispatcherTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.DispatchType = list[^1] as DispatchType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".UnionTypeContext", out Stack<List<object>>? unionTypeStack) && unionTypeStack is not null && unionTypeStack.Count > 0)
            {
                List<object> list = unionTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.UnionType = list[^1] as UnionType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IndexingOnATypeContext", out Stack<List<object>>? indexingOnATypeStack) && indexingOnATypeStack is not null && indexingOnATypeStack.Count > 0)
            {
                List<object> list = indexingOnATypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    unAttributedType.IndexOnAType = list[^1] as IndexOnAType;
                }
            }

            PushToStack(parentTypeName + typeName,unAttributedType);
        }

        public override void ExitStructField([NotNull] StructFieldContext context)
        {
            base.ExitStructField(context);
            string typeName = GetTypeName(context);
            string parentTypeName = "";
            if (context.Parent is not null && context.Parent.Parent is not null)
            {
                parentTypeName = context.Parent.Parent.GetType().ToString().Replace("mcdocParser+", "") + '.';
            }

            StructField structField = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".QuestionMarkContext", out Stack<List<object>>? questionMarkStack) && questionMarkStack is not null && questionMarkStack.Count > 0)
            {
                List<object>? list = questionMarkStack.Pop();
                if (list is not null && list.Count > 0 && bool.TryParse(list[^1].ToString(),out bool result))
                {
                    structField.IsOptional = result;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TripleDotContext", out Stack<List<object>>? tripleDotStack) && tripleDotStack is not null && tripleDotStack.Count > 0)
            {
                List<object>? list = tripleDotStack.Pop();
                if (list is not null && list.Count > 0 && bool.TryParse(list[^1].ToString(), out bool result))
                {
                    structField.IsReference = result;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".AttributeContext", out Stack<List<object>>? attributeStack) && attributeStack is not null && attributeStack.Count > 0)
            {
                List<object>? list = attributeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    structField.AttributeList = [..list.Cast<MCDocumentAttribute>()];
                }
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".StructKeyContext", out Stack<List<object>>? structKeyStack) && structKeyStack is not null && structKeyStack.Count > 0)
            {
                List<object>? list = structKeyStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    structField.StructKey = list[^1] as StructKey;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".PrelimContext", out Stack<List<object>>? prelimStack) && prelimStack is not null && prelimStack.Count > 0)
            {
                List<object>? list = prelimStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    structField.PrelimList = [..list.Cast<Prelim>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null && typeStack.Count > 0)
            {
                List<object>? list = typeStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    structField.Type = list[^1] as MCDocumentType;
                }
            }

            PushToStack(parentTypeName + typeName, structField);
        }

        public override void ExitAttribute([NotNull] AttributeContext context)
        {
            base.ExitAttribute(context);

            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            DocumentFieldMap.TryAdd((context.Parent is not null ? GetTypeName(context.Parent) + '.' : "") + typeName, new Stack<List<object>>());
            MCDocumentAttribute attribute = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
            {
                List<object>? list = identifierStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    attribute.Identifier = list[^1].ToString();
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".ValueContext", out Stack<List<object>>? valueStack) && valueStack is not null && valueStack.Count > 0)
            {
                List<object>? list = valueStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    attribute.Value = list[^1] as MCDocumentValue;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TreeValueContext", out Stack<List<object>>? treeValueStack) && treeValueStack is not null && treeValueStack.Count > 0)
            {
                List<object>? list = treeValueStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    attribute.TreeValue = list[^1] as MCDocumentTreeValue;
                }
            }

            PushToStack(parentTypeName + typeName, attribute);
        }

        public override void ExitValue([NotNull] ValueContext context)
        {
            base.ExitValue(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            MCDocumentValue mcDocumentValue = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null && typeStack.Count > 0)
            {
                List<object>? list = typeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    mcDocumentValue.Type = list[^1] as MCDocumentType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TreeValueContext", out Stack<List<object>>? treeValueStack) && treeValueStack is not null && treeValueStack.Count > 0)
            {
                List<object>? list = treeValueStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    mcDocumentValue.TreeValue = list[^1] as MCDocumentTreeValue;
                }
            }

            PushToStack(parentTypeName + typeName, mcDocumentValue);
        }

        public override void ExitNamedValue([NotNull] NamedValueContext context)
        {
            base.ExitNamedValue(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            string currentValue = context.GetText();
            NamedValue namedValue = new();
            DocumentFieldMap.TryAdd((context.Parent is not null ? GetTypeName(context.Parent) + '.' : "") + typeName, new Stack<List<object>>());
            string? inlineValue = "";
            if (currentValue.TrimStart().EndsWith('"'))
            {
                if (DocumentFieldMap.TryGetValue(typeName + ".StringContext", out Stack<List<object>>? stringStack) && stringStack is not null && stringStack.Count > 0)
                {
                    List<object>? list = stringStack.Pop();
                    if (list is not null && list.Count > 0 && list[^1] is not null)
                    {
                        namedValue.String = list[^1].ToString();
                        inlineValue = namedValue.String;
                    }
                }
            }
            else
            {
                if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
                {
                    List<object>? list = identifierStack.Pop();
                    if (list is not null && list.Count > 0 && list[^1] is not null)
                    {
                        namedValue.Identifier = list[^1].ToString();
                        inlineValue = namedValue.Identifier;
                    }
                }
            }

            if(inlineValue is not null && inlineValue.Length > 0 && currentValue[(inlineValue.Length + 1)..((inlineValue.Length + 2))] == "=")
            {
                if (DocumentFieldMap.TryGetValue(typeName + ".ValueContext", out Stack<List<object>>? valueStack) && valueStack is not null && valueStack.Count > 0)
                {
                    List<object>? list = valueStack.Pop();
                    if (list is not null && list.Count > 0)
                    {
                        namedValue.Value = list[^1] as MCDocumentValue;
                    }
                }
            }
            else
            {
                if (DocumentFieldMap.TryGetValue(typeName + ".TreeValueContext", out Stack<List<object>>? treeValueStack) && treeValueStack is not null && treeValueStack.Count > 0)
                {
                    List<object>? list = treeValueStack.Pop();
                    if (list is not null && list.Count > 0)
                    {
                        namedValue.TreeValue = list[^1] as MCDocumentTreeValue;
                    }
                }
            }

            PushToStack(parentTypeName + typeName,namedValue);
        }

        public override void ExitNamedValues([NotNull] NamedValuesContext context)
        {
            base.ExitNamedValues(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            NamedValues namedValues = new();
            DocumentFieldMap.TryAdd((context.Parent is not null ? GetTypeName(context.Parent) + '.' : "") + typeName, new Stack<List<object>>());
            if (DocumentFieldMap.TryGetValue(typeName + ".NamedValueContext", out Stack<List<object>>? nameValuesStack) && nameValuesStack is not null && nameValuesStack.Count > 0)
            {
                List<object>? list = nameValuesStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    namedValues.NameValueList = [..list.Cast<NamedValue>()];
                }
            }

            PushToStack(parentTypeName + typeName, namedValues);
        }

        public override void ExitTreeBody([NotNull] TreeBodyContext context)
        {
            base.ExitTreeBody(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            MCDocumentTreeBody treeBody = new();
            DocumentFieldMap.TryAdd((context.Parent is not null ? GetTypeName(context.Parent) + '.' : "") + typeName, new Stack<List<object>>());
            if (DocumentFieldMap.TryGetValue(typeName + ".PositionalValuesContext", out Stack<List<object>>? positionalValuesStack) && positionalValuesStack is not null && positionalValuesStack.Count > 0)
            {
                List<object>? list = positionalValuesStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    treeBody.PositionalValueList = [.. list.Cast<PositionalValue>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".NamedValuesContext", out Stack<List<object>>? namedValuesStack) && namedValuesStack is not null && namedValuesStack.Count > 0)
            {
                List<object>? list = namedValuesStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    treeBody.NamedValueList = [.. list.Cast<NamedValues>()];
                }
            }

            PushToStack(parentTypeName + typeName,treeBody);
        }

        public override void ExitTreeValue([NotNull] TreeValueContext context)
        {
            base.ExitTreeValue(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            MCDocumentTreeValue mcDocumentTreeValue = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".TreeBodyContext", out Stack<List<object>>? treeBodyStack) && treeBodyStack is not null && treeBodyStack.Count > 0)
            {
                List<object>? list = treeBodyStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    mcDocumentTreeValue.TreeBody = list[^1] as MCDocumentTreeBody;
                }
            }

            PushToStack(parentTypeName + typeName, mcDocumentTreeValue);
        }

        public override void ExitPositionalValues([NotNull] PositionalValuesContext context)
        {
            base.ExitPositionalValues(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            PositionalValue positionalValue = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".ValueContext", out Stack<List<object>>? valueStack) && valueStack is not null && valueStack.Count > 0)
            {
                List<object>? list = valueStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    positionalValue.ValueList = [.. list.Cast<MCDocumentValue>()];
                }
            }

            PushToStack(parentTypeName + typeName, positionalValue);
        }
        #endregion

        #region 收集顶层数据

        public override void ExitUseStatement([NotNull] UseStatementContext context)
        {
            base.ExitUseStatement(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            UseStatement useStatement = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".PathContext", out Stack<List<object>>? pathStack) && pathStack is not null && pathStack.Count > 0)
            {
                List<object>? list = pathStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    useStatement.Path = list[^1].ToString();
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
            {
                List<object>? list = identifierStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    useStatement.Name = list[^1].ToString();
                }
            }

            PushToStack(parentTypeName + typeName, useStatement);
        }

        public override void ExitStructKey([NotNull] StructKeyContext context)
        {
            base.ExitStructKey(context);
            string typeName = GetTypeName(context);
            string value = context.GetText();
            StructKey structKey = new();
            if(value.TrimEnd().EndsWith('"'))
            {
                structKey.String = value.Trim();
            }
            else
            if(value.TrimEnd().EndsWith(']'))
            {
                if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null && typeStack.Count > 0)
                {
                    List<object>? list = typeStack.Pop();
                    if (list is not null && list.Count > 0)
                    {
                        structKey.Type = list[^1] as MCDocumentType;
                    }
                }
            }
            else
            {
                structKey.Identifier = value.Trim();
            }

            PushToStack(typeName,structKey);
        }

        public override void ExitStruct([NotNull] StructContext context)
        {
            base.ExitStruct(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            Structure structure = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".PrelimContext", out Stack<List<object>>? prelimStack) && prelimStack is not null && prelimStack.Count > 0)
            {
                List<object>? list = prelimStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    structure.PrelimList = [..list.Cast<Prelim>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
            {
                List<object>? list = identifierStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    structure.Identifier = list[^1].ToString();
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".StructFieldContext", out Stack<List<object>>? structFieldStack) && structFieldStack is not null && structFieldStack.Count > 0)
            {
                List<object>? list = structFieldStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    structure.StructFieldList = [.. list.Cast<StructField>()];
                }
            }

            PushToStack(parentTypeName + typeName,structure);
        }

        public override void ExitTypeSentence([NotNull] TypeSentenceContext context)
        {
            base.ExitTypeSentence(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";
            MCDocumentType type = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".AttributeContext", out Stack<List<object>>? attributeStack) && attributeStack is not null && attributeStack.Count > 0)
            {
                List<object>? list = attributeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    type.AttributeList = [.. list.Cast<MCDocumentAttribute>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".UnAttributedTypeContext", out Stack<List<object>>? unAttributedTypeStack) && unAttributedTypeStack is not null && unAttributedTypeStack.Count > 0)
            {
                List<object>? list = unAttributedTypeStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    type.UnAttributedType = list[^1] as UnAttributedType;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IndexBodyContext", out Stack<List<object>>? indexBodyStack) && indexBodyStack is not null && indexBodyStack.Count > 0)
            {
                List<object>? list = indexBodyStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    type.IndexBodyList = [.. list.Cast<IndexBody>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeArgBlockContext", out Stack<List<object>>? typeArgBlockStack) && typeArgBlockStack is not null && typeArgBlockStack.Count > 0)
            {
                List<object>? list = typeArgBlockStack.Pop();
                if (list is not null && list.Count > 0)
                {
                    type.TypeArgBlockList = [.. list.Cast<TypeArgBlock>()];
                }
            }

            PushToStack(parentTypeName + typeName, type);
        }

        public override void ExitEnumType([NotNull] EnumTypeContext context)
        {
            base.ExitEnumType(context);
            string typeName = GetTypeName(context);
            string parentTypeName = context.Parent?.GetType().ToString().Replace("mcdocParser+", "") + '.' ?? "";

            Enumeration enumeration = new();

            if(DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null)
            {
                List<object> list = identifierStack.Pop();
                if(list is not null && list.Count > 0 && list[^1] is not null)
                {
                    enumeration.Name = list[^1].ToString();
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".PrelimContext", out Stack<List<object>>? prelimStack) && prelimStack is not null)
            {
                List<object> list = prelimStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    enumeration.Prelim = list[^1] as Prelim;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".EnumFieldContext", out Stack<List<object>>? enumFieldStack) && enumFieldStack is not null)
            {
                List<object> list = enumFieldStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    enumeration.EnumFieldList = [..list.Cast<EnumField>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".EnumMemberTypeContext", out Stack<List<object>>? enumMemberTypeStack) && enumMemberTypeStack is not null)
            {
                List<object> list = enumMemberTypeStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    string? typeString = list[^1].ToString();
                    if (typeString is not null && typeString.Length > 0)
                    {
                        typeString = typeString[0].ToString().ToUpper() + typeString[1..];
                        enumeration.MemberType = (EnumMemberType)System.Enum.Parse(typeof(EnumMemberType), typeString);
                    }
                }
            }

            PushToStack(parentTypeName + typeName, enumeration);
        }

        public override void ExitTypeAlias([NotNull] TypeAliasContext context)
        {
            base.ExitTypeAlias(context);
            string typeName = GetTypeName(context);
            TypeAlia typeAlia = new();
            if (DocumentFieldMap.TryGetValue(typeName + ".PrelimContext", out Stack<List<object>>? prelimStack) && prelimStack is not null)
            {
                List<object> list = prelimStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    typeAlia.PrelimList = [.. list.Cast<Prelim>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null)
            {
                List<object> list = identifierStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    typeAlia.Identifier = list[^1].ToString();
                }
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".TypeParamBlockContext", out Stack<List<object>>? typeParamBlockStack) && typeParamBlockStack is not null)
            {
                List<object> list = typeParamBlockStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    typeAlia.TypeParameterBlock = [..list.Cast<string>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null)
            {
                List<object> list = typeStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    typeAlia.TypeSentence = list[^1] as MCDocumentType;
                }
            }

            PushToStack(typeName, typeAlia);
        }

        public override void ExitInjection([NotNull] InjectionContext context)
        {
            base.ExitInjection(context);
            string typeName = GetTypeName(context);
            Injection injection = new();
            if (DocumentFieldMap.TryGetValue(typeName + ".EnumInjectionContext", out Stack<List<object>>? enumInjectionStack) && enumInjectionStack is not null)
            {
                List<object> list = enumInjectionStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    injection.EnumInjection = list[^1] as EnumInjection;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".StructInjectionContext", out Stack<List<object>>? structInjectionStack) && structInjectionStack is not null)
            {
                List<object> list = structInjectionStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    injection.StructInjection = list[^1] as StructInjection;
                }
            }

            PushToStack(typeName,injection);
        }

        public override void ExitDispatchStatement([NotNull] DispatchStatementContext context)
        {
            base.ExitDispatchStatement(context);
            string typeName = GetTypeName(context);
            DispatchStatement dispatchStatement = new();

            if (DocumentFieldMap.TryGetValue(typeName + ".PrelimContext", out Stack<List<object>>? prelimStack) && prelimStack is not null)
            {
                List<object> list = prelimStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    dispatchStatement.Prelim = list[^1] as Prelim;
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".AttributeContext", out Stack<List<object>>? attributeStack) && attributeStack is not null)
            {
                List<object> list = attributeStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    dispatchStatement.AttributeList = [.. list.Cast<MCDocumentAttribute>()];
                }
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".ResourceLocationContext", out Stack<List<object>>? resourceStack) && resourceStack is not null)
            {
                List<object> list = resourceStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    dispatchStatement.ResourceLocation = list[^1].ToString();
                }
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".IndexBodyContext", out Stack<List<object>>? indexBodyStack) && indexBodyStack is not null)
            {
                List<object> list = indexBodyStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    dispatchStatement.IndexBody = list[^1] as IndexBody;
                }
            }
            
            if (DocumentFieldMap.TryGetValue(typeName + ".TypeParamBlockContext", out Stack<List<object>>? typeParamBlockStack) && typeParamBlockStack is not null)
            {
                List<object> list = typeParamBlockStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    dispatchStatement.TypeParameterBlock = [.. list.Cast<string>()];
                }
            }

            if (DocumentFieldMap.TryGetValue(typeName + ".TypeSentenceContext", out Stack<List<object>>? typeStack) && typeStack is not null)
            {
                List<object> list = typeStack.Pop();
                if (list is not null && list.Count > 0 && list[^1] is not null)
                {
                    dispatchStatement.Type = list[^1] as MCDocumentType;
                }
            }

            PushToStack(typeName,dispatchStatement);
        }
        #endregion

        #endregion
    }
}
