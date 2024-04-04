/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Prog1.java
 */

package AST;

import Errors.CompilerExc;

public class Prog1 implements Prog {
    public final String identifier;
    public final LDecl ldecl;
    public final Body body;

    public Prog1(String identifier, LDecl ldecl, Body body) {
        this.identifier = identifier;
        this.ldecl = ldecl;
        this.body = body;
    }

    public void computeAH1() throws CompilerExc {
        ldecl.computeAH1();
    }

    public void computeTyp() throws CompilerExc {
        body.computeStTyp();
    }
}
