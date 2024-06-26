/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * RestaODiff.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class RestaODiff implements Exp {
    public final Exp exp1;
    public final Exp exp2;
    private int type1GenCode, type2GenCode;

    public RestaODiff(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public int computeTyp() throws CompilerExc {
        int type1, type2;
        type1 = exp1.computeTyp();
        type2 = exp2.computeTyp();
        type1GenCode = type1;
        type2GenCode = type2;
        
        if((type1 == Typ.t_int) && (type2 == Typ.t_int)) {
            return Typ.t_int;
        } else if((type1 == Typ.t_intset) && (type2 == Typ.t_intset)) {
            return Typ.t_intset;
        } else {
            throw new TypExc("ERROR: en operacion Resta o Diferencia de Conjuntos (-)");
        }
    }

    public void generateCode(BufferedWriter w) throws IOException {
        if((type1GenCode == Typ.t_int) && (type2GenCode == Typ.t_int)) {
            // resta si son int
            w.write("(");
            exp1.generateCode(w);
            w.write(" - ");
            exp2.generateCode(w);
            w.write(")");
        } else if((type1GenCode == Typ.t_intset) && (type2GenCode == Typ.t_intset)) {
            // diff si son intset
            w.write("(IntSet) ");
            exp1.generateCode(w);
            w.write(".setDif(");
            exp2.generateCode(w);
            w.write(")");
        }
    }
}
