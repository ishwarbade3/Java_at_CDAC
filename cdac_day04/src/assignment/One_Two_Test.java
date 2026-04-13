package assignment;

public class One_Two_Test {
	public static void main(String[] args) {
		TwoBHK f1 = new TwoBHK(17000,350,260,210);
		TwoBHK f2 = new TwoBHK(22000,320,200,210);
		TwoBHK f3 = new TwoBHK(25000,400,250,190);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		System.out.println("All Flat Price "+TwoBHK.totalPrice);
		
	}

}
