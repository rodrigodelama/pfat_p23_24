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

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class ExpList2 implements ExpList, Exp {
    public final Exp exp;
    public final ExpList explist;

    public ExpList2(Exp exp, ExpList explist) {
        this.exp = exp;
        this.explist = explist;
    }

    // no need to compute type ???
    public int computeTyp() throws CompilerExc {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeTyp'");
    }

    public void generateCode(BufferedWriter w) throws IOException {
        exp.generateCode(w);
        w.write(", ");
        explist.generateCode(w);
    }

}
