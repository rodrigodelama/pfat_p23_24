/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Mayor.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Mayor implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Mayor(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int ct1, ct2;
        ct1 = exp1.computeTyp();
        ct2 = exp2.computeTyp();

        if((ct1 == Typ.t_int) && (ct2 == Typ.t_int)) {
            return Typ.t_bool; //TODO: why bool?
        } else {
            throw new TypExc("ERROR: en operación aritmética Mayor (>)");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("("); 
        exp1.generateCode(w);
        w.write(" > ");
        exp2.generateCode(w); 
        w.write(")"); 
    }
}
