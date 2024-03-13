/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * StatementList1.java
 */

package AST;

public class StatementList1 implements StatementList {
    public final Statement statement;

    public StatementList1(Statement statement) {
        this.statement = statement;
    }
}
