package synchronization_demo;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Account a = new Account();
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		t1.start();
		t2.start();
		Thread.sleep(6000);
		System.out.println("Balance  : "+a.getBalance());
	}

}
