
public class JoinDemo implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" -->> "+i);
			
			try {
				Thread.sleep(5000);
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinDemo j1 = new JoinDemo();
//		JoinDemo j2 = new JoinDemo();
//		JoinDemo j3 = new JoinDemo();
		Thread t1 = new Thread(j1,"t1");
		Thread t2 = new Thread(j1,"t2");
		Thread t3 = new Thread(j1,"t3");
		t1.start();
		t2.join();
		t2.start();
		t1.join();
		t3.start();
	}

}
