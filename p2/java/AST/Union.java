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
        int type1, type2;
        type1 = exp1.computeTyp();
        type2 = exp2.computeTyp();

        if ((type1 == Typ.t_intset) && (type2 == Typ.t_intset)) {
            return Typ.t_intset;
        } else {
            throw new TypExc("ERROR: en Union de Conjuntos");
        }
    }
}
