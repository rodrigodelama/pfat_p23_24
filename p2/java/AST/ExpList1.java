/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ExpList1.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class ExpList1 implements ExpList, Exp {
    public final Exp exp;

    public ExpList1(Exp exp) {
        this.exp = exp;
    }

    public int computeTyp() throws CompilerExc {
        int ct;
        ct = exp.computeTyp();

        if (ct == Typ.t_int) {
            return Typ.t_int;
        } else {
            throw new TypExc("ERROR: en lista de expresiones");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        exp.generateCode(w);
    }


}
