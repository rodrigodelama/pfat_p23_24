/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Decl.java
 */

package AST;

import Errors.CompilerExc;

public class Decl {
    public final int type;
    public final IdentList identlist;

    public Decl(int type, IdentList identlist) {
        this.type = type;
        this.identlist = identlist;
    }

    public void computeAH1() throws CompilerExc {
        int ah1 = this.type;
        identlist.computeAH1(ah1);
    }
}
