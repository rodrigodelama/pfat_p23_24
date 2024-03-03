package AST;

public class StatementList {
    public final Statement statement;
    public final StatementList statementlist;

    public StatementList(Statement statement, StatementList statementlist) {
        this.statement = statement;
        this.statementlist = statementlist;
    }
}
