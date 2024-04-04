/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Not.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Not implements Exp {
    public final Exp exp;

    public Not(Exp exp) {
        this.exp = exp;
    }
    public int computeTyp() throws CompilerExc {
        int ct;
        ct = exp.computeTyp();

        if((ct == Typ.t_bool)) {
            return Typ.t_bool;
        } else {
            throw new TypExc("ERROR: en operación lógica NOT (!)");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        // w.write("(");
        w.write(" !");
        exp.generateCode(w); 
        // w.write(")");
    }
}
