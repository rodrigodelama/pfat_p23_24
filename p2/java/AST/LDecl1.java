/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * LDecl1.java
 */

package AST;

import Errors.CompilerExc;

public class LDecl1 implements LDecl {
    public final Decl decl;

    public LDecl1(Decl decl) {
        this.decl = decl;
    }

    public void computeAH1() throws CompilerExc {
        decl.computeAH1();
    }
}
