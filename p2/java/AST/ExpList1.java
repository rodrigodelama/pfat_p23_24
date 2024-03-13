/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ExpList1.java
 */

package AST;

public class ExpList1 implements ExpList, Exp {
    public final Exp exp;

    public ExpList1(Exp exp) {
        this.exp = exp;
    }
}
