package constants;

public class M {
	
	private final float PI ;
	
	public M()
	{
		PI=3.14f;
	}
	public void setPI() {
		//PI=10.20;      // Finam Member Cannot be re initialize
	}
	public final void m1() {
		System.out.println("In Class  M final ");
	}
	public void displayPI() {
		System.out.println("PI value : "+PI);
	}
}
