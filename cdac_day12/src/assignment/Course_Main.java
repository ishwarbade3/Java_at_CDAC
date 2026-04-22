package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Course_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Map<Course, List<String>> courseMap = new HashMap<>();
		Map<Course, Queue<String>> waitingMap = new HashMap<>();
		int choice;

		do {
			System.out.println("\n===== Regestration ===== \n\n1. Add Course\n2. Register Student\n3. Display All Courses\n4. Course With Highest Registration\n5. Exit");
			
			System.out.print("Enter Choice: ");
			choice = kbd.nextInt();
			kbd.nextLine();

			 switch (choice) {

	            case 1:

	                System.out.print("Enter Course Code: ");
	                String code = kbd.nextLine();

	                System.out.print("Enter Course Name: ");
	                String name = kbd.nextLine();

	                System.out.print("Enter Max Seats: ");
	                int seats = kbd.nextInt();
	                kbd.nextLine();

	                Course c = new Course(code, name, seats);

	                courseMap.put(c, new ArrayList<>());
	                waitingMap.put(c, new LinkedList<>());

	                System.out.println("Course Added Successfully!");
	                break;

	            case 2:

	                if (courseMap.isEmpty()) {
	                    System.out.println("No Courses Available!");
	                    break;
	                }

	                System.out.println("Available Courses:");
	                for (Course course : courseMap.keySet()) {
	                    System.out.println(course.getCourseCode() + " - " + course.getCourseName());
	                }

	                System.out.print("Enter Course Code: ");
	                String searchCode = kbd.nextLine();

	                Course selectedCourse = null;

	                for (Course course : courseMap.keySet()) {
	                    if (course.getCourseCode().equalsIgnoreCase(searchCode)) {
	                        selectedCourse = course;
	                        break;
	                    }
	                }

	                if (selectedCourse == null) {
	                    System.out.println("Course Not Found!");
	                    break;
	                }

	                System.out.print("Enter Student Name: ");
	                String student = kbd.nextLine();

	                List<String> students = courseMap.get(selectedCourse);

	                if (students.size() < selectedCourse.getMaxSeat()) {
	                    students.add(student);
	                    System.out.println(student + " Registered Successfully!");
	                } else {
	                    waitingMap.get(selectedCourse).add(student);
	                    System.out.println("Course Full! Added to Waiting List.");
	                }

	                break;

	            case 3:

	                for (Course course : courseMap.keySet()) {
	                    System.out.println("\nCourse Details: " + course);

	                    System.out.println("Registered Students:");
	                    List<String> regList = courseMap.get(course);

	                    for (String s : regList) {
	                        System.out.println("- " + s);
	                    }

	                    System.out.println("Waiting List:");
	                    Queue<String> waitList = waitingMap.get(course);

	                    for (String s : waitList) {
	                        System.out.println("- " + s);
	                    }
	                }
	                break;

	            case 4:

	                Course maxCourse = null;
	                int max = 0;

	                for (Course course : courseMap.keySet()) {
	                    int total = courseMap.get(course).size();

	                    if (total > max) {
	                        max = total;
	                        maxCourse = course;
	                    }
	                }

	                if (maxCourse != null) {
	                    System.out.println("Highest Registered Course:");
	                    System.out.println(maxCourse);
	                    System.out.println("Students: " + max);
	                }

	                break;

	            case 5:
	                System.out.println("Exiting...");
	                break;

	            default:
	                System.out.println("Invalid Choice!");
	            }


		} while (choice != 5);

		kbd.close();
	}
}
