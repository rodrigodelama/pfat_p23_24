/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Opuesto.java
 */

package AST;

public class Opuesto implements Exp {
    public final Exp exp;

    public Opuesto(Exp exp) {
        this.exp = exp;
    }
}
