/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ExpList.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

public interface ExpList {
    public void generateCode(BufferedWriter w) throws IOException;
}
