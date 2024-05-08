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
    public final StatementList statementList1;
    private int st1, st2, st3;
    

    public Statement4(Exp exp, StatementList statementList, StatementList statementList1) {
        this.exp = exp;
        this.statementList = statementList;
        this.statementList1 = statementList1;
    }

    public int computeStTyp() throws CompilerExc {
        // int st1, st2, st3;
        st1 = exp.computeTyp();
        st2 = statementList.computeStTyp();
        st3 = statementList1.computeStTyp();

        if((st1 == Typ.t_bool) && (st2 == Typ.t_void) && (st3 == Typ.t_void)) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en Statement4 (error en  IF <Exp> THEN <StatementList>)");
        } 
    }

    //IF Exp:e THEN StatementList:sl END {:RESULT=new Statement4(e, sl); :}
    //TODO: review
    public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.newLine();
        w.write(indent + "if (");
        exp.generateCode(w);
        w.write(") {\n");
        statementList.generateCode(w, indent + "    "); // further indent inside if block
        w.newLine();
        w.write(indent + "}");
        w.write(indent + " else {" );
        w.newLine();
        statementList1.generateCode(w, indent + "    ");
        w.newLine();
        w.write(indent + "}");
    }
}
