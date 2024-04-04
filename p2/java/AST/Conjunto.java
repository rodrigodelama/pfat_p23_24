/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Conjunto.java
 */

package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Conjunto implements Exp {
    public final ExpList expList;

    public Conjunto(ExpList expList) {
        this.expList = expList;
    }

    // BRAC <ExpList> KET
    public int computeTyp() throws CompilerExc {
        int type;
        type = expList.computeTyp();

        if (type == Typ.t_void) {
            return Typ.t_intset;
        } else {
            throw new TypExc("ERROR: en Conjunto");
        }
    }
}
