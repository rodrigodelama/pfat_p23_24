/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * VarDefTwiceExc.java
 */

package Errors;

public class VarDefTwiceExc extends CompilerExc {
    private String ident;

    public VarDefTwiceExc (String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "ERROR: variable declarada multiples veces: " + this.ident;
    }
}
