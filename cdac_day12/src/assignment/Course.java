package assignment;

public class Course {
	private String courseCode;
	private String CourseName;
	private int maxSeat;

	public Course() {

	}

	public Course(String courseCode, String courseName, int maxSeat) {
		super();
		this.courseCode = courseCode;
		CourseName = courseName;
		this.maxSeat = maxSeat;
	}

	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getMaxSeat() {
		return maxSeat;
	}

	public void setMaxSeat(int maxSeat) {
		this.maxSeat = maxSeat;
	}

	@Override
	public String toString() {
		return "  " + courseCode + "  " + CourseName + "  " + maxSeat;
	}

}
