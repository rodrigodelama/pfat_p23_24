/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * StatementList1.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Errors.CompilerExc;

public class StatementList1 implements StatementList {
    public final Statement statement;

    public StatementList1(Statement statement) {
        this.statement = statement;
    }

    public int computeStTyp() throws CompilerExc {
        return statement.computeStTyp();
    }

    public void generateCode(BufferedWriter w, String indent) throws IOException {
        w.write(indent);
        statement.generateCode(w, indent);
    }
}
