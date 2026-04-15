import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(13);
		ll.add(20);
		ll.add(26);
		System.out.println(ll);
		ll.addFirst(111);
		System.out.println(ll);
		ll.addLast(2222);
		System.out.println(ll);
		ll.add(220);
		System.out.println(ll);
		
		ll.remove();
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.add(null);
		ll.removeLast();
		System.out.println(ll);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			int n = (Integer)itr.next();
			if(n%2==0) {
				itr.remove();
			}
			
		}
		System.out.println(ll);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof RandomAccess);
		
		
		
		
		
		
	}
}
