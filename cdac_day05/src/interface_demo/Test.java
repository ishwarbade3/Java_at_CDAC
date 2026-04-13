package interface_demo;

public class Test  extends A implements Operation , Comparision{
	public void avg(int... a) { 
		int sum =0;
		for(int s:a) {
			sum+=s;
		}
		System.out.println("Average :"+ (sum/a.length));
	}

	public void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
		
	}

	public void sub(int a, int b) {
		System.out.println("Substraction : "+(a>b?a-b:b-a));
	}

	public void mul(int a, int b) {
		System.out.println("multiplicatiom : "+(a*b));
	}

	@Override
	public void div(int a, int b) {
		System.out.println((b==0?"Remainder == 0":"Division"+a/b));
	}

	public void maxNum(int a, int b) {
		System.out.println(((a>b)?"maximum No : "+a :"maximum No :"+b));
	}

	public void minNum(int a, int b) {
		System.out.println(((a<b)?"minimum No : "+a :"minimum No :"+b));
	}
//	public static void main(String[] args) {
//		//Arithmetic a = new Arithmetic(); // we cannot create the object of instance
//		Arithmetic a = new Test();
//		a.add(10, 20);
//		//a.getMessage(); // we cannot access class member with interface reference
//		A b = new Test();
//		b.getMessage();
//		a.sub(26,15);
//		a.mul(13, 2);
//		//a.maxNum(10,20);  // because of reference type
//		Operation o = new Test();
//		Test t = new Test();
//		t.maxNum(26, 63);
//		t.minNum(46, 45);
//		t.avg(1,2,3,4,5,6,7,8,9);
//		t.div(10, 0);
//	}

}
