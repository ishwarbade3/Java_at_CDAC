package assignment.processor;

import java.util.Scanner;

public class Processor_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		Processor f = new Factorial();
		Processor c = new Circle();

		System.out.print("Enter the Number : ");
		float num = kbd.nextFloat();

		System.out.print("Enter your Choice !!! \n  1. Factorial \n  2. Area of Circle \n :");
		int choice = kbd.nextInt();

		if (choice == 1) {
			f.process(num);
		} else if (choice == 2) {
			c.process(num);
		} else {
			System.out.println("Invalid Choice !!!");
		}

		kbd.close();
	}

}
