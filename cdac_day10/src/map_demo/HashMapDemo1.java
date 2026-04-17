package map_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		h.put('G', 10);
		h.put('d', 20);
		h.put('A', 30);
		h.put('I', 5);
		System.out.println(h);

		Set<Character> c = h.keySet();
		System.out.println(c);

		Collection<Integer> i = h.values();
		System.out.println(i);

		Set<Entry<Character, Integer>> e = h.entrySet();
		System.out.println(e);

		Iterator<Map.Entry<Character, Integer>> itr = e.iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> val = itr.next();
			System.out.println(val.getKey() + "  " + val.getValue());

			if (val.getKey().equals('I')) {
				val.setValue(787512020);
			}
		}
		System.out.println(h);
	}
}
