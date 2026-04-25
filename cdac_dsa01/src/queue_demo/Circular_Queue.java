package queue_demo;

public class Circular_Queue {
	private int arr[];
	private int front, rear;

	public Circular_Queue() {
		arr = new int[10];
		rear = front = -1;
	}

	public Circular_Queue(int s) {
		arr = new int[s];
		rear = front = -1;
	}

	public boolean isEmpty() {
		if (rear == -1 && front == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (front == 0 && rear == arr.length - 1 || rear == front - 1)
			return true;
		else
			return false;
	}

	public void insert(int d) {
		if (isFull()) {
			System.out.println("Queue is full!!!");
			return;
		}
		if (isEmpty()) {
			front = rear = 0;
			arr[rear] = d;
		} else if (rear == arr.length) {
			rear = 0;
			arr[rear] = d;
		} else {
			arr[++rear] = d;
		}
	}

	public int remove() {
		if (!isEmpty()) {
			int temp = arr[front];
			if (front == rear) {
				front = rear = -1;
			} else if (front == arr.length - 1) {
				front = 0;
			} else {
				return arr[front++];
			}
			return temp;
		} else
			return -999;

	}

	public int front() {
		if (!isEmpty())
			return arr[front];
		else
			return -999;
	}
}
