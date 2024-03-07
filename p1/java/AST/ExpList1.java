package AST;

public class ExpList1 implements ExpList, Exp {
    public final Exp exp;

    public ExpList1(Exp exp) {
        this.exp = exp;
    }
}
