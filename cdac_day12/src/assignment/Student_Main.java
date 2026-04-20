package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Student_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		ArrayList<Student> stdData = new ArrayList<Student>();
		 for(int i = 0;i<4;i++) {
			 System.out.println("Ehter the "+i+1+" Student Details As Follow !!!");
			 System.out.print("Enter Student Id    : ");
			 int id = kbd.nextInt();
			 System.out.print("Enter Student Name  : ");
			 String name = kbd.next();
			 System.out.print("Enter Student Dept  : ");
			 String dept = kbd.next();
			 System.out.print("Enter Student Marks : ");
			 double marks = kbd.nextDouble();
			 
			 stdData.add(new Student(id,name,dept,marks));
		 }
		 System.out.println("--------------------------------------------");

		 System.out.println(stdData);
		 System.out.println("--------------------------------------------");

		 System.out.println("Student With More than 60% marks!!!!!!");
		
		 stdData.stream().filter(x->x.getMarks()>60).forEach(System.out::println);
		 System.out.println("--------------------------------------------");

		 System.out.println("Sorted List On  marks in ascending order !!!!!");
		 stdData.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);
		 System.out.println("--------------------------------------------");

		 System.out.println("Sorted List On  marks in descending order !!!!!");
		 stdData.stream().sorted( Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
		 
		 System.out.println("--------------------------------------------");
		 Map<String, List<Student>> m = stdData.stream().collect(Collectors.groupingBy(Student::getDept));
		// stdData.stream().collect(Collectors.groupingBy(Student::getDept)).forEach(System.out::println);;
//		 Map<String , List<Student>> m =
		 System.out.println(m);
		 kbd.close();
	}

}
