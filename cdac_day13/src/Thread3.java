import java.util.stream.IntStream;

public class Thread3 {
	@SuppressWarnings({ "static-access" })
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable() {
			
			public void run() {
				int sum = IntStream.range(1, 11).sum();
				System.out.println(sum);
			}
		};

		Thread.currentThread().sleep(5000);
		Runnable r1 = () -> {
			int sum = IntStream.range(1, 10).sum();
			System.out.println("Sum : " + sum);
		};
		//Thread.currentThread().sleep(5000);

		new Thread(r1).start();
		Thread.currentThread().sleep(5000);
		new Thread(r).start();
		
		Thread.currentThread().sleep(5000);

		new Thread(() -> {
			int sum = IntStream.range(1, 10).sum();
			System.out.println(sum);
		}).start();

	}

}
