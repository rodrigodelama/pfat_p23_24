package AST;

public class IdentList2 implements IdentList {
    public final String identifier;
    public final IdentList identlist;

    public IdentList2(String identifier, IdentList identlist) {
        this.identifier = identifier;
        this.identlist = identlist;
    }
}
