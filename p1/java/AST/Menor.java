package AST;

public class Menor implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Menor(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
