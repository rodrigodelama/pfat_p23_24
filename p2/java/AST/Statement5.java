/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement4.java
 */

package AST;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Statement5 implements Statement {
    public final Exp exp;
    public final StatementList statementList;

    public Statement5(Exp exp, StatementList statementList) {
        this.exp = exp;
        this.statementList = statementList;
    }

    public int computeStTyp() throws CompilerExc {
        int st1, st2;
        st1 = exp.computeTyp();
        st2 = statementList.computeStTyp();

        if((st1 == Typ.t_bool) && (st2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en Statement5 (error en  WHILE <Exp> DO <StatementList>)");
        } 
    }
}
