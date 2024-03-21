/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * In.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class In implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public In(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int ct1, ct2;
        ct1 = exp1.computeTyp();
        ct2 = exp2.computeTyp();

        //check if an int is inside the intset
        if( ((ct1 == Typ.t_int) && (ct2 == Typ.t_intset)) ) {
            // || (ct1 == Typ.t_intset) && (ct2 == Typ.t_int)) {
            return Typ.t_bool; // return either true or false
        } else {
            throw new TypExc("ERROR: en In");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        /*
         *  public static boolean isIntInArray(int[] array, int target) {
                for (int num : array) {
                    if (num == target) {
                        return true; // If the target integer is found, return true
                    }
                }
                return false; // If the target integer is not found, return false
            }
         */

        //TODO: check if this is correct

        w.write("int target = ");
        exp1.generateCode(w); // assuming this is the target integer
        w.write(";");
        w.newLine();
        w.write("int[] array = ");
        exp2.generateCode(w); // assuming this is the array where we want to find the target integer
        w.write(";");
        w.newLine();
        w.write("for (int num : array) {\r\n" + //
                "   if (num == target) {\r\n" + //
                "       return true; // If the target integer is found, return true\r\n" + //
                "   }\r\n" + //
                "   return false; // If the target integer is not found, return false\r\n" + //
                "}");
        w.newLine();
    }
}
