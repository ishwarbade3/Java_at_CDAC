package assignment;

public class Faculty {
	private int facultyId;
	private String facultyName;
	private float facultySalary;

	public Faculty() {
	}

	public Faculty(int facultyId,String facultyName, float facultySalary) {
		this.facultyId = facultyId;
		this.facultySalary = facultySalary;
		this.facultyName=facultyName;
	}

	public String toString() {
		return facultyId +"  "+facultyName+ "  " + facultySalary;
	}

	public void showData() {
		System.out.print("Faculty ID : " + facultyId+" Faculty Name : "+facultyName);
	}

}
