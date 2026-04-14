package lambd;

public class IncrementLambda {
	public static void main(String[] args) {
		Increment i = (a)->{return (a+10);};
		System.out.println(i.incbyten(5));
		System.out.println(i.incbyten(10));
	}

}
