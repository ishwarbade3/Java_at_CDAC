

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ishwar");
		a.add("Sai");
		a.add("Sidd");
		a.add("Azim");

		System.out.println(a);

		ListIterator<String> itr = a.listIterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals("Sidd")) {
				itr.set("Siddhart");
				System.out.println(a);
				itr.remove();
				System.out.println(a);
				itr.add("sid(___)");
				System.out.println(a);

			}

		}
		System.out.println("--------------");
		ListIterator<String> itrr = a.listIterator();
		while(itrr.hasNext()) {
			String s = itrr.next();
			System.out.println(s);
		}
		System.out.println("--------------");
		while(itrr.hasPrevious()) {
			String s = itrr.previous();
			System.out.println(s);
		}

	}

}
