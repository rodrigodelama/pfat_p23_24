/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * LexerException.java
 */

package Errors;

public class LexerException extends CompilerExc {
    private String msg;

    public LexerException(String s) {
        msg = s;
    }

    public String toString() {
        return msg;
    }
}
