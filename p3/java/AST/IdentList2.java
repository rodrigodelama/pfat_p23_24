/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IdentList2.java
 */

package AST;

import java.io.BufferedWriter;

import Errors.CompilerExc;

public class IdentList2 implements IdentList {
    public final String identifier;
    public final IdentList identlist;

    public IdentList2(String identifier, IdentList identlist) {
        this.identifier = identifier;
        this.identlist = identlist;
    }

    public void computeAH1(int t) throws CompilerExc {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeAH1'");
    }

    public int getAH1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAH1'");
    }

    public void generateCode(BufferedWriter w, String tabs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateCode'");
    }
}