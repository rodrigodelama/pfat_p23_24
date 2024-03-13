public class LVar2 implements LVar {
	public final String ident;
	private boolean ah1;
	
	public String generateCode() {
		ah1 = t;
		return typToString(t) + " " + ident;
	}
}