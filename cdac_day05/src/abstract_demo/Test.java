package abstract_demo;

public class Test {
	 //School s = new School(); we cannot create the abstract class reference
	public static void main(String[] args) {
	School s = new Government_School();
	School s1 = new Private_School();
	s1.getMsg();
	s.getName();
	s1.getName();
	System.out.println( s1.getClass());
	
	}
}
