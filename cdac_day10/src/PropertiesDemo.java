import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("C:\\JavaCodes\\cdac_day10\\src\\application.properties");
		Properties p = new Properties();
				p.load(fin);
		System.out.println(p);
		String u = p.getProperty("user");
		System.out.println(u);
		String pass = p.getProperty("password");
		System.out.println(pass);
		
		
	}

}
