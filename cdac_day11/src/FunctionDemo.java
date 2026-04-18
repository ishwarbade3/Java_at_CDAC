import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Double> f = (a) -> Math.sqrt(a);
		System.out.println((int) f.apply(8).intValue());
		Function<String, String> f1 = (a) -> a.toLowerCase().concat(" ").concat(a.toUpperCase());
		System.out.println(f1.apply("Ishwar"));
		Function<String, Integer> f2 = (a) -> a.length();
		System.out.println(f2.apply("Ishwar"));

	}

}
