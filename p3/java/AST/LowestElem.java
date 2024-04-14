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
            throw new TypExc("ERROR: en LowestElem de un Conjunto");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        exp.generateCode(w);
        w.write(".lowestElem()");
    }
}
