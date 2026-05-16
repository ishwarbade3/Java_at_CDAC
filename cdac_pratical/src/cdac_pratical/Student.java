package cdac_pratical;

public class Student {
	private int rollNo;
	private String name;
	private float marks;

	Student() {
		rollNo = 0;
		name = "NA";
		marks = 0.0f;
	}

	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student : " + rollNo + "  " + name + "  " + marks;
	}

}
