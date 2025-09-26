using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using MinecraftLanguageServer.Model.MCDocument;
using MinecraftLanguageServer.Model.MCDocument.EnumContent;
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
            string value = type.ToString();
            MethodInfo[] methodArray = type.GetMethods(BindingFlags.Public | BindingFlags.Instance | BindingFlags.DeclaredOnly);
            for (int i = 0; i < methodArray.Length; i++)
            {
                if(methodArray[i].ReturnType != typeof(ParserRuleContext) && methodArray[i].ReturnType.BaseType is null)
                {
                    typeName = GetTypeName(context);
                    string currentValue = context.GetText().Trim();
                    if(DocumentFieldMap.TryGetValue(typeName,out Stack<List<object>>? list) && list is not null)
                    {
                        DocumentFieldMap[typeName].Peek().Add(currentValue);
                    }
                }
            }

            boolValueOfLiteralType = context is BoolValueContext;
            typedNumberOfLiteralType = context is TypedNumberContext;
            stringValueOfLiteralType = context is StringContext;
            identifierOfLiteralType = context is IdentifierContext;
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
            DocumentFieldMap[typeName].Peek().Add(typedNumber);
        }

        public override void ExitEnumValue([NotNull] EnumValueContext context)
        {
            base.ExitEnumValue(context);

            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            string stringValue = currentValue.TrimStart().StartsWith('"') ? currentValue : "";
            
            DocumentFieldMap[typeName].Peek().Add(new EnumValue()
            {
                String = stringValue,
                TypedNumber = DocumentFieldMap["TypedNumberContext"].Peek().Last() as TypedNumber
            });
        }

        public override void ExitEnumField([NotNull] EnumFieldContext context)
        {
            base.ExitEnumField(context);

            string typeName = GetTypeName(context);

            DocumentFieldMap[typeName].Peek().Add(new EnumField()
            {
                PrelimList = [..DocumentFieldMap["PrelimContext"].Pop().Cast<Prelim>()],
                AttributeList = [.. DocumentFieldMap["AttributeContext"].Pop().Cast<MCDocumentAttribute>()],
                Key = DocumentFieldMap["IdentifierContext"].Pop().Last().ToString(),
                Value = DocumentFieldMap["EnumValueContext"].Pop().Last() as EnumValue,
            });
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
            DocumentFieldMap["StringTypeContext"].Peek().Add(new StringType()
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
                literalType.BoolValue = bool.Parse(currentValue);
            }
            if (typedNumberOfLiteralType)
            {
                literalType.TypedNumber = DocumentFieldMap["TypedNumberContext"].Pop().Last() as TypedNumber;
            }
            if (stringValueOfLiteralType)
            {
                literalType.String = DocumentFieldMap["StringContext"].Pop().Last().ToString();
            }
            if (identifierOfLiteralType)
            {
                literalType.Identifier = DocumentFieldMap["IdentifierContext"].Pop().Last().ToString();
            }

            DocumentFieldMap[typeName].Peek().Add(literalType);
        }

        public override void ExitNumericType([NotNull] NumericTypeContext context)
        {
            base.ExitNumericType(context);
            string typeName = GetTypeName(context);
            string currentValue = context.GetText();
            int atIndex = currentValue.IndexOf('@');
            string range = "";
            if(atIndex > -1)
            {
                range = currentValue[(atIndex + 1)..].Trim();
            }

            DocumentFieldMap[typeName].Peek().Add(new NumericType()
            {
                BaseDataType = (BaseDataType)System.Enum.Parse(typeof(BaseDataType), DocumentFieldMap["BaseDataTypeContext"].Pop().Last().ToString()),
                Range = range
            });
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
            DocumentFieldMap[typeName].Peek().Add(primitiveArrayType);
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

            DocumentFieldMap[typeName].Peek().Add(listType);
        }

        public override void ExitTupleType([NotNull] TupleTypeContext context)
        {
            base.ExitTupleType(context);
            string typeName = GetTypeName(context);

            MCDocumentType[] typeList = [..DocumentFieldMap["TypeSentenceContext"].Pop().Cast<MCDocumentType>()];
            DocumentFieldMap[typeName].Peek().Add(new TupleType()
            {
                Type1 = typeList[0],
                Type2 = typeList[1]
            });
        }

        public override void ExitAttribute([NotNull] AttributeContext context)
        {
            base.ExitAttribute(context);
        }

        public override void ExitPrelim([NotNull] PrelimContext context)
        {
            base.ExitPrelim(context);
            string typeName = GetTypeName(context);
            List<string> commentaryList = [..DocumentFieldMap["CommentaryContext"].Pop().Cast<string>()];
            List<string> docCommentaryList = [.. DocumentFieldMap["DocCommentaryContext"].Pop().Cast<string>()];
            MCDocumentAttribute attribute = DocumentFieldMap["AttributeContext"].Pop().Cast<MCDocumentAttribute>().First();
            DocumentFieldMap[typeName].Peek().Add(new Prelim()
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

            DocumentFieldMap[typeName].Peek().Add(new DispatchType()
            {
                ResourceLocation = DocumentFieldMap["ResourceLocationContext"].Pop().Last().ToString(),
                DispatcherIndexBody = DocumentFieldMap["IndexBodyContext"].Pop().Last() as IndexBody
            });
        }

        public override void ExitUnionType([NotNull] UnionTypeContext context)
        {
            base.ExitUnionType(context);
            string typeName = GetTypeName(context);
            DocumentFieldMap[typeName].Peek().Add(new UnionType()
            {
                TypeList = [..DocumentFieldMap["TypeSentenceContext"].Pop().Cast<MCDocumentType>()]
            });
        }

        public override void ExitIndexBody([NotNull] IndexBodyContext context)
        {
            base.ExitIndexBody(context);
            string typeName = GetTypeName(context);

            DocumentFieldMap[typeName].Peek().Add(new IndexBody()
            {
                IndexList = [..DocumentFieldMap["IndexContext"].Pop().Cast<string>()]
            });
        }

        public override void ExitIndexingOnAType([NotNull] IndexingOnATypeContext context)
        {
            base.ExitIndexingOnAType(context);
            string typeName = GetTypeName(context);

            DocumentFieldMap[typeName].Peek().Add(new IndexOnAType()
            {
                IndexBody = DocumentFieldMap["IndexBodyContext"].Pop().Last() as IndexBody
            });
        }

        public override void ExitTypeArgBlock([NotNull] TypeArgBlockContext context)
        {
            base.ExitTypeArgBlock(context);
            string typeName = GetTypeName(context);

            DocumentFieldMap[typeName].Peek().Add(new TypeArgBlock()
            {
                TypeList = [.. DocumentFieldMap["TypeSentenceContext"].Pop().Cast<MCDocumentType>()]
            });
        }

        public override void ExitStructField([NotNull] StructFieldContext context)
        {
            base.ExitStructField(context);
            string typeName = GetTypeName(context);
            DocumentFieldMap[typeName].Peek().Add(new StructField()
            {
                IsOptional = DocumentFieldMap["QuestionMarkContext"].Pop()?.Cast<bool>().Last(),
                IsReference = DocumentFieldMap["TripleDotContext"].Pop().Count > 0,
                AttributeList = [..DocumentFieldMap["AttributeContext"].Pop().Cast<MCDocumentAttribute>()],
                StructKey = DocumentFieldMap["StructKeyContext"].Pop().Cast<StructKey>().Last(),
                PrelimList = [..DocumentFieldMap["PrelimContext"].Pop().Cast<Prelim>()],
                Type = DocumentFieldMap["TypeSentenceContext"].Pop().Last() as MCDocumentType
            });
        }

        public override void ExitUnAttributedType([NotNull] UnAttributedTypeContext context)
        {
            base.ExitUnAttributedType(context);
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
            DocumentFieldMap[typeName].Peek().Add(new UseStatement()
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
            DocumentFieldMap[typeName].Peek().Add(structKey);
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
            DocumentFieldMap[typeName].Peek().Add(structure);
        }

        public override void ExitTypeSentence([NotNull] TypeSentenceContext context)
        {
            base.ExitTypeSentence(context);
        }

        public override void ExitEnumType([NotNull] EnumTypeContext context)
        {
            base.ExitEnumType(context);
            string typeName = GetTypeName(context);

            DocumentFieldMap[typeName].Peek().Add(new Enumeration()
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
        }

        public override void ExitInjection([NotNull] InjectionContext context)
        {
            base.ExitInjection(context);
        }

        public override void ExitDispatchStatement([NotNull] DispatchStatementContext context)
        {
            base.ExitDispatchStatement(context);
        }
        #endregion

        #endregion
    }
}
