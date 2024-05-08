/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Examen de Prácticas
 * 
 * Rodrigo De Lama Fernández - 100451775
 * 
 * Cero.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Cero implements Exp {

    public Cero() {
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_intset;
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("new IntSet(new Vector<>(Arrays.asList(0)))");
    }
}
