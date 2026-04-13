package assignment.interface_tax;

public class Employee implements Taxable {

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

	public void acceeptData() {
		System.out.print("Enter Employee  ID     : ");
		empId = kbd.nextInt();
		System.out.print("Enter Employee  Name   : ");
		empName = kbd.next();
		System.out.print("Enter Employee Salary : ");
		empSalary = kbd.nextFloat();
		//kbd.close();
	}

	public String toString() {
		return "Employee Id : " + empId + " Employee Name : " + empName + " Employee Salary=" + empSalary;
	}

	public void calculateTax() {
		System.out.println("Income tax on " + empSalary + " Salary : " + ((12 * empSalary) * (Taxable.incomeTax / 100))
				+ " Rs..per yr");
	}

}
