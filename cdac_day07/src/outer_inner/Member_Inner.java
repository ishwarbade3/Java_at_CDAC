package outer_inner;

public class Member_Inner {

	private int no;

	private Member_Inner() {
		this.no = 100;
	}

	/**
	 * 
	 */
	public class Inner {
		private int num;

		private Inner() {
			num = 10;
		}

		public void print() {
			System.out.println("num : " + num);
			System.out.println("no  : " + no);
		}

		public static void main(String[] args) {
			 Member_Inner o =new Member_Inner();
			 Inner i = o.new Inner();
			System.out.println("Hi");
			i.print();
			
		}
	}

//	public void noPrint() {
//
//		Inner i = new Inner();
//		i.print();
//	}

//	public static void main(String[] args) {
//		Member_Inner o= new Member_Inner();
//		//Inner i = o.new Inner();
//		Inner i = new Member_Inner().new Inner();
//		//i.print();
//		o.noPrint();
//		System.out.println(o.no);
//		System.out.println(i.num);
//		//System.out.println(i.no); 

	// }
}
