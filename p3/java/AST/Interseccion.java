/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Interseccion.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Interseccion implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Interseccion(Exp exp1, Exp exp2) {
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
            throw new TypExc("ERROR: en Interseccion");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        /*
            // Method to find the intersection of two arrays
            public static int[] findIntersection(int[] array1, int[] array2) {
                int maxSize = Math.min(array1.length, array2.length);
                int[] intersection = new int[maxSize];
                int intersectionIndex = 0;
                // Nested loop to compare elements of array1 with array2
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array2.length; j++) {
                        if (array1[i] == array2[j]) {
                            intersection[intersectionIndex++] = array1[i];
                            break; // Move to the next element in array1
                        }
                    }
                }
                // Trim the intersection array to its actual size
                int[] trimmedArray = new int[intersectionIndex];
                System.arraycopy(intersection, 0, trimmedArray, 0, intersectionIndex);
                return trimmedArray;
            }
         */
        w.write("int[] array1 = ");
        exp1.generateCode(w);
        w.write(";");
        w.newLine();
        w.write("int[] array2 = ");
        exp2.generateCode(w);
        w.write(";");
        w.newLine();
        w.write("int maxSize = Math.min(array1.length, array2.length);");
        w.newLine();
        w.write("int[] intersection = new int[maxSize];");
        w.newLine();
        w.write("int intersectionIndex = 0;");
        w.newLine();
        w.write("for (int i = 0; i < array1.length; i++) {");
        w.newLine();
        w.write("   for (int j = 0; j < array2.length; j++) {");
        w.newLine();
        w.write("       if (array1[i] == array2[j]) {");
        w.newLine();
        w.write("           intersection[intersectionIndex++] = array1[i];");
        w.newLine();
        w.write("           break;");
        w.newLine();
        w.write("       }");
        w.newLine();
        w.write("   }");
        w.newLine();
        w.write("}");
        w.newLine();
        w.write("int[] trimmedArray = new int[intersectionIndex];");
        w.newLine();
        w.write("System.arraycopy(intersection, 0, trimmedArray, 0, intersectionIndex);");
        w.newLine();
        w.write("int[] interseccion = trimmedArray;");
    }
    
}
