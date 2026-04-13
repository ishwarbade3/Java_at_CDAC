package exception_io_files;

import java.io.*;
public class Demo {
	public static void main(String[] args) throws IOException {
		//FileOutputStream filoutput = new FileOutputStream("test.txt");
		FileOutputStream filoutput = new FileOutputStream("test.txt",true);
		//filoutput.write(65);
		
		String str =" Hi \n Mayuri Mam How are You ?....";
		byte b[]=str.getBytes();
		filoutput.write(b);
		
		
		
		
		
		
		filoutput.close();	
	}
}
