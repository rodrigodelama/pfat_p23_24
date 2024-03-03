package AST;

public class Statement {
    public final String identifier;
    public final Asignacion asignacion;
    public final Exp exp;
    public final StatementList statementlist;

    public Statement(String identifier, Asignacion asignacion, Exp exp) {
        this.identifier = identifier;
        this.asignacion = asignacion;
        this.exp = exp;
        this.statementlist = null;
    }

    public Statement(Exp exp, StatementList statementlist) {
        this.exp = exp;
        this.statementlist = statementlist;
        this.identifier = null;
        this.asignacion = null;
    }
}
