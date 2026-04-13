package assignment;

public class Tile_Floor_Test {
	public static void main(String[] args) {
		Tile t = new Tile(2);
		Floor f = new Floor(10, 5);

		System.out.println("Total tile Require : " + f.totalTiles(t));
	}

}
