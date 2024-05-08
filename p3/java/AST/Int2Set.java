/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Examen de Prácticas
 * 
 * Rodrigo De Lama Fernández - 100451775
 * 
 * Int2Set.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Int2Set implements Exp {
    public final Exp exp;

    public Int2Set(Exp exp) {
        this.exp = exp;
    }

    // INT2SET PAREN <Exp> TESIS
    public int computeTyp() throws CompilerExc {
        int type;
        type = exp.computeTyp();

        if ((type == Typ.t_int)) {
            return Typ.t_intset;
        } else {
            throw new TypExc("ERROR: en INT2SET");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        w.write("new IntSet(new Vector<>(Arrays.asList(");
        exp.generateCode(w);
        w.write(")))");
    }
}
