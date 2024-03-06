package AST;

public class Statement1 implements Statement {
    public final String identifier;
    public final Asignacion asignacion;
    public final Exp exp;
    public final StatementList statementlist;

    public Statement1(String identifier, Asignacion asignacion, Exp exp, StatementList statementlist) {
        this.identifier = identifier;
        this.asignacion = asignacion;
        this.exp = exp;
        this.statementlist = statementlist;
    }
}
