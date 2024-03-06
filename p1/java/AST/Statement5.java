package AST;

public class Statement5 implements Statement {
    public final Exp exp;
    public final StatementList statementList;

    public Statement5(Exp exp, StatementList statementList) {
        this.exp = exp;
        this.statementList = statementList;
    }
}
