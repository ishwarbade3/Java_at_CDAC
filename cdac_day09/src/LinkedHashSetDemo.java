import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		System.out.println(lh.isEmpty());

		lh.add(10);
		lh.add(null);
		lh.add(56);
		lh.add(63);
		System.out.println(lh);
		lh.add(10);
		System.out.println(lh);
		lh.add(97);
		System.out.println(lh);
		lh.remove(null);
		System.out.println(lh);

	}

}
