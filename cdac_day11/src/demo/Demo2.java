package demo;
import java.io.*;

public class Demo2 {
	public static void main(String[] args){
		RandomAccessFile r1 = null;
		RandomAccessFile r2 = null;
		
		try {
			File f1 = new File("test1.txt");
			File f2 = new File("test2.txt");
			if(f1.exists()) {
				System.out.println("Exist--------------");
			}
			else {
				f1.createNewFile();
			}
			if(f2.exists()) {
				System.out.println("Exist--------------");
			}
			else {
				f2.createNewFile();
			}
			
			r1 = new RandomAccessFile(f1, "r");
			r2 = new RandomAccessFile(f2, "rw");
			
			System.out.println(r1.getFilePointer());
			r1.seek(10);
			System.out.println(r1.getFilePointer());
			int x=0;
//			do {
//				x=r1.read();
//				System.out.print((char)x);
//				r2.write(x);
//			}while(x!=-1);
			
			while((x=r1.read())!=-1) {
				System.out.print((char)x);
				r2.write(x);
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Catch Block Called");
		}
		
		
		
		
	}

}
