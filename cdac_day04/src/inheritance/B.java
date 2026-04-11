package inheritance;

import java.security.DomainCombiner;

public class B extends A {
	public B(){}
	
	public void m1() {
		System.out.println("In M1() of B cls");
	}
	public void m2() {
		System.out.println("In M2() of B cls");
	}
	public static void main(String[] args) {
		B b =new B();
		//System.out.println(b.no); // private member of Parent Class we cannot Acess 
		System.out.println(b.getNo());
		b.m1();
		// Polymorphic reference
		// SuperClasss Reference = Child Class Object
		
		A a = new B();
		B c = new B();
		//B a = new A(); // Does Not Allow
		A d = new A();
		
		//a.m2();		
		if (a instanceof B) {
			((B) a).m2();
		}
		System.out.println(a instanceof A);  // true
		System.out.println(a instanceof B);  // true
		System.out.println(b instanceof A);  // true
		System.out.println(b instanceof B);  // true
		System.out.println(c instanceof A);  // true
		System.out.println(c instanceof B);  // true
		System.out.println(d instanceof A);  // true
		System.out.println(d instanceof B);  // False
		
	}
}
