package AST;

public class StatementList2 implements StatementList {
    public final Statement statement;
    public final StatementList statementlist;

    public StatementList2(Statement statement, StatementList statementlist) {
        this.statement = statement;
        this.statementlist = statementlist;
    }
}
