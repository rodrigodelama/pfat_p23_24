package AST;

public class Statement2 implements Statement {
    public final Exp exp;
    public final StatementList statementlist;

    public Statement2(Exp exp, StatementList statementlist) {
        this.exp = exp;
        this.statementlist = statementlist;
    }
}
