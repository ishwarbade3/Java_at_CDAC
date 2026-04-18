package demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter Full Name : ");
		String name = kbd.nextLine();
		System.out.print("Enter Age : ");
		int age = kbd.nextInt();
		kbd.nextLine();
		System.out.print("Enter Address : ");
		String add = kbd.nextLine();
		System.out.println("Name : " + name);
		System.out.println("Name : " + age);
		System.out.println("Name : " + add);

		kbd.close();
	}

}
