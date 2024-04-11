/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * StatementList.java
 */

package AST;

import Errors.CompilerExc;

public interface StatementList {
    public int computeStTyp() throws CompilerExc;
}
