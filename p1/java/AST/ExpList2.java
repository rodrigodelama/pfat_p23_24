package AST;

public class ExpList2 implements ExpList {
    public final Exp exp;
    public final ExpList explist;
    
    public ExpList2(Exp exp, ExpList explist) {
        this.exp = exp;
        this.explist = explist;
    }
}
