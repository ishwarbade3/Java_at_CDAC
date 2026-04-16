package tree_set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		//t.add("Ishwar");
		//t.add(null);
		t.add(56);
		System.out.println(t);
		//t.add(null);
		t.add(10);
		System.out.println(t);
		t.add(63);
		t.add(45);
		System.out.println(t);
	}

}
