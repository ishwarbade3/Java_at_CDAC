
public class YieldDemo implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++) {
			if (i == 2) {
				Thread.yield();
				System.out.println("Yield : " + Thread.currentThread().getName() + "-->>" + i);
			} else {
				System.out.println("Norm  : " + Thread.currentThread().getName() + "-->>" + i);
			}
		}
	}

	public static void main(String[] args) {
	Thread t1 =new Thread(new YieldDemo(),"-t1--");
	Thread t2 =new Thread(new YieldDemo(),"-t2--");
	Thread t3 =new Thread(new YieldDemo(),"-t3--");
	
	t1.start();
	t2.start();
	t3.start();
	}
}
