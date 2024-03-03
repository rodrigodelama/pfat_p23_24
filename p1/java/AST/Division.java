package AST;

public class Division implements Exp {
    public final Exp exp1;
    public final Exp exp2;

    public Division(Exp exp1, Exp exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
