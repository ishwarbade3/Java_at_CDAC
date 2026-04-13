package assignment;

public class Floor { 
	private float length;
	private float width;
	
	public Floor() {}

	public Floor(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public int totalTiles(Tile t) {
		float  floorArea = (length * width);
		float tileArea= t.getEdge()*t.getEdge();
		return (int)(floorArea /tileArea);
	}
	
	
	
}
