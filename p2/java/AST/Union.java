/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Union.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Union implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Union(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int ct1, ct2;
        ct1 = exp1.computeTyp();
        ct2 = exp2.computeTyp();

        if ((ct1 == Typ.t_intset) && (ct2 == Typ.t_intset)) {
            return Typ.t_intset;
        } else {
            throw new TypExc("ERROR: en Union");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        /*
        // Method to join two arrays
        public static int[] joinArrays(int[] array1, int[] array2) {
            int totalLength = array1.length + array2.length;
            int[] result = new int[totalLength];

            // Copy elements of array1 to result array
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i];
            }

            // Copy elements of array2 to result array
            for (int i = 0; i < array2.length; i++) {
                result[array1.length + i] = array2[i];
            }

            return result;
        }
     */
        w.write("int[] array1 = ");
        exp1.generateCode(w);
        w.write(";\n");
        w.write("int[] array2 = ");
        exp2.generateCode(w);
        w.write(";\n");
        w.write("int totalLength = array1.length + array2.length;\n");
        w.write("int[] result = new int[totalLength];\n");
        w.write("for (int i = 0; i < array1.length; i++) {\n");
        w.write("    result[i] = array1[i];\n");
        w.write("}\n");
        w.write("for (int i = 0; i < array2.length; i++) {\n");
        w.write("    result[array1.length + i] = array2[i];\n");
        w.write("}\n");
        w.write("int[] union = result;\n");
    }
    
}
