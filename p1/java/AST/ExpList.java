package AST;

public class ExpList {
    public final Exp exp;
    public final ExpList explist;

    public ExpList(Exp exp) {
        this.exp = exp;
        this.explist = null;
    }
    
    public ExpList(Exp exp, ExpList explist) {
        this.exp = exp;
        this.explist = explist;
    }
}
