/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Variable.java
 */

package AST;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class Variable implements Exp {
    public final String identifier;

    public Variable(String identifier) {
        this.identifier = identifier;
    }

    public int computeTyp() throws CompilerExc {
        return SymbolTable.getType(this.identifier); //si no lanza la excepcion, devuelve el numero del tipo
    }
}
