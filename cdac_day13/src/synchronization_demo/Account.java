package synchronization_demo;

public class Account {
	private int balance;
	
	public Account() {
		this.balance=5000;
	}
	@SuppressWarnings("static-access")
	public synchronized void deposit(int amount)throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"-->> Started");
		
		int temp = balance;
		temp += amount;
		System.out.println("Temp Bal.. : "+temp);
		Thread.currentThread().sleep(2000);
		balance = temp;
		System.out.println(Thread.currentThread().getName()+" Completed   "+balance);
	}
	public int getBalance() {
		return balance;
	}

}
