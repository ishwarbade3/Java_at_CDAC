package inheritance;

public class Child {
	public Child m1() {
		return this;
	}
	public void message()
	{
		System.out.println("Hello Ishwar !!");
	}
	public static void main(String[] args) {
		new Child().m1().message();
	}
}
