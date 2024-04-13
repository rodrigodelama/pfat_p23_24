/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Decl.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class Decl {
    public final int type;
    public final IdentList identlist;

    public Decl(int type, IdentList identlist) {
        this.type = type;
        this.identlist = identlist;
    }

    public void computeAH1() throws CompilerExc {
        int ah1 = this.type;
        identlist.computeAH1(ah1);
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        String typeStr = "";
        switch (type) {
            case 1:
                typeStr = "int";
                break;
            case 2:
                typeStr = "boolean";
                break;
            case 3:
                typeStr = "IntSet";
                break;
            default:
                break;
        }
        w.write(indent + typeStr + " ");
        identlist.generateCode(w, indent);
        // w.write(";");
        w.newLine();
    }

}
