# pfat_p23_24
# From the pX directory you desire run the following commands:

cd java
javac -d ../class Errors/*.java
javac -d ../class AST/*.java
cd Parser
java -jar ../../class/java-cup-11b.jar parser
mv *.java ../../class/
cd ../../class/
javac -cp .:java-cup-11b-runtime.jar -d . *.java
rm *.java
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
java -cp .:java-cup-11b-runtime.jar Main filename.prg

# Examples ready to run in the testing.sh file

# To clean up after execution (for next compilation)
# rm AST
# rm Errors
# rm Parser
# rm *.java
