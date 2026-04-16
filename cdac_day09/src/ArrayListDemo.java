import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		Character ch[]= {'A','B','C','D','E'};
				List l = Arrays.asList(ch);
				l.set(0, 'I');
				System.out.println(l);
				l.forEach( x -> {System.out.println(x);});
				//l.add('G');UnsupportedOperationException
				//l.set(0, 'ISHWAR');  // CTE
				
	}

}
