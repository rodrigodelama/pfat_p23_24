/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Menor.java
 */

package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Menor implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Menor(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int type1, type2;
        type1 = exp1.computeTyp();
        type2 = exp2.computeTyp();

        if((type1 == Typ.t_int) && (type2 == Typ.t_int)) {
            return Typ.t_bool;
        } else {
            throw new TypExc("ERROR: en operación aritmética Menor (<)");
        }
    }
}
