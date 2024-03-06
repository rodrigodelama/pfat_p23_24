cd p1/java
javac -d ../class Errors/*.java
javac -d ../class AST/*.java
cd Parser
java -jar ../../class/java-cup-11b.jar parser
mv *.java ../../class/
cd ../../class/
javac -cp ".;java-cup-11b-runtime.jar" -d . *.java
        ISA debes usar javac -cp .;java-cup-11b-runtime.jar -d . *.java
rm parser.java
rm sym.java
cd ../java
javac -d ../class JLex/*.java
cd Lexer
java -cp ../../class JLex.Main Yylex
mv Yylex.java ../../class/Yylex.java
cd ../../class/
javac -d . Yylex.java
rm Yylex.java
cp ../java/Main.java ../class/Main.java
javac -d . Main.java
rm Main.java