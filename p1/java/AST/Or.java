package AST;

public class Or implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Or(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
