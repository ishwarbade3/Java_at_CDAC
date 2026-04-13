package exception_handling;

public class Demo1 {
	public static void main(String[] args) {
		int a,b,c=0;
		try {
			a= Integer.parseInt(args[0]);
			b= Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("C = "+c);
		}catch (Exception e) {
			
			System.out.println("Exception to string output : "+e);
			System.out.println("get Message ooutput : "+e.getMessage());
			System.out.println("print StackTrace output : ");
			e.printStackTrace();
		}
	}
	
	
	
	

}
