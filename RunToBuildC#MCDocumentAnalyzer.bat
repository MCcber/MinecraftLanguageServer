java -jar antlr-4.13.2-complete.jar -o .\MCDocumentRuleToken\Lexer\C# %cd%\MCDocumentRule\mcdocLexer.g4

java -jar antlr-4.13.2-complete.jar -lib .\MCDocumentRuleToken\Lexer\C# -o .\MCDocumentRuleToken\Parser\C# %cd%\MCDocumentRule\mcdocParser.g4