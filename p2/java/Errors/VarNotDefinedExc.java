package Errors;

public class VarNotDefinedExc extends CompilerExc {
    private String ident;
    
    public VarNotDefinedExc(String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "Var not defined -> " + this.ident;
    }
}
