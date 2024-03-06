package AST;

public class StatementList {
    public final Statement1 statement;
    public final StatementList statementlist;

    public StatementList(Statement1 statement, StatementList statementlist) {
        this.statement = statement;
        this.statementlist = statementlist;
    }
}
