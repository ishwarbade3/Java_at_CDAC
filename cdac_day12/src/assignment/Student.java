package assignment;

public class Student {
	private int stdId;
	private String name;
	private String dept;
	private double marks;
	
	public Student() {}

	public Student(int stdId, String name, String dept, double marks) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student : " + stdId + "\t" + name + "\t" + dept + "\t" + marks ;
	}
	
	
	

}
