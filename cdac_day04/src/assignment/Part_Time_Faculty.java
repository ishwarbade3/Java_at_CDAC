package assignment;

public class Part_Time_Faculty extends Faculty {
	private float hour;
	private float rate;

	public Part_Time_Faculty() {
	}

	public Part_Time_Faculty(int id,String facultyName, float hour, float rate) {
		super(id,facultyName, (hour * rate));
		this.hour=hour;
		this.rate=rate;
	}

	public void showData() {
		super.showData();
		System.out.println(" Salary : " + (float)(hour * rate));
	}

}
