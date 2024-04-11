/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Igual.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Igual implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Igual(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int type1, type2;
        type1 = exp1.computeTyp();
        type2 = exp2.computeTyp();

        if(type1 == type2) {
            return Typ.t_bool;
        } else {
            throw new TypExc("ERROR: en Igual (asignación)");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        exp1.generateCode(w);
        w.write(" = "); //this is just an assignment
        exp2.generateCode(w); 
    }
}
