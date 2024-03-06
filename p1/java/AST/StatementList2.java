package AST;

public class StatementList2 {
    public final Statement statement;
    public final StatementList statementlist;

    public StatementList2(Statement statement, StatementList statementlist) {
        this.statement = statement;
        this.statementlist = statementlist;
    }
}
