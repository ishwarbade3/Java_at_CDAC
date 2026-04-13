package assignment.interface_tax;
import java.util.Scanner;

public interface Taxable {
//	private final static float salesTax=7; 
	// illegal modifier for the interface field Taxable.salesTax; only public,
	// static & final are permitted
	// interface data member cannot be private

	final static float salesTax = 7;
	float incomeTax = 10.5f;
	// by default interface data members are public, final and static

	public abstract void calculateTax();
	
	 Scanner kbd =new Scanner(System.in);
	

}
