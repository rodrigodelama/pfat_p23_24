/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 */

package AST;

public class LowestElem implements Exp {
    public final Exp exp;

    public LowestElem(Exp exp) {
        this.exp = exp;
    }
}
