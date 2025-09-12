java -jar antlr-4.13.2-complete.jar -o .\MCDocumentRuleToken\Lexer %cd%\MCDocumentRule\mcdocLexer.g4
java -jar antlr-4.13.2-complete.jar -o .\MCDocumentRuleToken\Parser %cd%\MCDocumentRule\mcdocParser.g4
javac -cp ".\antlr-4.13.2-complete.jar;." %cd%\MCDocumentRuleToken\Parser\*.java %cd%\MCDocumentRuleToken\Lexer\*.java
java -cp ".;.\MCDocumentRuleToken\Parser;.\MCDocumentRuleToken\Lexer;.\antlr-4.13.2-complete.jar;" org.antlr.v4.gui.TestRig mcdocParser file -tokens -gui < code.mcdoc