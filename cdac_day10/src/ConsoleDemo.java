import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("Enter The UserName :: ");
		String user = c.readLine();
		System.out.println("user : "+user);
		System.out.println("Enter password : ");
		char ch[]= c.readPassword();
		String pass = String.valueOf(ch);
		System.out.println("Password : "+pass);
	}

}
