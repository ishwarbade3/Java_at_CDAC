
public class Employee {
	private int empId;
	private String empName;
	private String empDesig;
	private double empSalary;

	public Employee() {

	}

	public Employee(int empId, String empName, String empDesig, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee  " + empId + "  " + empName + "  " + empDesig + "  "+ empSalary ;
	}
	

}
