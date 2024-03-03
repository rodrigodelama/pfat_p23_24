package AST;

public class Not implements Exp {
    public final Exp exp;

    public Not(Exp exp) {
        this.exp = exp;
    }
}
