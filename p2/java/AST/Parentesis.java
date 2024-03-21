/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Parentesis.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Parentesis implements Exp {
    public final Exp exp;

    public Parentesis(Exp exp) {
        this.exp = exp;
    }

    //<Exp>.typ= <Exp>1.typ
    public int computeTyp() throws CompilerExc {
        return exp.computeTyp();
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("(");
        exp.generateCode(w);
        w.write(")");
    }
}
