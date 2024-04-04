/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Card.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Card implements Exp {
    public final Exp exp;

    public Card(Exp exp) {
        this.exp = exp;
    }

    // The cardinal operator returns the number of elements in a set
    public int computeTyp() throws CompilerExc {
        int ct;
        ct = exp.computeTyp();
        if (ct == Typ.t_intset) {
            return Typ.t_int; // The cardinal operator returns an integer
            // so we should return Typ.t_int ???
        } else {
            throw new TypExc("ERROR: en operación Cardinalidad");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("int[] array = ");
        exp.generateCode(w);
        w.write(";");
        w.newLine();
        w.write("int cardinality = array.length;");
    }
}
