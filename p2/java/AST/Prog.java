/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Prog.java
 */

package AST;

import Errors.CompilerExc;

public interface Prog {
    public void computeAH1() throws CompilerExc;
    public void computeTyp() throws CompilerExc;
}
