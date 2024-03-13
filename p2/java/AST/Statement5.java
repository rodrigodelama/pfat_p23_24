/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement4.java
 */

package AST;

public class Statement5 implements Statement {
    public final Exp exp;
    public final StatementList statementList;

    public Statement5(Exp exp, StatementList statementList) {
        this.exp = exp;
        this.statementList = statementList;
    }
}
