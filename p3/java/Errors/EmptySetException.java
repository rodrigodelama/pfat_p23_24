/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * EmptySetException.java
 */

package Errors;

public class EmptySetException extends Exception {

    public EmptySetException() {
    }

    public String toString() {
	    return "Error while computing a set expression: the set is empty\n";
    }
}
