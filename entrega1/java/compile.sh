# Rodrigo De Lama
# Isabel Schweim

# pfat_p23_24/entrega1/java

#!/bin/bash

javac -d ../class Errors/*.java
javac -d ../class AST/*.java
cd Parser
java -jar ../../class/java-cup-11b.jar parser
mv *.java ../../class/
cd ../../class/
javac -cp .:java-cup-11b-runtime.jar -d . *.java
rm parser.java
rm sym.java
cd ../java
javac -d ../class JLex/*.java
cd Lexer
java -cp ../../class JLex.Main Yylex
mv Yylex.java ../../class/Yylex.java
cd ../../class/
javac -cp .:java-cup-11b-runtime.jar -d . Yylex.java
rm Yylex.java
cp ../java/Main.java ../class/Main.java
javac -cp .:java-cup-11b-runtime.jar -d . Main.java
rm Main.java

# Now you can run the program with the following command:
# java -cp .;java-cup-11b-runtime.jar" Main filename.prg
