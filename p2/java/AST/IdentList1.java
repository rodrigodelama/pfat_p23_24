/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IdentList1.java
 */

package AST;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class IdentList1 implements IdentList {
    public final String identifier;
    private int ah1;

    public IdentList1(String identifier) {
        this.identifier = identifier;
    }

    public void computeAH1(int type) throws CompilerExc {
        this.ah1 = type;
        SymbolTable.newEntry(this.identifier, this.ah1);
    }
}
