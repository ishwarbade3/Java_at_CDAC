package lambd;

public class StringConcatLambda {
	public static void main(String[] args) {

		StringConcat sc = (s1, s2) -> {
			return s1.concat(s2);
		};
		
		String a = " How Are You ?";
		System.out.println(sc.strConcat("Hello ", "Ishwar").concat(a));
		System.out.println(sc.strConcat("Hello ",a));
	}

}
