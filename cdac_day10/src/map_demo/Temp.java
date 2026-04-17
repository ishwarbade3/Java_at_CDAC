package map_demo;

import java.util.Objects;

public class Temp {
	private int i;
	public Temp() {};
	public Temp(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return " " + i ;
	}
	@Override
	public int hashCode() {
		return i;
	}
	

}
