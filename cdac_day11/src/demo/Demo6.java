package demo;
import java.util.*;
import java.util.function.Predicate;

public class Demo6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,27,37,18,63,67,43,47,97,56);
		Predicate<Integer> p = (x)-> x%2==0;
		
		list.forEach((x)->{
			System.out.print(x+"\t");
		});
		System.out.println();
		list.forEach((x)->{
			if(p.test(x)) {
				System.out.print((x*2)+"\t");
			}
			else {
				System.out.print(x+"\t");
			}
		});
		System.out.println("\n====================");
		int sum=0;
		int i = list.stream().filter(x -> x%2==0).map(x -> x*2).reduce(0,Integer::sum);
		System.out.println(i);
		list.forEach((x)->{
			System.out.print(x+"\t");
		});
	}

}
