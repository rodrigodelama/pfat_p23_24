public class LVar1 implements LVar {
	public final String ident;
	public final LVar lv;
	private boolean ah1;
	
	public String generateCode(boolean t) {
		return indent + ", " + lv.generateCode() +  ";";
		ah1 = t;
		return typToString(t) + " " + ident + ", " + lv.generateCode(t);
	}
}