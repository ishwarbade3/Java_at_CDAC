package clonning;

public class Student implements Cloneable {
	private int rollNo;
	private String stdName;
	private Subject subject;
	
	public Student() {}
	public Student(int rn,String nm,Subject s) {
		this.rollNo=rn;
		this.stdName=nm;
		this.subject=s;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getStdName() {
		return stdName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String toString() {
		return rollNo+" "+stdName+" "+subject+" ";
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
