package demo;

import java.util.function.Function;
import java.util.function.Supplier;

public class MyClass {
	private String msg;

	public MyClass() {
		msg="Ishwar";
	}

	public MyClass(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	public static void main(String[] args) {
		Supplier<MyClass> s = MyClass::new;
		MyClass m = s.get();
		System.out.println(m.getMsg());
		
		Function<String , MyClass> f1 = MyClass::new;
		MyClass m1 = f1.apply("Bade");
		System.out.println(m1.getMsg());
	}
}
