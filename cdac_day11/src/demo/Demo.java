package demo;

import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		String str = "Learning Java Programming Language From Mayuri mam";
		String s[]= str.split("\\s");
		
		for(String ss :s ) {
			System.out.println(ss);
		}
		System.out.println("--------------------------------");
		System.out.println(Pattern.matches(".ava", "Java"));
		System.out.println("--------------------------------");
		System.out.println(Pattern.matches(".war", "Ishwar"));
		System.out.println(Pattern.compile("wa").matcher("Someshwar is ishwar Friend").find());
		
		String str1 = "10,20,30,40,50,60";
		String num[]= str1.split(",");
		for(String n :num ) {
			System.out.println(n);
		}
		
	}

}
