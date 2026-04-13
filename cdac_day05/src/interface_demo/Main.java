package interface_demo;

public class Main {
	public static void main(String[] args) {
		//Arithmetic a = new Arithmetic(); // we cannot create the object of instance
		Arithmetic a = new Test();
		a.add(10, 20);
		//a.getMessage(); // we cannot access class member with interface reference
		A b = new Test();
		b.getMessage();
		a.sub(26,15);
		a.mul(13, 2);
		//a.maxNum(10,20);  // because of reference type
		Operation o = new Test();
		Test t = new Test();
		t.maxNum(26, 63);
		t.minNum(46, 45);
		t.avg(1,2,3,4,5,6,7,8,9);
		t.div(10, 0);
		o.avg(5,3,4);
	}

}
