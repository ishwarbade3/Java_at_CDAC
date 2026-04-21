package synchronization_demo;

public class Thread2 extends Thread {
	Account a;
	public Thread2(Account a) {
		this.a=a;
	}
	public void run() {
		try {
			a.deposit(2000);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
