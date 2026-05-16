package cdac_pratical;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee_Main {
	public static void main(String[] args) {
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(1011, new Employee(1011,"Sai","IT",53000.49f));
		emp.put(2351, new Employee(2351,"Sidd","Comp",51200.55f));
		emp.put(1121, new Employee(1121,"Omkar","IT",86500.83f));
		emp.put(2011, new Employee(2011,"Abhi","Comp",36360.25f));
		emp.put(1111, new Employee(1111,"Aaman","HR",62346.63f));
		emp.put(1112, new Employee(1112,"Virat","Comp",26236.71f));
		
		emp.values().stream().forEach(System.out::println);
		
		emp.keySet().stream().forEach(System.out::println);
		
		System.err.println("\nSorted Order on Emp Salary!!!!");
		emp.values().stream().sorted(Comparator.comparingDouble(Employee::getEmpSal)).forEach(System.out::println);
				
		
		System.err.println("\nSorted Order on EmpID!!!!");
		emp.values().stream().sorted(Comparator.comparingDouble(Employee::getEmpId)).forEach(System.out::println);
		
		System.err.println("\nSorted Order on EmpID!!!!");
		emp.values().stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).forEach(System.out::println);
		
		Employee minSal =emp.values().stream().min(Comparator.comparingDouble(Employee::getEmpSal)).orElse(null);
		System.out.println("\nEmployee with minimum Salary : "+minSal);
		
		
		Map<String,List<Employee>> gpEmp = emp.values().stream().collect(Collectors.groupingBy(Employee::getEmpDesig));
		gpEmp.forEach((desig,employees)->System.out.println(desig + " -> "+employees));
		
		Map<String,Double> totalSal = emp.values().stream().collect(Collectors.groupingBy(Employee::getEmpDesig,Collectors.summingDouble(Employee::getEmpSal)));
				totalSal.forEach((dp,sum)->System.out.println(dp +" -> "+sum));
				System.out.println(totalSal);
				
				Map<String,Long> empCount = emp.values().stream().collect(Collectors.groupingBy(Employee::getEmpDesig,Collectors.counting()));
				
				System.out.println("Emp count Dep Wise : " +empCount);
	}

}
