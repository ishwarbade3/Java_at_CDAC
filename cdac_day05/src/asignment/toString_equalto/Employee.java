package asignment.toString_equalto;

public class Employee extends Object {
	private int empId;
	private String empName;
	private float empSalary;

	public Employee() {
	}

	public Employee(int empId, String empName, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString() {
		return "Employee Id : " + empId + " Employee Name : " + empName + " Employee Salary=" + empSalary;
	}

	public boolean equals(Object o) {
		Employee e = (Employee) o;
//		if (e.empId == this.empId && this.empName == e.empName && this.empSalary == e.empSalary) {
//			return true;
//		} else {
//			return false;
//		}
		if (this.empId == e.empId)
			return true;
		else
			return false;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
