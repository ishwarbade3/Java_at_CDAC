package cdac_day10;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(123,"Doremon",2154);
		Employee e2 = new Employee(145,"Aaman",2154);
		Employee e3 = new Employee(245,"arti",2154);
		Employee e4 = new Employee(123,"Ishwar",2154.8);
		Employee e5 = new Employee(123,"Ishwar",2154.8);
		Employee e6 = new Employee(132,"Doremon",2154);
		//Comparator c = Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpId);
		TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		
	 	
		
	}

}
