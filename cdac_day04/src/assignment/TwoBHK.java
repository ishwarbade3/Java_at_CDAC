package assignment;

public class TwoBHK extends OneBHK {
	private int secondRoomArea;

	public TwoBHK() {
	}

	public TwoBHK(int price, int hallArea, int roomArea, int secondRoomArea) {
		super(price, hallArea, roomArea);
		this.secondRoomArea = secondRoomArea;
	}

	public String toString() {
		return super.toString() + " Second_Room_Area : " +secondRoomArea+" sqft";
	}

	public void showFlat() {
		super.showFlat();
		System.out.print(" Second_Room_Area : " + secondRoomArea + " sqft");
	}

}
 