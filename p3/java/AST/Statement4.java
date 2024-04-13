/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement4.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Statement4 implements Statement {
    public final Exp exp;
    public final StatementList statementList;

    public Statement4(Exp exp, StatementList statementList) {
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
            throw new TypExc("ERROR: en Statement4 (error en  IF <Exp> THEN <StatementList>)");
        } 
    }

    //IF Exp:e THEN StatementList:sl END {:RESULT=new Statement4(e, sl); :}
    //TODO: review
    public void generateCode(BufferedWriter w) throws IOException {
        w.write("if (");
        exp.generateCode(w);
        w.write(") {\n");
        statementList.generateCode(w);
        w.write("}\n");
    }
}
