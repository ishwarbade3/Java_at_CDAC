import java.util.*;
import java.util.function.Predicate;


public class StaticRefDemo {
	public static boolean isMoreThanTen(Trainer t) {
		return t.getExp_years() >= 15 ? true : false;
	}
	public static void main(String[] args) {
		List<Trainer> list = TrainerDetails.addData();
		
		Predicate<Trainer> p = StaticRefDemo::isMoreThanTen;
		list.forEach((a)->{
			System.out.print(p.test(a)? a.getName()+"\t"+a.getExp_years()+"\n" : "");
		});
	}

}
