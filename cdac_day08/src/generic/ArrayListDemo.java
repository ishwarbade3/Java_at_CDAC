package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		System.out.println(l.isEmpty());
		// l.add(null);
		System.out.println(l);
		// l.add(10);//CTE
		l.add("Ishwar");
		l.add("Siddhart");
		l.add("Amaan");
		l.add("Sai");
		l.add("Digu");
		System.out.println(l);
		for (String s : l) {
			System.out.println(s);
		}
		Collections.sort(l);
		System.out.println(l);
		Object s = l.get(3);
		System.out.println(s);
		String s1 = l.get(3);
		System.out.println(s1);

	}

}
