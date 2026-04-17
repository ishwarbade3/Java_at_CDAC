package campus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import campus.acadamics.Student;
//import campus.acadamics.Faculty;
import campus.account.Fees;

public class CampusApp {
	public static void main(String[] args) throws ParseException {
		Scanner kbd = new Scanner(System.in);
		/*
		 * Faculty[] faculty = new Faculty[5]; for (int i = 0; i < 5; i++) {
		 * System.out.println("Enter the " + (i + 1) + " Faculty Detail!!");
		 * System.out.print("Enter the Name      : "); String nm = kbd.next();
		 * System.out.print("Enter the Age       : "); int age = kbd.nextInt();
		 * System.out.print("Enter the Address   : "); String add = kbd.nextLine();
		 * System.out.print("Enter the FacultyID : "); int id = kbd.nextInt();
		 * System.out.print("Enter the Salary    : "); double sal = kbd.nextDouble();
		 * System.out.print("Enter the Branch    : "); String branch = kbd.next();
		 * 
		 * faculty[i] = new Faculty(nm, age, add, id, sal, branch); }
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println((Faculty)faculty[i]); }
		 * System.out.println("Total Salary of all Faculty : "+new
		 * Faculty().totalSalary());
		 */

		Fees fee[] = new Fees[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter the " + (i + 1) + " Student Detail!!");
			System.out.print("Enter the Name    : ");
			String nm = kbd.next();
			System.out.print("Enter the Age     : ");
			int age = kbd.nextInt();
			System.out.print("Enter the Address : ");
			kbd.nextLine();
			String add = kbd.nextLine();
			System.out.print("Enter the Roll NO : ");
			int id = kbd.nextInt();
			System.out.print("Enter the Semister: ");
			int sem = kbd.nextInt();
			System.out.print("Enter the Branch  : ");
			String branch = kbd.next();

			System.out.println("Enter Fees Paid    :");
			double money = kbd.nextDouble();
			System.out.println("Enter Payment Date (dd-mm-yyy): ");
			String dt = kbd.next();
			DateTimeFormatter fdate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(dt,fdate);
			Student newStd = new Student(nm, age, add, id, branch, sem);
			fee[i]= new Fees(newStd, money, date);
			
		}
		for(int i =0 ;i< 4 ;i++) {
			if(fee[i].getStudent().getSemisterNo()==2) {
			System.out.println(fee[i].getStudent().toString()+fee[i]);
			}
		}
		System.out.println("Total Fees  is  : "+new Fees().getTotalFees());

		kbd.close();
	}
}
