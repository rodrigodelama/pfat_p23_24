/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Multiplicacion.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Multiplicacion implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Multiplicacion(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int type1, type2;
        type1 = exp1.computeTyp();
        type2 = exp2.computeTyp();

        if((type1 == Typ.t_int) && (type2 == Typ.t_int)) {
            return Typ.t_int;
        } else {
            throw new TypExc("ERROR: en operacion aritmetica Multiplicacion (*)");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("(");
        exp1.generateCode(w);
        w.write(" * ");
        exp2.generateCode(w);
        w.write(")");
    }
}
