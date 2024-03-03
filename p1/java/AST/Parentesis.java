package AST;

public class Parentesis implements Exp {
    public final Exp exp;

    public Parentesis(Exp exp) {
        this.exp = exp;
    }
}
