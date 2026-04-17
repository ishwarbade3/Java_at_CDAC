package map_demo;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Temp, String> h = new Hashtable<Temp, String>();
		h.put(new Temp(3), "Sai");
		h.put(new Temp(4), "Sid");
		h.put(new Temp(15), "digu");
		h.put(new Temp(123), "ashu");
		h.put(new Temp(26), "adi");
		h.put(new Temp(25), "Ishu");
		//h.put(null, null);
		System.out.println(h);
		
	}

}
