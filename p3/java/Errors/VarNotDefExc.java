/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * VarNotDefExc.java
 */

package Errors;

public class VarNotDefExc extends CompilerExc {
    private String ident;

    public VarNotDefExc(String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "ERROR: variable no definida: " + this.ident;
    }
}
