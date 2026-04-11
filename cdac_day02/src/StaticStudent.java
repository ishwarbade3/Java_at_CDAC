
public class StaticStudent {
	private int rollNo;
	private String name;
	private static int count;
	
	public StaticStudent() {}
	
	public StaticStudent(int r,String s) {
		rollNo=r;
		name=s;
		count ++;
	}
	
	public String toString() {
		return rollNo+" "+name;
	}
	
	public static void getCount() {
		System.out.println("Count : "+count);
	}
	
	
public static void main(String[]ishwar) {
	StaticStudent s = new StaticStudent(16,"Ashish");
	StaticStudent s1 = new StaticStudent(19,"Rohit");
	StaticStudent s2 = new StaticStudent(21,"virat");
	StaticStudent.getCount();
	}
}
