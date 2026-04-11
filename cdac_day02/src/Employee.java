
public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	
	public Employee() {}
	
	public Employee(int empId,String empName,float empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public String toString() {
		return "Emloyee Details : "+empId+" "+empName+" "+empSalary;
	}
	public static void main(String[]ishwar) {
		Employee e = new Employee();
		System.out.println(e);
		Employee e1 = new Employee(1025,"Ashish",26525.25f);
		System.out.println(e1);
	}

}
