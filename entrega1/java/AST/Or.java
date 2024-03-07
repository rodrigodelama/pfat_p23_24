/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Or.java
 */

package AST;

public class Or implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Or(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
