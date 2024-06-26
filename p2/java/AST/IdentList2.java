/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IdentList2.java
 */

package AST;

import Compiler.SymbolTable;
import Errors.CompilerExc;

public class IdentList2 implements IdentList {
    public final String identifier;
    public final IdentList identlist;
    private int ah1;

    public IdentList2(String identifier, IdentList identlist) {
        this.identifier = identifier;
        this.identlist = identlist;
    }

    public void computeAH1(int type) throws CompilerExc {
        this.ah1 = type;

        identlist.computeAH1(type);
        SymbolTable.newEntry(identifier, ah1);
    }
}
