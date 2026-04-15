package de_serilizable;

import java.io.*;

public class Student_Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException ,ClassCastException{
		
		FileOutputStream fout = new FileOutputStream("Test1.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		Student s1 = new Student(123," Ishwar");
		oout.writeObject(s1);
		System.out.println(s1);
		
		
		FileInputStream  fin =new FileInputStream("Test1.txt");
		ObjectInputStream oin =new  ObjectInputStream(fin);
		Student s = (Student)oin.readObject();
		System.out.println(s);
		
		System.out.println("Sucess!!!!");
		
		fout.close();
		oout.close();
		fin.close();
		oin.close();
	}

}
