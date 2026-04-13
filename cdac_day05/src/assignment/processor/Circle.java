package assignment.processor;

public class Circle extends Processor {
	private static final float PI = 3.14f;

	public Circle() {
		// PI=3.14f; // we cannot reinitialize the final member
	}

	public void process(float radius) {
		System.out.println("Area of Circle : " + (PI * radius * radius));

	}

}
