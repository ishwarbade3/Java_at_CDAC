package assignment;
public class Student {
	private int rollNo;
	private String stdName;
	private int age;
	private float score;

	public Student() {
	}

	public Student(int rollNo, String stdName, int age, float score) {
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.age = age;
		this.score = score;
	}

	public String toString() {
		return rollNo + " " + stdName + " " + age + " " + score;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getStdName() {
		return stdName;
	}

	public int getAge() {
		return age;
	}

	public float getScore() {
		return score;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
