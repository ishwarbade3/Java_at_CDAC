package assignment;

public class Full_Time_Faculty extends Faculty {
	private float basic;
	private float allowance;

	public Full_Time_Faculty() {
	}

	public Full_Time_Faculty(int id,String facultyName, float basic, float allowance) {
		super(id,facultyName, (basic + allowance));
		this.allowance=allowance;
		this.basic=basic;
	}

	public void showData() {
		super.showData();
		System.out.println(" Salary : " +(float) (basic + allowance));
	}

}
