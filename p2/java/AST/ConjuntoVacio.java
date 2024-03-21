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

import Compiler.Typ;
import Errors.CompilerExc;

public class ConjuntoVacio implements Exp {
    public ConjuntoVacio() {
    }

    //maybe intset ??
    public int computeTyp() throws CompilerExc {
        return Typ.t_intset;
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("{ }");
    }

}
