/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Conjunto.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

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
        return Typ.t_intset;
    }

    public void generateCode(BufferedWriter w) throws IOException {
        //FIXME:
        /*
        System.out.print("{ ");
        expList.generateCode(w);
        System.out.print(" }");
        */
    }
}
