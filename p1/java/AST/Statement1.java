package AST;

public class Statement1 implements Statement {
    public final String identifier;
    public final Exp exp;

    public Statement1(String identifier, Exp exp) {
        this.identifier = identifier;
        this.exp = exp;
    }
}
