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

    public void generateCode(BufferedWriter w, String tabs) throws IOException {
        String type_str = "";
        switch (type) {
            case 1:
                type_str = "int";
                break;
            case 2:
                type_str = "boolean";
                break;
            case 3:
                type_str = "intset";
                break;
            default:
                break;
        }
        w.write(tabs + type_str + " ");
        identlist.generateCode(w, tabs);
        w.write(";");
        w.newLine();
    }

}
