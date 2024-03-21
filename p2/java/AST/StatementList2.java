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

public class StatementList2 implements StatementList {
    public final Statement statement;
    public final StatementList statementlist;

    public StatementList2(Statement statement, StatementList statementlist) {
        this.statement = statement;
        this.statementlist = statementlist;
    }
}
