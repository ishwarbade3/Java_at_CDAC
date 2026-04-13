package exception_io_files;
//import exception_handling.*;

import java.io.*;

public class Demo1 {
	public static void main(String[] args) throws IOException{
		FileInputStream filinput = null;
		try {
			filinput  = new FileInputStream("test.txt");
			int i=0;
			while((i =filinput.read())!=-1 ) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("\nFinally keyword  ()");
			filinput.close();
		}
	}

}
