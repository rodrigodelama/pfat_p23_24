package Errors;

public class VarNotDefExc extends CompilerExc {
    private String ident;
    
    public VarNotDefExc(String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "Variable not defined: " + this.ident;
    }
}
