package AST;

public class Suma implements Exp {
    public final Exp exp1;
    public final Exp ex2;
    
    public Suma(Exp exp1, Exp ex2) {
        this.exp1 = exp1;
        this.ex2 = ex2;
    }
}
