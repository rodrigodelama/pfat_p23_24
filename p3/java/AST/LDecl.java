/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * LDecl.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public interface LDecl {
    public void computeAH1() throws CompilerExc;
    public void generateCode(BufferedWriter w, String indent) throws IOException;
}
