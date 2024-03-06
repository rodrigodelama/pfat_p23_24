package AST;

public class LDecl2 implements LDecl {
    public final Decl decl;
    public final LDecl ldecl;

    public LDecl2(Decl decl, LDecl ldecl) {
        this.decl = decl;
        this.ldecl = ldecl;
    }
}
