import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		v.add(10);
		System.out.println(v.add(50));
		v.add(20);
		v.add(null);
		System.out.println(v);
		v.add(60);
		System.out.println(v);
		v.add(90);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(90);
		v.add(90);
		v.add(90);
		v.add(90);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(90);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());

		v.remove(9);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
//		v.clear();
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
		
		Enumeration<Integer> e =v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+"\t");
		}
		

	}

}
