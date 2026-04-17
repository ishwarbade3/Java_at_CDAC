package campus.acadamics;

import campus.data.Person;

public class Faculty extends Person {
	private int facultyId;
	private double salary;
	private static double totalSalary;
	private String branch;

	public Faculty() {
	}

	public Faculty(String name, int age, String address, int facultyId, double salary, String branch) {
		super(name, age, address);
		this.totalSalary += salary;
		this.facultyId = facultyId;
		this.salary = salary;
		this.branch = branch;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return super.toString()+"Faculty  --> " + facultyId + "  " + salary + "  " + branch;
	}
	public double totalSalary() {
		return totalSalary;
	}

}
