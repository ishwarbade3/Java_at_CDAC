package exception_handling;

public class MyExcep_A_Main {
	public static void main(String[] args) {

		A a = new A();
		double d;
		try {
			d = a.div(5,10);
			if (d < 1) {
				throw new MyException();
			}
			System.out.println("D : " + d);

		} catch (MyException e) {
			System.out.println(e);
		}

	}
}
