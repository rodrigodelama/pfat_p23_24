/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Interseccion.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Interseccion implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Interseccion(Exp exp1, Exp exp2) {
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
            throw new TypExc("ERROR: en Interseccion de Conjuntos");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("intersectionSet(");
        exp1.generateCode(w);
        w.write(", ");
        exp2.generateCode(w);
        w.write(")");
    }
}
