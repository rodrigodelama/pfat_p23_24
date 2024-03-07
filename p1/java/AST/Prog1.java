package AST;

public class Prog1 implements Prog {
    public final String identifier;
    public final LDecl ldecl;
    public final Body body;

    public Prog1(String identifier, LDecl ldecl, Body body) {
        this.identifier = identifier;
        this.ldecl = ldecl;
        this.body = body;
    }
}
