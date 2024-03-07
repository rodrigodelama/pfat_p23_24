/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ExpList2.java
 */

package AST;

public class ExpList2 implements ExpList, Exp {
    public final Exp exp;
    public final ExpList explist;

    public ExpList2(Exp exp, ExpList explist) {
        this.exp = exp;
        this.explist = explist;
    }
}
