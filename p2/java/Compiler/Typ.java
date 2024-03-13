package Compiler;

public class Typ {	
    public static final int t_int = 1;
    public static final int t_bool = 2;
	public static final int t_intset = 3;

    public static String typToString(int typ) {
        if(typ == t_int) {
            return "int";
        }
        if(typ == t_bool) {
            return "bool";
        }
        if(typ == t_intset) {
            return "real";
        }
        return "void";
    }
}
