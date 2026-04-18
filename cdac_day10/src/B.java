
public class B extends A {
	@SuppressWarnings("unused")
	private int b;
	
	
	@Override
	public void method1() {  //  override use
		System.out.println("In method()1 of B");
	}
	
	@Deprecated    // can have updated version in future
	public void method2() { 
		System.out.println("In method()2 of B");
	}
	
	public void method3() {
		@SuppressWarnings("unused")
		int y;
	}
	
	

}
