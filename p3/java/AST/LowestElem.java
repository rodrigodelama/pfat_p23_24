/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class LowestElem implements Exp {
    public final Exp exp;

    public LowestElem(Exp exp) {
        this.exp = exp;
    }

    public int computeTyp() throws CompilerExc {
        int ct;
        ct = exp.computeTyp();

        if (ct == Typ.t_intset) {
            return Typ.t_int;
        } else {
            throw new TypExc("ERROR: en LowestElem");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        //FIXME: review GenCode for finding the lowest element of an integer array
    /*
        // Method to find the lowest element of an integer array
        public static int findMin(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array must not be empty or null");
            }
            int min = array[0]; // Assume the first element is the minimum
            // Iterate through the array to find the actual minimum
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i]; // Update min if current element is smaller
                }
            }
            return min;
        }
     */
        w.write("int[] array = ");
        exp.generateCode(w);
        w.write(";\n");
        w.newLine();
        w.write("if (array == null || array.length == 0) {\n");
        w.newLine();
        w.write("    throw new IllegalArgumentException(\"Array must not be empty or null\");\n");
        w.newLine();
        w.write("}\n");
        w.newLine();
        w.write("int min = array[0];\n");
        w.newLine();
        w.write("for (int i = 1; i < array.length; i++) {\n");
        w.newLine();
        w.write("    if (array[i] < min) {\n");
        w.newLine();
        w.write("        min = array[i];\n");
        w.newLine();
        w.write("    }\n");
        w.newLine();
        w.write("}\n");
        w.newLine();
        w.write("int lowestElem = min;\n");
    }
}
