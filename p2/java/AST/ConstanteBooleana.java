/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ConstanteBooleana.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;

public class ConstanteBooleana implements Exp {
    public final boolean bool;

    public ConstanteBooleana(boolean bool) {
        this.bool = bool;
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_bool;
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("" + bool);
    }
}
