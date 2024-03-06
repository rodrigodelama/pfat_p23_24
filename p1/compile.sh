# pfat_p23_24
# from root directory of the project run the following commands

cd p1/java
javac -d ../class Errors/*.java
javac -d ../class AST/*.java
cd Parser
java -jar ../../class/java-cup-11b.jar parser
mv *.java ../../class/
cd ../../class/
javac -cp ".;java-cup-11b-runtime.jar" -d . *.java
        # ISA debes usar: (UNIX)
        javac -cp .;java-cup-11b-runtime.jar -d . *.java
rm parser.java
rm sym.java
        # IGNORAR ESTE PASO
        # no hace falta borrar y compilar esto una y otra vez
        # cd ../java
        # javac -d ../class JLex/*.java
cd ../java/Lexer
java -cp ../../class JLex.Main Yylex
mv Yylex.java ../../class/Yylex.java
cd ../../class/
javac -d . Yylex.java
rm Yylex.java
cp ../java/Main.java ../class/Main.java
javac -d . Main.java
rm Main.java
rm AST
rm Errors
        # rm JLex
rm *.java