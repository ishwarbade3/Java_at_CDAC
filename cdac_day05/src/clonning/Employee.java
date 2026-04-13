package clonning;

public class Employee implements Cloneable {
	private int empId;
	private String empName;

	public Employee() {
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public String toString() {
		return empId + " " + empName;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException{
		Employee e1 = new Employee(1, "Siddhart");
		Employee e2 = (Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e2);
	}

}
