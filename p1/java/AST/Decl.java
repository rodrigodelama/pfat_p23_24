package AST;

public class Decl {
    public final int type;
    public final IdentList identlist;

    public Decl(int type, IdentList identlist) {
        this.type = type;
        this.identlist = identlist;
    }
}
