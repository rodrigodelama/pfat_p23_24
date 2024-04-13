/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * LDecl1.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class LDecl1 implements LDecl {
    public final Decl decl;

    public LDecl1(Decl decl) {
        this.decl = decl;
    }

    public void computeAH1() throws CompilerExc {
        decl.computeAH1();
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        decl.generateCode(w, indent);
        w.write(";");
    }
}
