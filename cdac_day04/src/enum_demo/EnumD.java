package enum_demo;

//import java.security.DomainCombiner;

public class EnumD {
	public enum Tea {
		CUTTING(), NORMAL(), KULLAD();

		private int cost;
		
		private Tea() {}

		/*
		 * private Tea(int cost) { this.cost = cost; }
		 */
		public int getCost() {
			return cost;
		}
		
		public void setCost(int cost)
		{
			this.cost = cost;
		}
		
		public String toString()
		{
			return "Name= "+Tea.CUTTING+"Price ="+cost;
		}
	}

	public static void main(String[] args) {
		Tea t = Tea.KULLAD;
		System.out.println(t + " " + t.getCost() + " Rs..");
		t.setCost(100);
		System.out.println(t.getCost());
		Tea.KULLAD.cost = 200;
		System.out.println(Tea.KULLAD.getCost());
	}
}
