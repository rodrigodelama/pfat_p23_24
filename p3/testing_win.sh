# When Main.class is created, you can run the program with the following command:
# From the pX class directory, run the following command:
# pfat_p23_24/pX/class/

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem1/ejem1.prg
javac ejem1.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem2/ejem2.prg
javac ejem2.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem3/ejem3.prg
javac ejem3.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem4/ejem4.prg
javac ejem4.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem5/ejem5.prg
javac ejem5.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem6/ejem6.prg
javac ejem6.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem7/ejem7.prg
javac ejem7.java
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem8/ejem8.prg
javac ejem8.java

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/EjemN1/ejem1.prg
javac ejem1.java

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/EjemN2/ejem2.prg
javac ejem2.java

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/EjemN3/ejem3.prg
javac ejem3.java

# ejem9 was made by me :)
# java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/Ejem9/ejem9.prg
# javac ejem9.java

# To test the generated files
java ejem1
java ejem2
java ejem3
java ejem4
java ejem5
java ejem6
java ejem7
java ejem8

# To clean up the generated files
rm ejem*

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSint1/errSint1.prg
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSint2/errSint2.prg
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSint3/errSint3.prg

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrLex1/errLex1.prg

java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSem1/errSem1.prg
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSem2/errSem2.prg
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSem3/errSem3.prg
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSem4/errSem4.prg
java -cp ".;java-cup-11b-runtime.jar" Main ../ejemplos/ErrSem5/errSem5.prg

