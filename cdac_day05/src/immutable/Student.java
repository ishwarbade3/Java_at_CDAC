package immutable;

public final class Student {
	private final int rollNo;
	private final String name;

	// public Student(){}
	// we cannot create default constructer of final classs;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	/*
	 * // we cannot create getter and setter method for final class public int
	 * getRollNo() { return rollNo; }
	 * 
	 * public String getName() { return name; } public void setRollNo(int rollNo) {
	 * this.rollNo=rollNo;
	 * 
	 * }
	 * 
	 * public String setName(String name) { this.name= name; }
	 */
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ishwar");
		Student s2 = new Student(2, "Ashish");
		final Student s3 = new Student(3, "Azim");
		 
		//s3 = new Student(4, "Virat"); // we cannot change final Object 
		
		//s1.rollNo=3; we cannot change final data member
	}
}
