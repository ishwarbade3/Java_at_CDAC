package assignment;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Student[] std = new Student[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the Data of : " + (i + 1) + " Student : ");
			System.out.print("Ente  Roll NO : ");
			int rollNo = kbd.nextInt();

			System.out.print("Ente the Name : ");
			String stdName = kbd.next();

			System.out.print("Ente the Age  :");
			int age = kbd.nextInt();

			System.out.print("Ente the Score :");
			float score = kbd.nextFloat();
			
		   std[i]=new Student(rollNo,stdName,age,score);

		}
		System.out.println("You entered following student !!!!");
		for(Student s : std) {
			System.out.println(s);
		}
		
//		for(int i=0;i<10-1;i++) {
//			for(int j=i+1;j<10;j++) {
//				if(std[i].getScore() > std[j].getScore()) {
//					Student temp = std[i];
//					std[i]= std[j];
//					std[j]=temp;
//				}
//			}
//		}
//		System.out.println("After the ordering students becomes ");
//		for(Student s : std) {
//			System.out.println(s);
//		}
		
		System.out.println("\n\nGroup 1 (Score between 0 to 50");
		for(int i=0;i<10;i++) {
			if(std[i].getScore() < 50 && std[i].getScore()>0) {
				System.out.println(std[i]);
			}
		}
		
		System.out.println("\n\nGroup 1 (Score between 50 to 65");
		for(int i=0;i<10;i++) {
			if(std[i].getScore() >= 50 && std[i].getScore()<65) {
				System.out.println(std[i]);
			}
		}
		
		System.out.println("\n\nGroup 1 (Score between 65 to 80");
		for(int i=0;i<10;i++) {
			if(std[i].getScore() >= 65 && std[i].getScore()<80) {
				System.out.println(std[i]);
			}
		}
			
			System.out.println("\n\nGroup 1 (Score between 80 to 100");
			for(int i=0;i<10;i++) {
				if(std[i].getScore() >= 80 && std[i].getScore()<100) {
					System.out.println(std[i]);
				}
			}
		kbd.close();
		
	}

}
