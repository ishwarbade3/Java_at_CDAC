package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Product_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Map<Integer, Product> catlog = new HashMap<Integer, Product>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the " + (i + 1) + "product Details As Follow !!!");
			System.out.print("Enter Product Id    : ");
			int id = kbd.nextInt();
			System.out.print("Enter Product Name  : ");
			String name = kbd.next();
			System.out.print("Enter Product Price : ");
			double price = kbd.nextDouble();

			catlog.put((id), new Product(id, name, price));

		}

		System.out.println(catlog);
		Set<Entry<Integer, Product>> s = catlog.entrySet();
		Iterator<Map.Entry<Integer, Product>> itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Product> i = itr.next();
			System.out.println(i.getKey() + " : " + i.getValue());
		}

		List<Product> cart = new ArrayList<Product>();
		Stack<String> history = new Stack<String>();

		while (true) {
			System.out.println(
					" ***** Options ****** \n1. Add Product \n2. Remove Product \n3. Display Cart \n4. History \n5. Exit");
			System.out.println("Enter Your Choice ::");
			int ch = kbd.nextInt();

			switch (ch) {
			case 1: {
				System.out.print("Enter Product Id to Add : ");
				int id = kbd.nextInt();

				if (catlog.containsKey(id)) {
					Product p = catlog.get(id);
					cart.add(p);
					history.push("Added : " + p.getName());
					if (history.size() > 3) {
						history.remove(0);
						System.out.println("Added Sucessfully!!!!!!!!!!!");
					}
				}
				break;
			}
			case 2: {
				System.out.print("Enter Product Id  to remove: ");
				int id = kbd.nextInt();
				Iterator<Product> i = cart.iterator();
				while (i.hasNext()) {
					Product p = i.next();
					if (p.getpId() == id) {
						i.remove();
						history.push("Removed " + p.getName());
						System.out.println("Removed SucessFully!!!!!!!!!!!");
						if (history.size() > 3) {
							history.remove(0);
						}
						break;
					}
				}
				break;
			}
			case 3: {
				double total = 0;
				System.out.println("Your Cart Becomes!!!!!");
				for (Product p : cart) {
					System.out.println(p);
					total += p.getPrice();
				}
				System.out.println("Total  Amount : " + total);
				break;
			}
			case 4: {
				System.out.println("Your Cart History as Follow!!!!!!");
				System.out.println(history);
				break;
			}
			case 5: {
				System.exit(0);
			}
			}
			kbd.close();
		}

	}

}
