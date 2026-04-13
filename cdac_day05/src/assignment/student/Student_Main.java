package assignment.student;

import java.util.Scanner;

public class Student_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		SchoolStudent s1 = new SchoolStudent(113, 89.33f, "12");
		SchoolStudent s2 = new SchoolStudent(112, 82.20f, "10");
		SchoolStudent s3 = new SchoolStudent(107, 76.9f, "BE");

		Student c1 = new CollegeStudent(123, 74.8f, 2);
		Student c2 = new CollegeStudent(456, 55.8f, 1);

		Student[] stdarr = new Student[5];
		stdarr[0] = s1;
		stdarr[1] = s2;
		stdarr[2] = s3;
		stdarr[3] = c1;
		stdarr[4] = c2;

		for (Student s : stdarr) {
			System.out.println(s);
		}
		int count = 0;
		for (int i = 0; i < stdarr.length; i++) {
			if (stdarr[i].getPercentage() >= 75) {
				count++;
			}
		}
		System.out.println("No of student  with A grade : " + count);

		System.out.print("Enter roll No to check Class : ");
		int rollNo = kbd.nextInt();
		int flag = 0;
		for (int i = 0; i < stdarr.length; i++) {
			if (stdarr[i].getRollNo() == rollNo) {
				if (stdarr[i] instanceof CollegeStudent) {
					System.out.println(stdarr[i].getRollNo() + " is Belonging to College Student Class !!");
				} else {
					System.out.println(stdarr[i].getRollNo() + " is Belonging to School Student Class !!");
				}
				flag =1;
			}
		}
		if (flag == 0) {
			System.out.println("Oops!!! " + rollNo + " is Not Present in Student List ");
		}

		kbd.close();
	}

}
