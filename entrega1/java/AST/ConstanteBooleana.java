/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ConstanteBooleana.java
 */

package AST;

public class ConstanteBooleana implements Exp {
    public final boolean bool;

    public ConstanteBooleana(boolean bool) {
        this.bool = bool;
    }
}
