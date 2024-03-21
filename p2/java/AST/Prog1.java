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

public class Prog1 implements Prog {
    public final String identifier;
    public final LDecl ldecl;
    public final Body body;

    public Prog1(String identifier, LDecl ldecl, Body body) {
        this.identifier = identifier;
        this.ldecl = ldecl;
        this.body = body;
    }

    public void computeAH1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeAH1'");
    }

    public void computeTyp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeTyp'");
    }
    
}
