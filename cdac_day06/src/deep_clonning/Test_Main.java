package deep_clonning;

public class Test_Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Subject sub = new Subject("java", "C++", "Html");

		Student std = new Student(123, "Ashish", sub);

		Student stdcpy = (Student) std.clone();
		System.out.println(std);
		System.out.println(stdcpy);

		stdcpy.getSubject().setSub3("C lang");
		System.out.println("After change in stdCpy :!!!!");
		System.out.println(std);
		System.out.println(stdcpy);

	}

}
