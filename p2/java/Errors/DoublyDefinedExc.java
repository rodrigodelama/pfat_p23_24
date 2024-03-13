package Errors;

public class DoublyDefinedExc extends CompilerExc {
    private String ident;
    
    public DoublyDefinedExc (String ident) {
        this.ident = ident;
    }

    public String toString() {
        return "Var doubly defined -> " + this.ident;
    }
}
