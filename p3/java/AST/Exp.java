/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Exp.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public interface Exp {
    public int computeTyp() throws CompilerExc;
    public void generateCode(BufferedWriter w) throws IOException;
    /*
        - no incluimos indent en "generateCode" porque no es necesario,
            la indentacion se hace en el nivel superior del arbol
    */
}
