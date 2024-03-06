package AST;

public class Prog1 implements Prog {
    public final String identifier;
    public final Decl decl;
    public final LDecl1 ldecl;
    public final Body body;

    public Prog1(String identifier, Decl decl, LDecl1 ldecl, Body body) {
        this.identifier = identifier;
        this.decl = decl;
        this.ldecl = ldecl;
        this.body = body;
    }
}
