/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * TypExc.java
 */

package Errors;

public class TypExc extends CompilerExc {
    private String msg;

    public TypExc(String name) {
        this.msg = name;
    }

    public String toString() {
        return this.msg;
    }
}
