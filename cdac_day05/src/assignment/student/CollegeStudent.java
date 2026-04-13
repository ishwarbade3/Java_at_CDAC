package assignment.student;

public class CollegeStudent extends Student {
	private int semister;

	public CollegeStudent() {
	}

	public CollegeStudent(int r, float p, int semister) {
		super(r, p);
		this.semister = semister;
	}

	public void show() {
		super.show();
		System.out.println(" Semister  : " + semister);
	}

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}

	public String toString() {
		return super.toString() + " Semister : " + semister;
	}

}
