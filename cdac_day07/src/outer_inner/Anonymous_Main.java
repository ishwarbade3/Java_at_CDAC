package outer_inner;

public class Anonymous_Main {
	public static void main(String[] args) {
		Anonymous_Inner a = new Anonymous_Inner() {
			@Override
			public void add(int a, int b) {
				System.out.println("Addition : " + (a + b));
			}
		};
		a.add(10, 20);
		System.out.println(a.getClass());
	}

}
