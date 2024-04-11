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
        int type1, type2;
        type1 = exp.computeTyp();
        type2 = explist.computeTyp();

        if ((type1 == Typ.t_int) && (type2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en ExpList2 se esperaba un tipo " + Typ.t_int + " pero se ha encontrado un tipo " + type1);
        }
    }
}
