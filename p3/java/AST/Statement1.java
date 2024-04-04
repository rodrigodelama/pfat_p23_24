/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement1.java
 */

package AST;

public class Statement1 implements Statement {
    public final String identifier;
    public final Exp exp;

    public Statement1(String identifier, Exp exp) {
        this.identifier = identifier;
        this.exp = exp;
    }
}
