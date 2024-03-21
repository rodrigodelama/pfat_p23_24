/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ConjuntoVacio.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class ConjuntoVacio implements Exp {
    public ConjuntoVacio() {
    }

    //maybe intset ??
    public int computeTyp() throws CompilerExc {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeTyp'");
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("{ }");
    }

}
