import java.io.Serializable;
import java.util.HashSet;
import java.util.RandomAccess;

public class HashSetDemo {
	public static void main(String[] args) {
//		HashSet h = new HashSet();
//
//		h.add(10);
//		h.add(null);
//		h.add("Ishwar");
//		h.add(10.25f);
//		System.out.println(h);
//		h.add(56);
//		h.add(52);
//		h.add(null);
//		h.add(13);
//		h.add(10);
//		System.out.println(h);
//		System.out.println(h instanceof Serializable);
//		System.out.println(h instanceof Cloneable);
//		System.out.println(h instanceof RandomAccess);
//		System.out.println(h.hashCode());
//		System.out.println(h.size());
//		h.remove(null);
//		System.out.println(h);

		HashSet<Integer> h = new HashSet<Integer>();

		h.add(10);
		h.add(null);
		// h.add("Ishwar"); // CTE
		// h.add(10.25f); //CTE
		System.out.println(h);
		h.add(56);
		h.add(52);
		h.add(null);
		h.add(13);
		h.add(10);
		System.out.println(h);
		System.out.println(h instanceof Serializable);
		System.out.println(h instanceof Cloneable);
		System.out.println(h instanceof RandomAccess);
		System.out.println(h.hashCode());
		System.out.println(h.size());
		h.remove(null);
		System.out.println(h);

	}

}
