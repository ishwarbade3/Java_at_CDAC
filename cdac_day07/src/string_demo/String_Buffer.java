package string_demo;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("");
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		sbf.append("Ishwar");
		System.out.println(sbf);
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		System.out.println(sbf.reverse());
		System.out.println(sbf.reverse());
		sbf.append(" What Are  ");
		System.out.println(sbf);
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		sbf.append("is everything fine");
		System.out.println(sbf);
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		sbf.replace(sbf.lastIndexOf("f"), sbf.length(), " or Else Enythng ");
		System.out.println(sbf);
	}

}
