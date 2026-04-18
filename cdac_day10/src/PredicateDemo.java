import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p = (x)->x>10;
		System.out.println(p.test(10));
		
		Predicate<Integer> p1 = (a)->a%2==0;
		System.out.println(p1.test(16));
		
		System.out.println(p1.and(p).test(16));
		System.out.println(p1.and(p.negate()).test(8));
		System.out.println(p1.or(p.negate()).test(8));
		System.out.println(p1.negate(). and (p.negate()).test(7));

	}
}
