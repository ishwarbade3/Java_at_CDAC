import java.util.List;
import java.util.function.Consumer;

public class Trainer_Main {
	public static void main(String[] args) {

		List<Trainer> l = Trainer_Details.addData();

		Consumer<Trainer> c1 = a -> {
			System.out.println(a);
		};
		l.forEach(c1);
		
		
		Consumer<Trainer> c2 =  x ->{
			System.out.print(x.getName()+"  ");
		};
		l.forEach(c2);
		System.out.println();
		Consumer<Trainer> c3 = x ->{
			System.out.println(x.getGender());
		};
		l.forEach(c2.andThen(c3));
		System.out.println("Trainer Who are TAking Online and experiance is greater than 15 !!");
		
		l.forEach( a ->{
			if(a.isOnline() && a.getExp_years() > 15) {
				c1.accept(a);
			}
		});
	}     
}


