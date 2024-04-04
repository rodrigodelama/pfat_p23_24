/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * StatementList2.java
 */

package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class StatementList2 implements StatementList {
    public final Statement statement;
    public final StatementList statementlist;

    public StatementList2(Statement statement, StatementList statementlist) {
        this.statement = statement;
        this.statementlist = statementlist;
    }

    public int computeStTyp() throws CompilerExc {
        int type1, type2;
        type1 = statement.computeStTyp();
        type2 = statementlist.computeStTyp();

        if((type1 == Typ.t_void) && (type2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en StatementList2");
        } 
    }
}
