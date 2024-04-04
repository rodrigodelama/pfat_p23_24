/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IdentList.java
 */

package AST;

import Errors.CompilerExc;

public interface IdentList {
    // added from last year's code
    public void computeAH1(int type) throws CompilerExc;
    public int getAH1();

    public void computeIndex(int args) throws CompilerExc;
    public int getIndex();
    public int getArgsLength();
}
