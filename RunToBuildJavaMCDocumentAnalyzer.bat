java -jar antlr-4.13.2-complete.jar -o .\MCDocumentRuleToken\Lexer\Java %cd%\MCDocumentRule\mcdocLexer.g4

java -jar antlr-4.13.2-complete.jar -lib .\MCDocumentRuleToken\Lexer\Java -o .\MCDocumentRuleToken\Parser\Java %cd%\MCDocumentRule\mcdocParser.g4

javac -cp ".\antlr-4.13.2-complete.jar;." %cd%\MCDocumentRuleToken\Lexer\Java\*.java

javac -cp ".\antlr-4.13.2-complete.jar;." %cd%\MCDocumentRuleToken\Parser\Java\*.java

java -cp ".;.\MCDocumentRuleToken\Lexer\Java;.\MCDocumentRuleToken\Parser\Java;.\antlr-4.13.2-complete.jar;" org.antlr.v4.gui.TestRig mcdoc file -tokens -gui < code.mcdoc