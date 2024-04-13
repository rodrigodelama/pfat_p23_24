rm AST
rm *.class
cd ..

cd java
javac -d ../class AST/*.java
cd ../class/
cp ../java/Main.java ../class/Main.java
javac -cp ".;java-cup-11b-runtime.jar" -d . Main.java >$null 2>&1
rm Main.java