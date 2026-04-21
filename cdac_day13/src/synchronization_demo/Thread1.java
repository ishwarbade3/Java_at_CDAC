package synchronization_demo;

public class Thread1 extends Thread {
	Account a;
	public Thread1(Account a) {
		this.a=a;
	}
	public void run() {
		try {
			a.deposit(5000);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
