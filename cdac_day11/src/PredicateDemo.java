import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		List<Trainer> l = TrainerDetails.addData();
		for (Trainer t : l) {
			System.out.println(t);
		}
		System.out.println("----------------------------------------------------------------------");

		Predicate<Trainer> p = (x) -> x.isOnline() && x.getExp_years() > 10;

		l.forEach((x) -> {
			if (p.test(x)) {
				System.out.println(x.getName() + "  " + x.getExp_years());
			}
		});
		System.out.println("----------------------------------------------------------------------");
		Predicate<Trainer> p1 = (a) -> a.getName().toLowerCase().startsWith("s");
		// Predicate<Trainer> p1 = (x)->x.getName().charAt(0)== "S";
		// Predicate<Trainer> p1 = (x) -> x.getName().toLowerCase().trim().charAt(0) ==
		// 's';
		l.forEach((a) -> {
			if (p1.test(a)) {
				System.out.println(a.getName());
			}
		});
		System.out.println("----------------------------------------------------------------------");
		Predicate<Trainer> p2 = (x) -> x.getName().trim().toLowerCase().charAt(0) == 's' && x.getAge() > 25;
		l.forEach((a) -> {
			if (p2.test(a)) {
				System.out.println(a.getName() + "\t" + a.getAge());
			}
		});

	}

}
