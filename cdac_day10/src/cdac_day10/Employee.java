package cdac_day10;

import java.util.Scanner;

public class Employee implements Comparable<Employee> {

	public int empId;
	private String empName;
	private double empSalary;

	public Employee() {
	}

	public Employee(int empId, String empName, double empSalary) {

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

//	@Override
//	public int compareTo(Employee e) {
//		return this.empId - e.empId;
//	}

	public String toString() {
		return empId + " " + empName + " " + empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void addEmployee() {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		empId = kbd.nextInt();
		System.out.print("Enter Employee Name :");
		empName = kbd.next();
		System.out.print("Enter Employee Salary :");
		empSalary = kbd.nextDouble();
		kbd.close();
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empId > o.empId)
			return +1;
		else if(this.empId <o.empId)
			return -1;
		else
		return 0;
	}

}
