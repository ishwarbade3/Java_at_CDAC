
public class MyThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "-->  Started");
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();

	}
}
