using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MinecraftLanguageServer.Model.MCDocument;
using MinecraftLanguageServer.Model.MCDocument.EnumContent;
using MinecraftLanguageServer.Model.MCDocument.InjectionContent;
using MinecraftLanguageServer.Model.MCDocument.UnAttributedTypeContent;
using System.Reflection;
using static mcdocParser;
using static MinecraftLanguageServer.Model.MCDocument.MCDocumentEnum;

namespace MinecraftLanguageServer.MCDocumentService
{
    public partial class MCDocmentListener : mcdocParserBaseListener
    {
        #region Field
        private bool boolValueOfLiteralType = false;
        private bool typedNumberOfLiteralType = false;
        private bool stringValueOfLiteralType = false;
        private bool identifierOfLiteralType = false;

        private bool keywordTypeOfUnAttributedType = false;
        private bool stringTypeOfUnAttributedType = false;
        private bool literialTypeOfUnAttributedType = false;
        private bool numericTypeOfUnAttributedType = false;
        private bool primitiveArrayTypeOfUnAttributedType = false;
        private bool listTypeOfUnAttributedType = false;
        private bool tupleTypeOfUnAttributedType = false;
        private bool enumTypeOfUnAttributedType = false;
        private bool structOfUnAttributedType = false;
        private bool referenceOfUnAttributedType = false;
        private bool dispatcherTypeOfUnAttributedType = false;
        private bool unionTypeOfUnAttributedType = false;
        private bool indexingOnATypeOfUnAttributedType = false;

        private bool positionalValuesOfTreeBody = false;
        private bool namedValuesOfTreeBody = false;
        private bool valueOfParent = false;
        private bool treeValueOfParent = false;

        private bool attributeOfParent = false;
        private bool indexBodyOfParent = false;
        private bool typeArgBlockOfParent = false;

        private bool prelimOfParent = false;

        private bool enumInjectionOfParent = false;
        private bool structInjectionOfParent = false;

        private string lastContextName = "";
        private string[] intUnit = ["b","s","l"];
        private string[] floatUnit = ["d","f"];
        private List<string> BlackList = ["IntegerContext", "IntegerRangeContext"];
        private MCDocumentFileModel result = new();
        private List<string> reservedWordList = 
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

        private Dictionary<string, Stack<List<object>>> DocumentFieldMap = [];
        #endregion

        #region Method
        public MCDocumentFileModel GetResult()
        {
            if(!result.IsCollected)
            {
                #region 收集结构体
                if (DocumentFieldMap.TryGetValue("Struct", out Stack<List<object>>? structSentence) && structSentence is not null && structSentence.Count > 0)
                {
                    result.StructureList.AddRange(structSentence.Peek().Cast<Structure>().Where(item=>item.IsTop));
                }
                #endregion

                #region 收集枚举
                if (DocumentFieldMap.TryGetValue("EnumType", out Stack<List<object>>? enumTypeSentence) && enumTypeSentence is not null && enumTypeSentence.Count > 0)
                {
                    result.EnumerationList.AddRange(enumTypeSentence.Peek().Cast<Enumeration>().Where(item => item.IsTop));
                }
                #endregion

                #region 收集TypeAlias
                if (DocumentFieldMap.TryGetValue("TypeAlias", out Stack<List<object>>? typeAliasSentence) && typeAliasSentence is not null && typeAliasSentence.Count > 0)
                {
                    result.TypeAliaList.AddRange(typeAliasSentence.Peek().Cast<TypeAlia>());
                }
                #endregion

                #region 收集外部引用
                if (DocumentFieldMap.TryGetValue("UseStatement", out Stack<List<object>>? useStatementSentence) && useStatementSentence is not null && useStatementSentence.Count > 0)
                {
                    result.UseStatementList.AddRange(useStatementSentence.Peek().Cast<UseStatement>());
                }
                #endregion

                #region 收集注入
                if (DocumentFieldMap.TryGetValue("Injection", out Stack<List<object>>? injectionSentence) && injectionSentence is not null && injectionSentence.Count > 0)
                {
                    result.InjectionList.AddRange(injectionSentence.Peek().Cast<Injection>());
                }
                #endregion

                #region 收集调度命令
                if (DocumentFieldMap.TryGetValue("DispatchStatement", out Stack<List<object>>? dispatchStatementSentence) && dispatchStatementSentence is not null && dispatchStatementSentence.Count > 0)
                {
                    result.DispatchStatementList.AddRange(dispatchStatementSentence.Peek().Cast<DispatchStatement>());
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
        private string GetTypeName(ParserRuleContext context)
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

            value.Peek().Add(data);
        }
        #endregion

        #region Event

        #region 添加新的类型列表和新的底层字符串
        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            base.EnterEveryRule(context);
            string typeName = GetTypeName(context);
            if(BlackList.Contains(typeName))
            {
                return;
            }
            string lowerTypeName = typeName.Replace("Context", "").ToLower().Trim();
            string currentValue = context.GetText().Trim();
            if (lowerTypeName != currentValue && lastContextName != typeName)
            {
                DocumentFieldMap.TryAdd(typeName, []);
                DocumentFieldMap[typeName].Push([]);
                lastContextName = typeName;
            }
            else
            {

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
                    string currentValue = context.GetText().Trim();
                    List<object> targetList = [];
                    if (DocumentFieldMap.TryGetValue(typeName, out Stack<List<object>>? stack))
                    {
                        targetList = stack.Peek();
                    }
                    if (DocumentFieldMap.TryGetValue(typeName,out Stack<List<object>>? list) && list is not null && (targetList.Count == 0 || (targetList.Count > 0 && targetList[^1].GetType() is null)))
                    {
                        DocumentFieldMap[typeName].Peek().Add(currentValue);
                    }
                }
            }

            #region 判断拥有多个父级或拥有多个子语法的节点是否被"走过"
            if (context is BoolValueContext)
            {
                boolValueOfLiteralType = true;
            }
            if(context is TypedNumberContext)
            {
                typedNumberOfLiteralType = true;
            }
            if(context is StringContext)
            {
                stringValueOfLiteralType = true;
            }
            if(context is IdentifierContext)
            {
                identifierOfLiteralType = true;
            }
            if(context is KeywordTypeContext)
            {
                keywordTypeOfUnAttributedType = true;
            }
            if(context is StringTypeContext)
            {
                stringTypeOfUnAttributedType = true;
            }
            if(context is LiteralTypeContext)
            {
                literialTypeOfUnAttributedType = true;
            }
            if(context is NumericTypeContext)
            {
                numericTypeOfUnAttributedType = true;
            }
            if(context is PrimitiveArrayTypeContext)
            {
                primitiveArrayTypeOfUnAttributedType = true;
            }
            if(context is ListTypeContext)
            {
                listTypeOfUnAttributedType = true;
            }
            if(context is TupleTypeContext)
            {
                tupleTypeOfUnAttributedType = true;
            }
            if(context is EnumTypeContext)
            {
                enumTypeOfUnAttributedType = true;
            }
            if(context is StructContext)
            {
                structOfUnAttributedType = true;
            }
            if(context is ReferenceTypeContext)
            {
                referenceOfUnAttributedType = true;
            }
            if(context is DispatcherTypeContext)
            {
                dispatcherTypeOfUnAttributedType = true;
            }
            if(context is UnionTypeContext)
            {
                unionTypeOfUnAttributedType = true;
            }
            if(context is IndexingOnATypeContext)
            {
                indexingOnATypeOfUnAttributedType = true;
            }
            if(context is PositionalValuesContext)
            {
                positionalValuesOfTreeBody = true;
            }
            if(context is NamedValuesContext)
            {
                namedValuesOfTreeBody = true;
            }
            if(context is ValueContext)
            {
                valueOfParent = true;
            }
            if(context is TreeValueContext)
            {
                treeValueOfParent = true;
            }
            if(context is AttributeContext)
            {
                attributeOfParent = true;
            }
            if(context is IndexBodyContext)
            {
                indexBodyOfParent = true;
            }
            if(context is TypeArgBlockContext)
            {
                typeArgBlockOfParent = true;
            }
            if(context is PrelimContext)
            {
                prelimOfParent = true;
            }
            if(context is EnumInjectionContext)
            {
                enumInjectionOfParent = true;
            }
            if(context is StructInjectionContext)
            {
                structInjectionOfParent = true;
            }
            #endregion
        }
        #endregion

        #region 收集中层数据
        public override void ExitTypedNumber([NotNull] TypedNumberContext context)
        {
            base.ExitTypedNumber(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            TypedNumber typedNumber = new();

            string unit = currentValue[^1].ToString().ToLower();
            if (intUnit.Contains(unit))
            {
                typedNumber.IntTypedUnit = char.Parse(unit);
                typedNumber.Integer = int.Parse(currentValue[..^1]);
            }
            if (floatUnit.Contains(unit))
            {
                typedNumber.FloatTypedUnit = char.Parse(unit);
                typedNumber.Float = float.Parse(currentValue[..^1]);
            }

            PushToStack(typeName,typedNumber);
        }

        public override void ExitEnumValue([NotNull] EnumValueContext context)
        {
            base.ExitEnumValue(context);

            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            string stringValue = currentValue.TrimStart().StartsWith('"') ? currentValue : "";

            PushToStack(typeName,new EnumValue()
            {
                String = stringValue,
                TypedNumber = DocumentFieldMap["TypedNumberContext"].Peek().Last() as TypedNumber
            });
        }

        public override void ExitEnumField([NotNull] EnumFieldContext context)
        {
            base.ExitEnumField(context);

            string typeName = GetTypeName(context);

            EnumField enumField = new();

            if(DocumentFieldMap.TryGetValue("PrelimContext",out Stack<List<object>>? prelimStack) && prelimStack is not null && prelimStack.Count > 0)
            {
                enumField.PrelimList = [..prelimStack.Pop().Cast<Prelim>()];
            }
            if (DocumentFieldMap.TryGetValue("AttributeContext", out Stack<List<object>>? attributeStack) && attributeStack is not null && attributeStack.Count > 0)
            {
                enumField.AttributeList = [.. attributeStack.Pop().Cast<MCDocumentAttribute>()];
            }
            if (DocumentFieldMap.TryGetValue("IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack is not null && identifierStack.Count > 0)
            {
                enumField.Key = identifierStack.Pop().Last().ToString();
            }
            if (DocumentFieldMap.TryGetValue("EnumValueContext", out Stack<List<object>>? enumValueStack) && enumValueStack is not null && enumValueStack.Count > 0)
            {
                enumField.Value = enumValueStack.Pop().Last() as EnumValue;
            }

            PushToStack(typeName,enumField);
        }

        public override void ExitStringType([NotNull] StringTypeContext context)
        {
            base.ExitStringType(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            string range = "";
            int atIndex = currentValue.IndexOf('@');
            if(atIndex > -1)
            {
                range = currentValue.Trim()[(atIndex + 1)..];
            }

            PushToStack(typeName,new StringType()
            {
                Range = range
            });
        }

        public override void ExitLiteralType([NotNull] LiteralTypeContext context)
        {
            base.ExitLiteralType(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();

            LiteralType literalType = new();

            if (boolValueOfLiteralType)
            {
                boolValueOfLiteralType = false;
                literalType.BoolValue = bool.Parse(currentValue);
            }

            if (typedNumberOfLiteralType)
            {
                typedNumberOfLiteralType = false;
                if (DocumentFieldMap.TryGetValue("TypedNumberContext", out Stack<List<object>> typedNumberStack) && typedNumberStack is not null && typedNumberStack.Count > 0)
                {
                    literalType.TypedNumber = typedNumberStack.Pop().Last() as TypedNumber;
                }
            }
            
            if (stringValueOfLiteralType)
            {
                stringValueOfLiteralType = false;
                if (DocumentFieldMap.TryGetValue("StringContext", out Stack<List<object>> stringStack) && stringStack is not null && stringStack.Count > 0)
                {
                    literalType.String = DocumentFieldMap["StringContext"].Pop().Last().ToString();
                }
            }

            if (identifierOfLiteralType)
            {
                identifierOfLiteralType = false;
                if (DocumentFieldMap.TryGetValue("IdentifierContext", out Stack<List<object>> identifierStack) && identifierStack is not null && identifierStack.Count > 0)
                {
                    literalType.Identifier = DocumentFieldMap["IdentifierContext"].Pop().Last().ToString();
                }
            }

            PushToStack(typeName, literalType);
        }

        public override void ExitNumericType([NotNull] NumericTypeContext context)
        {
            base.ExitNumericType(context);
            NumericType numericType = new();
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            int atIndex = currentValue.IndexOf('@');
            if(atIndex > -1)
            {
                numericType.Range = currentValue[(atIndex + 1)..].Trim();
            }

            if(DocumentFieldMap.TryGetValue("BaseDataTypeContext",out Stack<List<object>> baseDataTypeStack) && baseDataTypeStack is not null && baseDataTypeStack.Count > 0)
            {
                numericType.BaseDataType = (BaseDataType)System.Enum.Parse(typeof(BaseDataType), baseDataTypeStack.Pop().Last().ToString());
            }

            PushToStack(typeName, numericType);
        }

        public override void ExitPrimitiveArrayType([NotNull] PrimitiveArrayTypeContext context)
        {
            base.ExitPrimitiveArrayType(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            int atIndex = currentValue.IndexOf('@');
            PrimitiveArrayType primitiveArrayType = new();

            if (atIndex > -1)
            {
                primitiveArrayType.Range = currentValue[(atIndex + 1)..].Trim();
                primitiveArrayType.DataType = (PrimitiveArrayDataType)System.Enum.Parse(typeof(PrimitiveArrayDataType), currentValue.Trim()[..atIndex]);
            }
            else
            {
                primitiveArrayType.DataType = (PrimitiveArrayDataType)System.Enum.Parse(typeof(PrimitiveArrayDataType), currentValue.Trim());
            }

            PushToStack(typeName, primitiveArrayType);
        }

        public override void ExitListType([NotNull] ListTypeContext context)
        {
            base.ExitListType(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();

            ListType listType = new()
            {
                Type = DocumentFieldMap["TypeSentenceContext"].Peek().Last() as MCDocumentType
            };

            int atIndex = currentValue.LastIndexOf('@');
            if(atIndex > -1)
            {
                listType.Range = currentValue[(atIndex + 1)..].Trim();
            }

            PushToStack(typeName, listType);
        }

        public override void ExitTupleType([NotNull] TupleTypeContext context)
        {
            base.ExitTupleType(context);
            string typeName = GetTypeName(context);

            MCDocumentType[] typeList = [..DocumentFieldMap["TypeSentenceContext"].Pop().Cast<MCDocumentType>()];

            PushToStack(typeName,new TupleType()
            {
                Type1 = typeList[0],
                Type2 = typeList[1]
            });
        }

        public override void ExitPrelim([NotNull] PrelimContext context)
        {
            base.ExitPrelim(context);
            string typeName = GetTypeName(context);
            List<string> commentaryList = [];
            List<string> docCommentaryList = [];
            if(DocumentFieldMap.TryGetValue("CommentaryContext",out Stack<List<object>> CommentaryStack) && CommentaryStack.Count > 0)
            {
                List<string> CommentaryList = [..CommentaryStack.Pop().Cast<string>()];
                commentaryList.AddRange(CommentaryList.Cast<string>());
            }
            if(DocumentFieldMap.TryGetValue("DocCommentaryContext",out Stack<List<object>> DocCommentaryStack) && DocCommentaryStack.Count > 0)
            {
                List<string> DocCommentaryList = [.. DocCommentaryStack.Pop().Cast<string>()];
                docCommentaryList.AddRange(DocCommentaryList.Cast<string>());
            }
            MCDocumentAttribute? attribute = null;
            if(DocumentFieldMap.TryGetValue("AttributeContext",out Stack<List<object>> AttributeStack))
            {
                attribute = AttributeStack.Pop().Cast<MCDocumentAttribute>().First();
            }

            PushToStack(typeName,new Prelim()
            {
                CommentaryList = commentaryList,
                DocCommentaryList = docCommentaryList,
                Attribute = attribute
            });
        }

        public override void ExitDispatcherType([NotNull] DispatcherTypeContext context)
        {
            base.ExitDispatcherType(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new DispatchType()
            {
                ResourceLocation = DocumentFieldMap["ResourceLocationContext"].Pop().Last().ToString(),
                DispatcherIndexBody = DocumentFieldMap["IndexBodyContext"].Pop().Last() as IndexBody
            });
        }

        public override void ExitUnionType([NotNull] UnionTypeContext context)
        {
            base.ExitUnionType(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new UnionType()
            {
                TypeList = [..DocumentFieldMap["TypeSentenceContext"].Pop().Cast<MCDocumentType>()]
            });
        }

        public override void ExitIndexBody([NotNull] IndexBodyContext context)
        {
            base.ExitIndexBody(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new IndexBody()
            {
                IndexList = [..DocumentFieldMap["IndexContext"].Pop().Cast<string>()]
            });
        }

        public override void ExitIndexingOnAType([NotNull] IndexingOnATypeContext context)
        {
            base.ExitIndexingOnAType(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new IndexOnAType()
            {
                IndexBody = DocumentFieldMap["IndexBodyContext"].Pop().Last() as IndexBody
            });
        }

        public override void ExitTypeArgBlock([NotNull] TypeArgBlockContext context)
        {
            base.ExitTypeArgBlock(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new TypeArgBlock()
            {
                TypeList = [.. DocumentFieldMap["TypeSentenceContext"].Pop().Cast<MCDocumentType>()]
            });
        }

        public override void ExitUnAttributedType([NotNull] UnAttributedTypeContext context)
        {
            base.ExitUnAttributedType(context);
            string typeName = GetTypeName(context);
            UnAttributedType unAttributedType = new();

            if (keywordTypeOfUnAttributedType)
            {
                keywordTypeOfUnAttributedType = false;
                unAttributedType.KeyWordType = DocumentFieldMap["KeywordTypeContext"].Pop().Last() as KeyWordType;
            }
            if (stringTypeOfUnAttributedType)
            {
                stringTypeOfUnAttributedType = false;
                unAttributedType.StringType = DocumentFieldMap["StringTypeContext"].Pop().Last() as StringType;
            }
            if (literialTypeOfUnAttributedType)
            {
                literialTypeOfUnAttributedType = false;
                unAttributedType.LiteralType = DocumentFieldMap["LiteralTypeContext"].Pop().Last() as LiteralType;
            }
            if (numericTypeOfUnAttributedType)
            {
                numericTypeOfUnAttributedType = false;
                unAttributedType.NumericType = DocumentFieldMap["NumericTypeContext"].Pop().Last() as NumericType;
            }
            if (primitiveArrayTypeOfUnAttributedType)
            {
                primitiveArrayTypeOfUnAttributedType = false;
                unAttributedType.PrimitiveArrayType = DocumentFieldMap["PrimitiveArrayTypeContext"].Pop().Last() as PrimitiveArrayType;
            }
            if (listTypeOfUnAttributedType)
            {
                listTypeOfUnAttributedType = false;
                unAttributedType.ListType = DocumentFieldMap["ListTypeContext"].Pop().Last() as ListType;
            }
            if (tupleTypeOfUnAttributedType)
            {
                tupleTypeOfUnAttributedType = false;
                unAttributedType.TupleType = DocumentFieldMap["TupleTypeContext"].Pop().Last() as TupleType;
            }
            if (enumTypeOfUnAttributedType)
            {
                enumTypeOfUnAttributedType = false;
                unAttributedType.EnumType = DocumentFieldMap["EnumTypeContext"].Pop().Last() as Enumeration;
            }
            if (structOfUnAttributedType)
            {
                structOfUnAttributedType = false;
                unAttributedType.Structure = DocumentFieldMap["StructContext"].Pop().Last() as Structure;
            }
            if (referenceOfUnAttributedType)
            {
                referenceOfUnAttributedType = false;
                unAttributedType.ReferenceType = DocumentFieldMap["ReferenceTypeContext"].Pop().Last() as ReferenceType;
            }
            if (dispatcherTypeOfUnAttributedType)
            {
                dispatcherTypeOfUnAttributedType = false;
                unAttributedType.DispatchType = DocumentFieldMap["DispatcherTypeContext"].Pop().Last() as DispatchType;
            }
            if (unionTypeOfUnAttributedType)
            {
                unionTypeOfUnAttributedType = false;
                unAttributedType.UnionType = DocumentFieldMap["UnionTypeContext"].Pop().Last() as UnionType;
            }
            if (indexingOnATypeOfUnAttributedType)
            {
                indexingOnATypeOfUnAttributedType = false;
                unAttributedType.IndexOnAType = DocumentFieldMap["IndexingOnATypeContext"].Pop().Last() as IndexOnAType;
            }

            PushToStack(typeName,unAttributedType);
        }

        public override void ExitStructField([NotNull] StructFieldContext context)
        {
            base.ExitStructField(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new StructField()
            {
                IsOptional = DocumentFieldMap["QuestionMarkContext"].Pop()?.Cast<bool>().Last(),
                IsReference = DocumentFieldMap["TripleDotContext"].Pop().Count > 0,
                AttributeList = [..DocumentFieldMap["AttributeContext"].Pop().Cast<MCDocumentAttribute>()],
                StructKey = DocumentFieldMap["StructKeyContext"].Pop().Cast<StructKey>().Last(),
                PrelimList = [..DocumentFieldMap["PrelimContext"].Pop().Cast<Prelim>()],
                Type = DocumentFieldMap["TypeSentenceContext"].Pop().Last() as MCDocumentType
            });
        }

        public override void ExitAttribute([NotNull] AttributeContext context)
        {
            base.ExitAttribute(context);
            string typeName = GetTypeName(context);
            MCDocumentAttribute attribute = new()
            {
                Identifier = DocumentFieldMap["IdentifierContext"].Pop().Last().ToString()
            };
            if(valueOfParent)
            {
                valueOfParent = false;
                attribute.Value = DocumentFieldMap["ValueContext"].Pop().Last() as MCDocumentValue;
            }
            if(treeValueOfParent)
            {
                treeValueOfParent = false;
                attribute.TreeValue = DocumentFieldMap["TreeValueContext"].Pop().Last() as MCDocumentTreeValue;
            }

            PushToStack(typeName,attribute);
        }

        public override void ExitValue([NotNull] ValueContext context)
        {
            base.ExitValue(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName, new MCDocumentValue()
            {
                Type = DocumentFieldMap.TryGetValue("TypeSentenceContext", out Stack<List<object>>? TypeSentenceValue) ? TypeSentenceValue.Pop().Last() as MCDocumentType : null,
                TreeValue = DocumentFieldMap.TryGetValue("TreeValueContext",out Stack<List<object>>? TreeValueValue) ? TreeValueValue.Pop().Last() as MCDocumentTreeValue:null
            });
        }

        public override void ExitNamedValue([NotNull] NamedValueContext context)
        {
            base.ExitNamedValue(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            string inlineValue = "";
            NamedValue namedValue = new();
            if(currentValue.TrimStart().StartsWith('"'))
            {
                inlineValue = DocumentFieldMap["StringContext"].Pop().Last().ToString();
                namedValue.String = inlineValue;
            }
            else
            {
                inlineValue = DocumentFieldMap["IdentifierContext"].Pop().Last().ToString();
                namedValue.Identifier = inlineValue;
            }

            if(currentValue[(inlineValue.Length + 1)..((inlineValue.Length + 2))] == "=")
            {
                namedValue.Value = DocumentFieldMap["ValueContext"].Pop().Last() as MCDocumentValue;
            }
            else
            {
                namedValue.TreeValue = DocumentFieldMap["TreeValueContext"].Pop().Last() as MCDocumentTreeValue;
            }

            PushToStack(typeName,namedValue);
        }

        public override void ExitNamedValues([NotNull] NamedValuesContext context)
        {
            base.ExitNamedValues(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new NamedValues()
            {
                NameValueList = [..DocumentFieldMap["NamedValueContext"].Pop().Cast<NamedValue>()]
            });
        }

        public override void ExitTreeBody([NotNull] TreeBodyContext context)
        {
            base.ExitTreeBody(context);
            string typeName = GetTypeName(context);
            MCDocumentTreeBody treeBody = new();

            if(positionalValuesOfTreeBody)
            {
                treeBody.PositionalValueList = [..DocumentFieldMap["PositionalValuesContext"].Pop().Cast<PositionalValue>()];
                positionalValuesOfTreeBody = false;
            }
            if(namedValuesOfTreeBody)
            {
                treeBody.NamedValueList = [..DocumentFieldMap["NamedValuesContext"].Pop().Cast<NamedValues>()];
                namedValuesOfTreeBody = false;
            }

            PushToStack(typeName,treeBody);
        }

        public override void ExitTreeValue([NotNull] TreeValueContext context)
        {
            base.ExitTreeValue(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new MCDocumentTreeValue()
            {
                TreeBody = DocumentFieldMap["TreeBodyContext"].Pop().Last() as MCDocumentTreeBody
            });
        }

        public override void ExitPositionalValues([NotNull] PositionalValuesContext context)
        {
            base.ExitPositionalValues(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new PositionalValue()
            {
                ValueList = [..DocumentFieldMap["ValueContext"].Pop().Cast<MCDocumentValue>()]
            });
        }
        #endregion

        #region 收集顶层数据

        public override void ExitUseStatement([NotNull] UseStatementContext context)
        {
            base.ExitUseStatement(context);
            string typeName = GetTypeName(context);

            string? currentPath = "";
            string? currentName = "";
            if (DocumentFieldMap.TryGetValue("PathContext", out Stack<List<object>>? pathStack)
                && pathStack.Peek() is List<object> pathList && pathList.Count > 0 && pathList[0] is string path)
            {
                currentPath = path;
            }
            if (DocumentFieldMap.TryGetValue("IdentifierContext", out Stack<List<object>>? identifierStack) && identifierStack.Peek() is List<object> identifierList && identifierList.Count > 0 && identifierList[0] is string identifier)
            {
                currentName = identifier;
            }

            PushToStack(typeName,new UseStatement()
            {
                Path = currentPath,
                Name = currentName
            });
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
                structKey.Type = DocumentFieldMap["TypeSentenceContext"].Pop().Last() as MCDocumentType;
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
            Structure structure = new()
            {
                PrelimList = [..DocumentFieldMap["PrelimContext"].Pop().Cast<Prelim>()],
                Identifier = DocumentFieldMap["IdentifierContext"].Pop().Cast<string>().Last(),
                StructFieldList = [..DocumentFieldMap["StructFieldContext"].Pop().Cast<StructField>()]
            };

            PushToStack(typeName,structure);
        }

        public override void ExitTypeSentence([NotNull] TypeSentenceContext context)
        {
            base.ExitTypeSentence(context);
            string typeName = GetTypeName(context);
            MCDocumentType type = new();
            if(attributeOfParent)
            {
                attributeOfParent = false;
                type.AttributeList = [..DocumentFieldMap["AttributeContext"].Pop().Cast<MCDocumentAttribute>()];
            }

            type.UnAttributedType = DocumentFieldMap["UnAttributedTypeContext"].Pop().Last() as UnAttributedType;

            if(indexBodyOfParent)
            {
                indexBodyOfParent = false;
                type.IndexBodyList = [.. DocumentFieldMap["IndexBodyContext"].Pop().Cast<IndexBody>()];
            }
            if(typeArgBlockOfParent)
            {
                typeArgBlockOfParent = false;
                type.TypeArgBlockList = [.. DocumentFieldMap["TypeArgBlockContext"].Pop().Cast<TypeArgBlock>()];
            }

            PushToStack(typeName, type);
        }

        public override void ExitEnumType([NotNull] EnumTypeContext context)
        {
            base.ExitEnumType(context);
            string typeName = GetTypeName(context);

            PushToStack(typeName,new Enumeration()
            {
                Name = DocumentFieldMap["IdentifierContext"].Pop().Last().ToString(),
                Prelim = DocumentFieldMap["PrelimContext"].Pop().Last() as Prelim,
                EnumFieldList = [.. DocumentFieldMap["EnumFieldContext"].Pop().Cast<EnumField>()],
                MemberType = (EnumMemberType)System.Enum.Parse(typeof(EnumMemberType), DocumentFieldMap["EnumMemberTypeContext"].Peek().Last().ToString())
            });
        }

        public override void ExitTypeAlias([NotNull] TypeAliasContext context)
        {
            base.ExitTypeAlias(context);
            string typeName = GetTypeName(context);
            TypeAlia typeAlia = new();
            if(prelimOfParent)
            {
                prelimOfParent = false;
                typeAlia.PrelimList = [..DocumentFieldMap["PrelimContext"].Pop().Cast<Prelim>()];
            }
            typeAlia.Identifier = DocumentFieldMap["IdentifierContext"].Pop().ToString();
            typeAlia.TypeParameterBlock = [.. DocumentFieldMap["TypeParamBlockContext"].Pop().Cast<string>()];
            typeAlia.TypeSentence = DocumentFieldMap["TypeSentenceContext"].Pop().Last() as MCDocumentType;

            PushToStack(typeName, typeAlia);
        }

        public override void ExitInjection([NotNull] InjectionContext context)
        {
            base.ExitInjection(context);
            string typeName = GetTypeName(context);
            Injection injection = new();
            if(enumInjectionOfParent)
            {
                enumInjectionOfParent = false;
                injection.EnumInjection = DocumentFieldMap["EnumInjectionContext"].Pop().Last() as EnumInjection;
            }
            if(structInjectionOfParent)
            {
                structInjectionOfParent = false;
                injection.StructInjection = DocumentFieldMap["StructInjectionContext"].Pop().Last() as StructInjection;
            }

            PushToStack(typeName,injection);
        }

        public override void ExitDispatchStatement([NotNull] DispatchStatementContext context)
        {
            base.ExitDispatchStatement(context);
            string typeName = GetTypeName(context);
            DispatchStatement dispatchStatement = new();
            dispatchStatement.Prelim = DocumentFieldMap["PrelimContext"].Pop().Last() as Prelim;
            if(attributeOfParent)
            {
                attributeOfParent = false;
                dispatchStatement.AttributeList = [.. DocumentFieldMap["AttributeContext"].Pop().Cast<MCDocumentAttribute>()];
            }
            dispatchStatement.ResourceLocation = DocumentFieldMap["ResourceLocationContext"].Pop().Last().ToString();
            dispatchStatement.IndexBody = DocumentFieldMap["IndexBodyContext"].Pop().Last() as IndexBody;
            if(typeArgBlockOfParent)
            {
                typeArgBlockOfParent = false;
                dispatchStatement.TypeParameterBlock = [..DocumentFieldMap["TypeParamBlockContext"].Pop().Cast<string>()];
            }
            dispatchStatement.Type = DocumentFieldMap["TypeSentenceContext"].Pop().Last() as MCDocumentType;

            PushToStack(typeName,dispatchStatement);
        }
        #endregion

        #endregion
    }
}
