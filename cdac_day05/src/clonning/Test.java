package clonning;

public class Test  implements Cloneable{
	public static void main(String[] args)throws CloneNotSupportedException  {
		Subject sub = new Subject("Java","C++","WPT");
		Student std = new Student(101,"Ishwar",sub);
		System.out.println(std);
		System.out.println(sub);
		
		Student stdcpy = (Student) std.clone();
		System.out.println(stdcpy);
		
		stdcpy.getSubject().setSub1("HTML");
		stdcpy.setStdName("Ishwar Bade");
		System.out.println(stdcpy);
		System.out.println(std);
		
	}

}
