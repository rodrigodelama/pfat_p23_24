/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Card.java
 */

package AST;

public class Card implements Exp {
    public final Exp exp;

    public Card(Exp exp) {
        this.exp = exp;
    }
}
