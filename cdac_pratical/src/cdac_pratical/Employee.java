package cdac_pratical;

public class Employee {
	private int empId;
	private String empName;
	private String empDesig;
	private float empSal;

	public Employee() {
	}

	public Employee(int empId, String empName, String empDesig, float empSal) {

		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String toString() {
		return "Emp " + empId + "\t" + empName + "\t" + empDesig + "\t" + empSal;
	}

}
