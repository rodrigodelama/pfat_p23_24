/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Prog1.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Prog1 implements Prog {
    public final String identifier;
    public final LDecl ldecl;
    public final Body body;

    public Prog1(String identifier, LDecl ldecl, Body body) {
        this.identifier = identifier;
        this.ldecl = ldecl;
        this.body = body;
    }

    public void computeAH1() throws CompilerExc {
        ldecl.computeAH1();
    }

    public void computeTyp() throws CompilerExc {
        body.computeStTyp();
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.write(indent+"public static void main(String args[]) {");
        w.newLine();
        w.newLine();
        input.generateCode(w, indent+ " ");
        size.generateCode(w, indent+"   ");
        variables.generateCode(w, indent+"   ");
        sentence.generateCode(w, indent+"   ");
        w.newLine();

        w.write(indent+"int[] flatArray = Flatt_Array.flatten2DArray(array);");
        w.newLine();
        w.write(indent+"BMP_Gen.map2BMP(alto_size, ancho_size, flatArray, args[");
        w.write(args_length+1 + "]);");
        w.newLine();
        w.write("  }");
        w.newLine();
    }
}
