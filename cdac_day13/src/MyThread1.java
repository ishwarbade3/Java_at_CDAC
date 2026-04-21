
public class MyThread1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" --> "+Thread.currentThread().getState());
	}
	public static void main(String[] args) {
		MyThread1 r1  = new MyThread1();
		Thread t1 = new Thread(r1);
		MyThread1 r2  = new MyThread1();
		Thread t2 = new Thread(r2);
		MyThread1 r3  = new MyThread1();
		Thread t3 = new Thread(r3);
		System.out.println(" t1 : "+t1.getState());
		System.out.println(" t2 : "+t2.getState());
		System.out.println(" t3 : "+t3.getState());
		t1.start();
		t2.start();
		t3.start();
		System.out.println(" t1 : "+t1.getState());
		System.out.println(" t2 : "+t2.getState());
		System.out.println(" t3 : "+t3.getState());
		
		System.out.println(t1.isAlive());

		
	}
}
