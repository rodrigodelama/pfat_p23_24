/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Decl.java
 */

package AST;

public class Decl {
    public final int type;
    public final IdentList identlist;

    public Decl(int type, IdentList identlist) {
        this.type = type;
        this.identlist = identlist;
    }
}
