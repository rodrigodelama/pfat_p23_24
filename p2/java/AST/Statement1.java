/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement1.java
 */

package AST;

import Compiler.SymbolTable;
import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Statement1 implements Statement {
    public final String identifier;
    public final Exp exp;

    public Statement1(String identifier, Exp exp) {
        this.identifier = identifier;
        this.exp = exp;
    }

        public int computeStTyp() throws CompilerExc {
        int st1, st2;
        st1 = SymbolTable.getType(identifier);
        st2 = exp.computeTyp();
        
        if(st1 == st2) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en Statement1");
        } 
    }
}
