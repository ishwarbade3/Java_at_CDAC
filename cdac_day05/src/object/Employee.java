package object;

public class Employee {
	private int empNo;
	private String name;

	public Employee() {
	}

	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}

	public String toString() {
		return empNo + " " + name;
	}

	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (this.empNo == emp.empNo && this.name == emp.name) {
			return true;
		} else {
			return false;
		}
	}

//	public int hashCode() {
//		return empNo + 1;
//	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ishwar");
		Employee e2 = new Employee(1, "Ishwar");
		// e2=e1;

		if (e1 == e2) {
			System.out.println("Are Equal !!");
		} else {
			System.out.println("Are not Equal !!");
		}

		if (e1.equals(e2)) {
			System.out.println("(Shallow Copy) Are Equal !!");
		} else {
			System.out.println("(Shallow Copy) Are not Equal !!");
		}

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
