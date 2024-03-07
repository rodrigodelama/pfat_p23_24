/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Variable.java
 */

package AST;

public class Variable implements Exp {
    public final String identifier;

    public Variable(String identifier) {
        this.identifier = identifier;
    }
}
