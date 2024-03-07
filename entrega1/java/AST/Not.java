/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Not.java
 */

package AST;

public class Not implements Exp {
    public final Exp exp;

    public Not(Exp exp) {
        this.exp = exp;
    }
}
