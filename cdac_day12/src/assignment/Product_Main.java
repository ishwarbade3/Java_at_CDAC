package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Product_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Map<Integer, Product> cart = new HashMap<Integer, Product>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the " + (i + 1) + "product Details As Follow !!!");
			System.out.print("Enter Product Id    : ");
			int id = kbd.nextInt();
			System.out.print("Enter Product Name  : ");
			String name = kbd.next();
			System.out.print("Enter Product Price : ");
			double price = kbd.nextDouble();

			cart.put((i + 1), new Product(id, name, price));

		}

		System.out.println(cart);
		Set<Entry<Integer, Product>> s = cart.entrySet();
		Iterator<Map.Entry<Integer, Product>> itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Product> i = itr.next();
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		
		
		
		
		
		
		
		kbd.close();
	}

}
