package AST;

public class Card implements Exp {
    public final Exp exp;

    public Card(Exp exp) {
        this.exp = exp;
    }
}
