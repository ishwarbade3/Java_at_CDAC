package asignment.toString_equalto;

import java.util.Scanner;

public class Employee_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Employee e1 = new Employee(123, "Ishwar", 20000);
		Employee e2 = new Employee(123, "Ishwar", 20000);

		System.out.println(e1);
		System.out.println(e2);

		if (e1.equals(e2)) {
			System.out.println("Are Equal");
		} else {
			System.out.println("Are Not Equal");
		}
		System.out.print("Enter the Total no of Employee : ");
		int size = kbd.nextInt();
		Employee[] arr = new Employee[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " Employee details ;");

			System.out.print("Enter Employee ID    :");
			int eId = kbd.nextInt();

			System.out.print("Enter Employee Name   :");
			String eName = kbd.next();

			System.out.print("Enter Employee Salary  :");
			float eSal = kbd.nextFloat();

			Employee addemp = new Employee(eId, eName, eSal);

			int flag = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j]!=null&&arr[j].equals(addemp)) {
					System.out.println("Employee Already Exist!!!");
					i--;
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				arr[i] = addemp;
			}
		}
		
		for (Employee s : arr) {
			System.out.println(s);
		}
		kbd.close();
	}
}
