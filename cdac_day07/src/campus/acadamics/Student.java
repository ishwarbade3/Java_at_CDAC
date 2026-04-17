package campus.acadamics;

import campus.data.Person;

public class Student extends Person {
	private int rollNo;
	private String branch;
	private int semisterNo;

	public Student() {
	}

	public Student(String name, int age, String address, int rollNo, String branch, int semisterNo) {
		super(name, age, address);
		this.rollNo = rollNo;
		this.branch = branch;
		this.semisterNo = semisterNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getSemisterNo() {
		return semisterNo;
	}

	public void setSemisterNo(int semisterNo) {
		this.semisterNo = semisterNo;
	}

	@Override
	public String toString() {
		return super.toString()+"Student  --> " + rollNo + "  " + branch + "  " + semisterNo;
	}

}
