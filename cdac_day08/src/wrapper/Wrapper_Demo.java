package wrapper;

public class Wrapper_Demo {
	public static void main(String[] args) {
		int no = 10;
		Integer i = new Integer(no);//Manual Boxing
		System.out.println(no); // boxing

		int n = i.intValue();//unboxing
		System.out.println(n);
		String str = "100";
		int a = Integer.parseInt(str);
		System.out.println(a);
		Integer b = Integer.valueOf(str);
		System.out.println(b);

		int s = 11;
		Integer d = s;
		//System.out.println(d);
		 //Auto Boxing
		System.out.println(d);
		System.out.println(s);

		int m = d;  // Auto Boxing
		System.out.println(m);

	}

}
