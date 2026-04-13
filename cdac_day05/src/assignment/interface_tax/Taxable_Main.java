package assignment.interface_tax;

public class Taxable_Main {
	public static void main(String[] args) {
		Taxable e1 = new Employee(123, "Varun", 30000);
		Taxable p1 = new Product(456, 50, 4);
		e1.calculateTax();
		p1.calculateTax();
		
		Employee e2 = new Employee();
		Product p2 = new Product();
		
		e2.acceeptData();
		p2.acceeptData();
		e2.calculateTax();
		p2.calculateTax();

	}

}
