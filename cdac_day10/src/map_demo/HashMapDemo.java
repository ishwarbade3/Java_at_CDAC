package map_demo;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(100, "Ishu");
		h.put(200, "Sid");
		h.put(1000, "Sai");
		h.put(130, "Ashu");
		System.out.println(h);
		h.put(null, null);
		System.out.println(h);
	}

}
