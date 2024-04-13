/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Prog2.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Prog2 implements Prog {
    public final String identifier;
    public final Body body;

    public Prog2(String identifier, Body body) {
        this.identifier = identifier;
        this.body = body;
    }

    public void computeAH1() throws CompilerExc {
        // para propagarlo
    }

    public void computeTyp() throws CompilerExc {
        body.computeStTyp();
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.write(indent+"public static void main(String args[]) {");
        w.newLine();
        body.generateCode(w, indent+"    "); // indentacion mas profunda (4 espacios mas)
        w.newLine();
        w.write(indent+"}");
        w.newLine();
    }
}
