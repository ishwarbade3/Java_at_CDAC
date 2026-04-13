package deep_clonning;

public class Student implements Cloneable {
	private int stdId;
	private String stdName;
	private Subject subject;

	public Student() {
	}

	public Student(int stdId, String stdName, Subject subject) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.subject = subject;
	}

	public String toString() {
		return stdId + " " + stdName + " " + subject;
	}

	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.subject = (Subject) subject.clone();
		return s;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}