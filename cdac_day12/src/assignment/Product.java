package assignment;

public class Product {
	private int pId;
	private String Name;
	private double price;

	public Product() {
	}

	public Product(int pId, String name, double price) {
		super();
		this.pId = pId;
		Name = name;
		this.price = price;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " " + pId + "  " + Name + "  " + price;
	}

}
