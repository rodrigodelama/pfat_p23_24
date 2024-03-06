package AST;

public class Variable implements Exp {
    public final String identifier;

    public Variable(String identifier) {
        this.identifier = identifier;
    }
}
