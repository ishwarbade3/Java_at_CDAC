package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Ehter the " + i + 1 + " Employee Details As Follow !!!");
			System.out.print("Enter Employee Id    : ");
			int id = kbd.nextInt();
			System.out.print("Enter Employee Name  : ");
			String name = kbd.next();
			System.out.print("Enter Employee Designation  : ");
			String desig = kbd.next();
			System.out.print("Enter Employee Salary : ");
			double sal = kbd.nextDouble();

			empList.add(new Employee(id, name, desig, sal));
		}
		System.out.println("------------------------------------");
		empList.stream().forEach(System.out::println);
		System.out.println("------------------------------------");

		empList.stream().filter(x -> x.getSalary() > 50000).forEach(System.out::println);
		System.out.println("------------------------------------");

		empList.stream().sorted(Comparator.comparing(Employee::getDesignation)).forEach(System.out::println);
		System.out.println("------------------------------------");
		empList.stream().sorted(Comparator.comparing(Employee::getDesignation).reversed()).forEach(System.out::println);
		System.out.println("------------------------------------");

		// Map<String,Double> m =
		// empList.stream().collect(Collectors.groupingBy(Employee::getDesignation
		// ,Collectors.summingInt(Employee::getSalary)));

		Map<String, Double> m = empList.stream().collect(
				Collectors.groupingBy(Employee::getDesignation, Collectors.summingDouble(Employee::getSalary)));

		m.forEach((a, b) -> {
			System.out.println(a + " " + b);
		});
		kbd.close();
	}

}
