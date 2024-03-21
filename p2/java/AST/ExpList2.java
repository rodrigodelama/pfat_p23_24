/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ExpList2.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class ExpList2 implements ExpList, Exp {
    public final Exp exp;
    public final ExpList explist;

    public ExpList2(Exp exp, ExpList explist) {
        this.exp = exp;
        this.explist = explist;
    }

    public int computeTyp() throws CompilerExc {
        int ct1, ct2;
        ct1 = exp.computeTyp();
        ct2 = explist.computeTyp();

        if ((ct1 == Typ.t_int) && (ct2 == Typ.t_intset)) {
            return Typ.t_intset;
        } else {
            throw new TypExc("ERROR: en ExpList2");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        exp.generateCode(w);
        w.write(", ");
        explist.generateCode(w);
    }
}
