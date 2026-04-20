import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,56,84,77,37,26,2,9,5,6);
		
		System.out.println(list.stream().count());
		System.out.println(list.stream().findFirst());
		//System.out.println(list.stream().limit(1));
		
		list.stream().forEach(System.out::println);
		int sum = IntStream.of(5,4,3,2,1).sum();
		System.out.println("Sum : "+sum);
		
		int total = list.stream().filter(x->x%2==0).map(x -> x*=2).reduce(0	,Integer::sum);
		System.out.println("Total : "+total);
		
		System.out.println("Sum ::::  "+IntStream.of(2,3,6,4,5).filter(x->x%2==0).map(x->x*=2).reduce(0, Integer::sum));
		
		list.forEach(System.out::println);
		//list.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		List<Integer> n =list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		List<Integer> m =list.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(n);
		System.out.println(m);
		
		
		
		
	}

}
