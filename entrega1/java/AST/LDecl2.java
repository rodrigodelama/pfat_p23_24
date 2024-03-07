/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * LDecl2.java
 */

package AST;

public class LDecl2 implements LDecl {
    public final Decl decl;
    public final LDecl ldecl;

    public LDecl2(Decl decl, LDecl ldecl) {
        this.decl = decl;
        this.ldecl = ldecl;
    }
}
