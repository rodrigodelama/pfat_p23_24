/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Parentesis.java
 */

package AST;

public class Parentesis implements Exp {
    public final Exp exp;

    public Parentesis(Exp exp) {
        this.exp = exp;
    }
}
