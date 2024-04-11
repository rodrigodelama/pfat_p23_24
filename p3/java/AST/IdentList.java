/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IdentList.java
 */

package AST;

import java.io.BufferedWriter;

import Errors.CompilerExc;

public interface IdentList {
    public void computeAH1(int type) throws CompilerExc;
    public void generateCode(BufferedWriter w, String tabs);
}
