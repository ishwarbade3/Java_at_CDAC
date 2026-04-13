package assignment.student;

public class SchoolStudent extends Student {
	public String className;

	public SchoolStudent() {
	}

	public SchoolStudent(int r, float p, String cn) {
		super(r, p);
		this.className = cn;
	}

	public void show() {
		super.show();
		System.out.println(" Class Name : " + className);
	}

	public String toString() {
		return super.toString() + " Class Name : " + className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
