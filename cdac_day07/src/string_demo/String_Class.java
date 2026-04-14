package string_demo;

public class String_Class {
	public static void main(String[] args) {
		String s1 = "Hi";
		System.out.println(s1);
		s1.concat(" Ishwar");
		System.out.println(s1);
		// s1=s1.concat(" Ishwar");

		String s2 = new String("Hello");
		System.out.println(s2);
		s2 = s2.concat(" Ishwar");
		System.out.println(s1);

		String s3 = "hi";
		String s4 = "    Hi    ";
		String s5 = "Hi";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s4 == s5);

		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s5));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.charAt(0));
		System.out.println(s1.startsWith(s5));
		System.out.println(s2.endsWith("r"));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s3));

		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.length());
		System.out.println(s2.lastIndexOf("I"));
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
		

		System.out.println(s2.substring(s2.lastIndexOf("I"), s2.length()));
		
		
		char ch [] = s2.toCharArray();
		for(char i: ch) {
			System.out.print(i);
		}
		
		System.out.println();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		

	}

}
