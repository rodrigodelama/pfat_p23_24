/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * StatementList2.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

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
        int st1, st2;
        st1 = statement.computeStTyp();
        st2 = statementlist.computeStTyp();

        if((st1 == Typ.t_void) && (st2 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en StatementList2");
        } 
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.write(indent+"    ");
        statement.generateCode(w, indent);
        statementlist.generateCode(w, indent);
    }
}
