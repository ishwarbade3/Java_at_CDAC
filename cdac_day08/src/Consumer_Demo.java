import java.util.function.Consumer;

public class Consumer_Demo {
	public static void main(String[] args) {
		Consumer<String> s = (a) -> {
			System.out.println("String : " + a + "   /String Length = " + a.length());
		};
		s.accept("Ishwar Bade");
		Consumer<Integer> s1 = (a) -> {
			System.out.println(a + a);
			System.out.println(a + a + a);
			System.out.println((a + a + a) / a);
		};
		s1.accept(10);
	}

}
