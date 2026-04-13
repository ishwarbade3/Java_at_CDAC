package assignment;

public class OneBHK {
	
		private int price;
		private int roomArea;
		private int hallArea;
		// private int totalArea;
		static int totalPrice = 0;

		public OneBHK() {
		}

		public OneBHK(int price, int hallArea, int roomArea) {
			this.price = price;
			this.roomArea = roomArea;
			this.hallArea = hallArea;
			totalPrice += price;
			// this.totalArea = totalArea;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String toString() {
			return "Price : " + price + "Rs..  " + " Hall_Area : " + hallArea + " sqft Room_Area : " + roomArea+" sqft ";
		}

		public void showFlat() {
			System.out.println("Price : " + price + "Rs..  " + " Hall_Area : " + hallArea + " sqft  Room_Area : " + roomArea
					+ " sqft ");
		}
	}



