package assignment.processor;

public class Factorial extends Processor{
	
	public void process (float num) {
		float fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+(int)num+" is : "+(int)fact);
	}

}
