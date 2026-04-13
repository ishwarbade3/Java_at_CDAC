package assignment.student;

public class Student {
	private int rollNo;
	private float percentage;

	public Student() {
	}

	public Student(int rollNo, float percentage) {
		this.percentage = percentage;
		this.rollNo = rollNo;
	}

	public void show() {
		System.out.print("Roll NO. : " + rollNo + " Percentage :" + percentage + " % ");
	}

	public String toString() {
		return "Roll No. : "+rollNo + " Percentage : " + percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
