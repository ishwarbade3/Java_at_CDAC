import java.util.*;
import java.util.function.*;

public class BiConsumerDemo {
	public static void main(String[] args) {
		List<Trainer> l = TrainerDetails.addData();
		BiConsumer<String, Integer> b = (x,y)-> System.out.println(x+"\t"+y+" : "/*+(x+y)*/);
		
		b.accept("Saisagar ", 10);
		System.out.println("-----------------------------------------------------------------------");
		
		l.forEach((x)->{
			b.accept(x.getName(), x.getAge());
		});
		
		Predicate<Trainer> p = (x)->x.isOnline();
		
		BiConsumer<String,List<String>> b1 = (x,y)->System.out.println(x+"\t"+y);
		l.forEach((x)->{
			if(p.test(x)) {
				b1.accept(x.getName(), x.getTech_lang());
			}
		});
		
		
	}

}
