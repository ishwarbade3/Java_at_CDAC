package exception_io_files;

import java.io.IOException;

public class Test  {
	public static void main(String[] args) throws IOException{
		System.out.print("Enter NO : ");
		int i = System.in.read();
		System.out.println("i : "+i);
		System.out.println("Type Cast to Character : "+((char)i));
		System.out.print("Hello ");
		System.err.println("Ishwar");
	}
}
