
public class ThreadGroupDemo extends Thread {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		System.out.println(Thread.currentThread().getThreadGroup().getClass());
		System.out.println(Thread.currentThread().getThreadGroup().getClass().getPackageName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getClass());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getClass().getPackageName());
		System.out.println("--------------------------------------------");
		ThreadGroup g1 = new ThreadGroup("Parent");
		System.out.println(g1);
		Thread t1 = new Thread(g1, "-t1-");
		Thread t2 = new Thread(g1, "-t2-");
		Thread t3 = new Thread(g1, "-t3-");
		ThreadGroup g2 = new ThreadGroup(g1, "Child");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("1--------------------------------------------");

		System.out.println(g2);
		System.out.println("-2-------------------------------------------");

		System.out.println(g1.getParent().getName());
		g1.list();
		System.out.println("--3------------------------------------------");

		System.out.println(g1.getMaxPriority());
		g1.setMaxPriority(2);
		Thread t4 = new Thread(g1, "-t4-");
		t4.start();
		System.out.println("---4-----------------------------------------");

		System.out.println(g1.getMaxPriority());
		System.out.println(t4.getPriority());
		Thread.currentThread().sleep(10000);
		g1.list();

	}
}
