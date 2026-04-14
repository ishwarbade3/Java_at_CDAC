package string_demo;

public class String_Builder {
	public static void main(String[] args) {
		StringBuilder sbi = new StringBuilder();
		System.out.println(sbi.capacity());
		System.out.println(sbi.length());
		sbi.append("Ishwar");
		System.out.println(sbi);
		System.out.println(sbi.capacity());
		System.out.println(sbi.length());
		System.out.println(sbi.reverse());
		System.out.println(sbi.reverse());
		sbi.append(" What Are  ");
		System.out.println(sbi);
		System.out.println(sbi.capacity());
		System.out.println(sbi.length());
		sbi.append("is everything fine");
		System.out.println(sbi);
		System.out.println(sbi.capacity());
		System.out.println(sbi.length());
		sbi.replace(sbi.lastIndexOf("f"), sbi.length(), " or Else Enythng ");
		System.out.println(sbi);
	}

}
