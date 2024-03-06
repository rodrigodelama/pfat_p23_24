package Compiler;

public class Typ {
	public static final boolean tint = true;
	public static final boolean tbool = false;
	
	public static String typToString (boolean typ) {
		if (typ == int)
			return "int";
		return "boolean";
	}
}