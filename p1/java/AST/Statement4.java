package AST;

public class Statement4 implements Statement {
    public final Exp exp;
    public final StatementList statementList;

    public Statement4(Exp exp, StatementList statementList) {
        this.exp = exp;
        this.statementList = statementList;
    }
}
