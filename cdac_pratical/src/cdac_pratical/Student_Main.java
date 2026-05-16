package cdac_pratical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student_Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		list.add(new Student(101, "Ashish", 76.7f));
		list.add(new Student(151, "Sai", 92.5f));
		list.add(new Student(146, "Aaman", 86.3f));
		list.add(new Student(113, "Sidd", 72.25f));
		list.add(new Student(122, "Puma", 70.25f));
		list.add(new Student(133, "Virat", 75.5f));

		// System.out.println(list);
		System.err.println("\nStudenet Printing Using For Each : -> ");
		list.forEach((x) -> System.out.println(x));

		Student minStudent = list.stream().min(Comparator.comparingDouble(Student::getMarks)).orElse(null);
		System.err.println("\nStudenet Printing having Less Marks : -> ");
		System.out.println(minStudent);

		Student maxStudent = list.stream().max(Comparator.comparingDouble(Student::getMarks)).orElse(null);
		System.err.println("\nStudenet Printing having max Marks : -> ");
		System.out.println(maxStudent);

		System.err.println("\nStudenet Printing Descending order on marks : -> ");
		list.stream().sorted(Comparator.comparingDouble(Student::getMarks).reversed()).forEach(System.out::println);

		String name = list.stream().map(Student::getName).collect(Collectors.joining(" , "));

		System.out.println(name);

		double avg = list.stream().mapToDouble(Student::getMarks).average().orElse(0.0);
		System.out.println("Avg : " + avg);

		double sum = list.stream().mapToDouble(Student::getMarks).sum();
		System.out.println("Sum : " + sum);

		System.out.println("-------------------------------------------------------------------");
		list.stream().sorted(Comparator.comparing(Student::getRollNo)).forEach(System.out::println);

		System.out.println("-------------------------------------------------------------------");
		list.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

		
		Map<String, List<Student>> grades = list.stream()
		        .collect(Collectors.groupingBy(s -> {
		            if (s.getMarks() >= 80) return "A";
		            else if (s.getMarks() >= 60) return "B";
		            else return "C";
		        }));

		System.out.println(grades);
		
		Map<Integer, String> studentMap = list.stream()
		        .collect(Collectors.toMap(
		                Student::getRollNo,
		                Student::getName
		        ));

		System.out.println(studentMap);
	}

}
