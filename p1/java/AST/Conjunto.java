package AST;

public class Conjunto implements Exp {
    public final ExpList expList;

    public Conjunto(ExpList expList) {
        this.expList = expList;
    }
}
