/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Prog2.java
 */

package AST;

import Errors.CompilerExc;

public class Prog2 implements Prog {
    public final String identifier;
    public final Body body;

    public Prog2(String identifier, Body body) {
        this.identifier = identifier;
        this.body = body;
    }

    public void computeAH1() throws CompilerExc {
        // para propagarlo
    }

    public void computeTyp() throws CompilerExc {
        body.computeStTyp();
    }
}
