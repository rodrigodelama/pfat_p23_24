package AST;

public class pf2024 {
    public final String identifier;
    public final Decl decl;
    public final LDecl ldecl;
    public final Body body;

    public pf2024(String identifier, Decl decl, LDecl ldecl, Body body) {
        this.identifier = identifier;
        this.decl = decl;
        this.ldecl = ldecl;
        this.body = body;
    }

    public pf2024(String identifier, Body body) {
        this.identifier = identifier;
        this.body = body;
        this.decl = null;
        this.ldecl = null;
    }
}
