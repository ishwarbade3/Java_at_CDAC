import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		// Stack s = new Stack(10,5); to increase the size by 5
		s.push("Sai");
		//s.push(20);
		s.push("Sidd");
		s.push("Amman");
		//s.push('a');
		s.push("Ishwar");
		System.out.println(s);
		System.out.println(s.peek());
		s.push(null);
		s.pop();
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.size());
		System.out.println(s.search("Ishwar"));
		s.insertElementAt("Bade", 3);
		System.out.println(s);

		System.out.println(s.contains("Bade"));

	}

}
