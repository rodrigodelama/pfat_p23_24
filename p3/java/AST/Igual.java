/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Igual.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Igual implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    // For the type checking in computeTyp & generateCode
    private int type1, type2;

    public Igual(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        type1 = exp1.computeTyp();
        type2 = exp2.computeTyp();

        if(type1 == type2) {
            return Typ.t_bool;
        } else {
            throw new TypExc("ERROR: en Igual (==)");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        if (type1 == Typ.t_intset && type2 == Typ.t_intset) {
            w.write("(");
            exp1.generateCode(w);
            w.write(".equals(");
            exp2.generateCode(w);
            w.write("))");
            return; // Exit the method here to avoid the code below
        }

        // This code will only execute if exp1 and exp2 are NOT intsets
        w.write("(");
        exp1.generateCode(w);
        w.write(" == ");
        exp2.generateCode(w);
        w.write(")");
    }
}
