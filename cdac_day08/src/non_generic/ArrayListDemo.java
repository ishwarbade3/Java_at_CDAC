package non_generic;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Non Generic Version of Array List
		ArrayList l = new ArrayList();
		System.out.println(l.isEmpty());
		 l.add(10);
		 l.add("A");
		 
		 int a1=100;
		 l.add(a1);
		 Integer a2 = a1;
		 l.add(a2);
		 l.add("Ishwar");
		 
		 System.out.println(l);
		 l.add((l.size()-2) , " Bade");
		 System.out.println(l);
		  
		 System.out.println(l.isEmpty());
		 ArrayList l1 = new ArrayList();
		 l1.add("Demo");
		 l1.add(1);
		 System.out.println(l1);
		 l1.addAll(l);
		 System.out.println(l1);
		 //int a =(Integer)l.get(3);
		 //System.out.println(a);
		 System.out.println(l1.get(5));
		  
		 for(Object o : l1) {
			 System.out.print(o+"\t");
			 //Integer obj = (Integer)o;
		 }
		 
		
	}

}
