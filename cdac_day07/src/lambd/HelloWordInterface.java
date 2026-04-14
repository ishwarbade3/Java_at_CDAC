package lambd;

@FunctionalInterface

public interface HelloWordInterface {
	int n = 100;

	public String sayHello();

	public static void getNo() {
		System.out.println("No : " + n);
	}

	public default void get() {
		System.out.println("Java 8 Default Method");
	}

}
