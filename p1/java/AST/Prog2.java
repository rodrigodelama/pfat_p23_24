package AST;

public class Prog2 implements Prog {
    public final String identifier;
    public final Body body;

    public Prog2(String identifier, Body body) {
        this.identifier = identifier;
        this.body = body;
    }
}
