package inheritance;

public class D extends C {
	public D() {
		// super();
		System.out.println("In Default of D");
	}

	public D(int f) {
		super(12.5f);
		System.out.println("In Parameteric of D");
	}

	public static void main(String[] args) {
		// D d = new D();
		// D d1 = new D(10);
	}
}