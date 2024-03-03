package AST;

public class IdentList {
    public final String identifier;
    public final IdentList identlist;

    public IdentList(String identifier, IdentList identlist) {
        this.identifier = identifier;
        this.identlist = identlist;
    }
}
