package assignment;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;

public class Book_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		HashMap<String, Book> book = new HashMap<String, Book>();
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
			
			book.put(genre, new Book(genre,name,aut,cop));			
		}
		//Function<String, >
		
		kbd.close();
	}

}
