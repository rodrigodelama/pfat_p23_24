/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Prog2.java
 */

package AST;

public class Prog2 implements Prog {
    public final String identifier;
    public final Body body;

    public Prog2(String identifier, Body body) {
        this.identifier = identifier;
        this.body = body;
    }
}
