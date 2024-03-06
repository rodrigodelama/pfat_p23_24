package AST;

public class Prog {
    public final String identifier;
    public final Decl decl;
    public final LDecl ldecl;
    public final Body body;

    public Prog(String identifier, Decl decl, LDecl ldecl, Body body) {
        this.identifier = identifier;
        this.decl = decl;
        this.ldecl = ldecl;
        this.body = body;
    }

    public Prog(String identifier, Body body) {
        this.identifier = identifier;
        this.body = body;
        this.decl = null;
        this.ldecl = null;
    }
}
