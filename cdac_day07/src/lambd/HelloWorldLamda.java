package lambd;

public class HelloWorldLamda {
	public static void main(String[] args) {
		HelloWordInterface h = () -> {return "Ishwar";};
		System.out.println(h.sayHello());
		h.get();
		HelloWordInterface.getNo();
		
		
	}

}
