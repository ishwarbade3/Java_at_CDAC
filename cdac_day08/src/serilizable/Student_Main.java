package serilizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student_Main {
	public static void main(String[] args)throws IOException {
		FileOutputStream fout = new FileOutputStream("Test.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		Student s1 = new Student(123,"Ishwar");
		oout.writeObject(s1);
		System.out.println("Sucessfully Done !!!!!");
		fout.close();
		oout.close();
	}

}
