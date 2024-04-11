/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement3.java
 */

package AST;

import Compiler.SymbolTable;
import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Statement3 implements Statement {
    public final String identifier;

    public Statement3(String identifier) {
        this.identifier = identifier;
    }

        public int computeStTyp() throws CompilerExc {
        int st1;
        st1 = SymbolTable.getType(identifier);
        
        if(st1 == Typ.t_bool) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en Statement3 (no es un booleano)");
        } 
    }
}
