/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement.java
 */

package AST;

import Errors.CompilerExc;

public interface Statement {
    public int computeStTyp() throws CompilerExc;
}
