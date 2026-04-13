package assignment.interface_tax;

public class Product implements Taxable {
	private int pId;
	private float price;
	private int qty;

	public Product() {
	}

	public Product(int pId, float price, int qty) {
		this.pId = pId;
		this.price = price;
		this.qty = qty;
	}

	public void acceeptData() {
		System.out.print("Enter Product   ID     : ");
		pId = kbd.nextInt();
		System.out.print("Enter Product price    : ");
		price = kbd.nextFloat();
		System.out.print("Enter Product Quantity : ");
		qty = kbd.nextInt();
		//kbd.close();
	}

	public String toString() {
		return "Product Id : " + pId + " Price :" + price + " Quantity=" + qty;
	}

	public void calculateTax() {
		System.out.println("Sales tax on " + qty + " product with " + price + " price is "
				+ ((price * qty) * (Product.salesTax / 100)) + " Rs....");
	}

}
