package tree_set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		
		t.add(10);
		t.add(90);
		t.add(20);
		t.add(80);
		t.add(5);
		t.add(60);
		t.add(50);
		System.out.println(t);
		t1.add(10);
		t1.add(90);
		t1.add(20);
		t1.add(80);
		t1.add(5);
		t1.add(60);
		t1.add(50);
		System.out.println(t1);
	}

}
