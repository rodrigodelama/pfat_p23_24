/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Body.java
 */

package AST;

import Errors.CompilerExc;

public class Body {
    public final StatementList statementList;

    public Body(StatementList statementList) {
        this.statementList = statementList;
    }

    public int computeStTyp() throws CompilerExc {
        return statementList.computeStTyp();
    }
}
