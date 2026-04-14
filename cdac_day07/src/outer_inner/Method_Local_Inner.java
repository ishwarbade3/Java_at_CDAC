package outer_inner;

public class Method_Local_Inner {
	private int n;

	public Method_Local_Inner() {
		n = 1111;
	}

	public void getNo() {
		int n = 111;
		class Inner {
			private int n;

			private Inner() {
				n = 11;
			}

			public int getN(int n) {
				return n;
			}
		}
		Inner i = new Inner();
		System.out.println("No : " + i.n);
		System.out.println("No : " + i.getN(n));
		System.out.println("No : " + i.getN(this.n));
	}

	public static void main(String[] args) {
		Method_Local_Inner o = new Method_Local_Inner();
		o.getNo();

	}

}
