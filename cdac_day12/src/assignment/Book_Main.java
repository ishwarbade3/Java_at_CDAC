package assignment;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Function;

import javax.management.Query;

public class Book_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		HashMap<String, Book> book = new HashMap<String, Book>();
		HashMap<String, Queue<String>> waiting = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Ehter the " + i + 1 + " Book Details As Follow !!!");
			System.out.print("Enter Book genre  : ");
			String genre = kbd.next();
			System.out.print("Enter Book Title  : ");
			String name = kbd.next();
			System.out.print("Enter Book Auther : ");
			String aut = kbd.next();
			System.out.print("Enter Book Copies : ");
			int cop = kbd.nextInt();

			book.put(genre, new Book(genre, name, aut, cop));
			waiting.put(genre, new LinkedList<>());
		}

		int ch;
		do {
			System.out.println(
					"*****Book Store***\n1. Search Book on Genre\n2. Buy Book \n3. Display books in Sorted Order \n4. Waiting List\n5. Exit");
			System.out.println("Enter your choice : ");
			ch = kbd.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Genre to Search");
				String search = kbd.next();
				if (book.containsKey(search)) {
					System.out.println(book.get(search));
				} else {
					System.out.println("Book Not Found in The List");
				}
				break;
			case 2:
				System.out.println("Enter the Genre to buy book ");
				String buy = kbd.next();
				if (book.containsKey(buy)) {
					Book b = book.get(buy);
					if (b.getCopies() > 0) {
						b.setCopies(b.getCopies() - 1);
						System.out.println("Your Buying is Completed Sucessfully");
					} else {
						System.out.println("No copies avilable ");
						System.out.print("Enter your Name for waiting list : ");
						String name = kbd.next();
						waiting.get(buy).offer(name);
					}
				} else {
					System.out.println("Book Not Avilable!!!!!");
				}

				break;

			case 3:
				TreeSet<Book> sorted = new TreeSet<Book>(Comparator.comparing(Book::getTitle));
				sorted.addAll(book.values());
				System.out.println("Sorted list Becomes !!!! As Follow");
				for (Book b : sorted) {
					System.out.println(b);
				}
				break;
			case 4:
				for (Map.Entry<String, Queue<String>> e : waiting.entrySet()) {
					System.out.println("Genre : " + e.getKey());
					System.out.println("Waiting User : " + e.getValue());
				}
				break;
			case 5:
				System.out.println("Bye Bye User!!!!!!!!!!!!!!");
				break;
			default:
				System.out.println("Enter the Valid Choice!!!!!!");
				break;
			}

		} while (ch != 5);

		kbd.close();
	}

}
