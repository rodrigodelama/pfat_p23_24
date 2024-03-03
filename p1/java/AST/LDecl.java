package AST;

public class LDecl {
    public final Decl decl;
    public final LDecl ldecl;
    
    public LDecl(Decl decl) {
        this.decl = decl;
        this.ldecl = null;
    }

    public LDecl(Decl decl, LDecl ldecl) {
        this.decl = decl;
        this.ldecl = ldecl;
    }
}
