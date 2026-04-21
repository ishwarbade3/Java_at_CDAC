
public class Thread2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+" --> "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();
		Thread2 t3 = new Thread2();
		t2.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(7);
		t1.setPriority(1);
		
//		t1.start();
//		t2.start();
//		t3.start();
	}

}
