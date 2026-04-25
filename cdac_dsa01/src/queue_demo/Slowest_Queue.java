package queue_demo;

public class Slowest_Queue {
	private int arr[];
	private int front, rear;

	public Slowest_Queue() {
		arr = new int[10];
		rear = front = -1;
	}

	public Slowest_Queue(int s) {
		arr = new int[s];
		rear = front = -1;
	}

	public boolean isFull() {
		return front == 0 && rear == arr.length - 1;
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public void insert(int d) {
		if (isFull()) {
			System.out.println("Queue is Full!!!");
		} else if (isEmpty()) {
			rear = front = 0;
			arr[rear] = d;
		} else {
			arr[++rear] = d;
		}
	}

	public int front() {
		if (!isEmpty()) {
			return arr[front];
		} else {
			return -999;
		}
	}

	public int remove() {
		if (isEmpty()) {
			return -999;

		} else if (rear == front) {
			int temp = arr[front];
			rear = front = -1;
			return temp;

		} else {
			int temp = arr[front];
			for (int i = front; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return temp;
		}
	}
}
