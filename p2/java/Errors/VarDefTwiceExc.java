package Errors;

public class VarDefTwiceExc extends CompilerExc {
    private String ident;
    
    public VarDefTwiceExc (String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "Variable has been defined twice: " + this.ident;
    }
}
