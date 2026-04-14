package outer_inner;

public class Static_Inner {
	private int n1;
	private static int n2;

	public Static_Inner() {
		n1 = 10;
	}

	public void initN2(int n) {
		n2 = n;
	}

	static {
		n2 = 100;
	}

	public static class Inner {
		private int n3;

		public Inner() {
			n3 = 2004;
		}

		public void getNo() {
			// System.out.println(n1); // we cannot acess non static member in static class
			System.out.println("n1 : "+new Static_Inner().n1);
			System.out.println("n2 : " + n2);
			System.out.println("n3 : " + n3);
			Static_Inner o = new Static_Inner();
			System.out.println("N1 : "+o.n1);
		}

	}

	public static void main(String[] args) {
		Static_Inner.Inner i = new Static_Inner.Inner();
		Static_Inner o = new Static_Inner();
		i.getNo();
		System.out.println(Static_Inner.n2);

		o.initN2(1304);
		System.out.println(Static_Inner.n2);
		i.getNo();
	}

}
