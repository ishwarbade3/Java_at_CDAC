package demo;

import java.io.*;

public class Demo1 {
	File file;

	String path;

	public Demo1() throws IOException {
		file = new File("data.txt");
		if (file.exists()) {
			System.out.println("File Already Exist!!!!!!!!!");
			System.out.println("Absolute Path : "+file.getAbsolutePath());
			System.out.println("Cononical Path: "+file.getCanonicalPath());
			System.out.println(" Only   Path  : "+file.getPath());
		} else {
			System.out.println(file.createNewFile());

		}
		if(file.canRead()) {
			System.out.println("Can Read the File ");
		}
		if(file.canWrite()) {
			System.out.println("Can Write the File ");
		}
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace());
		System.out.println(file.lastModified());
		System.out.println(file.getName());
		System.out.println(file.renameTo(file));
		System.out.println(file.getName());
		//System.out.println(file.delete());
		System.out.println(file.getName());

		

	}

	public static void main(String[] args) throws IOException {
		Demo1 d = new Demo1();
	}

}
