/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ConstanteEntera.java
 */

package AST;

public class ConstanteEntera implements Exp {
    public final int constanteEnteraDecimal;

    public ConstanteEntera(int constanteEnteraDecimal) {
        this.constanteEnteraDecimal = constanteEnteraDecimal;
    }
}
