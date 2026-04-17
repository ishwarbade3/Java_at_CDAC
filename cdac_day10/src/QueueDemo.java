import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		//Queue<Integer> q = new Queue<Integer>();  //  Queue is child Interface
		PriorityQueue<Integer> q= new PriorityQueue<Integer>();
		q.add(10); // given in red colour
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q.isEmpty());
		System.err.println(q.peek());
		q.offer(60);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.remove(20));
		System.out.println(q);


	
	}
}
