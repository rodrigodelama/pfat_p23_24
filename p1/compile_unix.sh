# pfat_p23_24
# From root directory of the project run the following commands:

# ISA debes usar: (UNIX) sin comillas siempre
# javac -cp .;java-cup-11b-runtime.jar -d . *.java

# IGNORAR ESTE PASO (SOLO has compilado ya JLex, no guardamos los .class en GitHub)
# no hace falta borrar y compilar esto una y otra vez
# cd ../java
# javac -d ../class JLex/*.java

cd p1/java
javac -d ../class Errors/*.java
javac -d ../class AST/*.java
cd Parser
java -jar ../../class/java-cup-11b.jar parser
mv *.java ../../class/
cd ../../class/
javac -cp .;java-cup-11b-runtime.jar -d . *.java
rm parser.java
rm sym.java
cd ../java/Lexer
java -cp ../../class JLex.Main Yylex
mv Yylex.java ../../class/Yylex.java
cd ../../class/
javac -cp .;java-cup-11b-runtime.jar -d . Yylex.java
rm Yylex.java
cp ../java/Main.java ../class/Main.java
javac -cp .;java-cup-11b-runtime.jar -d . Main.java
rm Main.java

# Now you can run the program with the following command:
java -cp .;java-cup-11b-runtime.jar" Main filename.prg

# More examples in the testing.sh file


# To clean up after execution (for next compilation)
rm AST
rm Errors
rm Parser
rm *.java
