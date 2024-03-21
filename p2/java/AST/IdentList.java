/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
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
    // added from last year's code
    public void computeAH1(int t) throws CompilerExc;
    public int getAH1();
    public void generateCode(BufferedWriter w, String tabs);
}
