/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Card.java
 */

package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Card implements Exp {
    public final Exp exp;

    public Card(Exp exp) {
        this.exp = exp;
    }

    public int computeTyp() throws CompilerExc {
        int ct;
        ct = exp.computeTyp();

        if (ct == Typ.t_intset) {
            return Typ.t_int;
        } else {
            throw new TypExc("ERROR: en operacion Cardinalidad");
        }
    }
}
