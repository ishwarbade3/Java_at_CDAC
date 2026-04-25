package queue_demo;

public class Slow_Queue {
	private int arr[];
	private int front, rear;

	public Slow_Queue() {
		arr = new int[10];
		rear = front = -1;
	}

	public Slow_Queue(int s) {
		arr = new int[s];
		rear = front = -1;
	}

	public boolean isFull() {
		return rear == arr.length - 1;
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public void insert(int d) {
		if (isEmpty()) {
			front = rear = 0;
			arr[rear] = d;
			
		} else if (rear == arr.length - 1 && front != 0) {
			int i = 0;
			while (front <= rear) {
				arr[i] = arr[front];
				i++;
				front++;
			}
			front = 0;
			rear = i-1;
			arr[++rear] = d;
		} else if (rear == arr.length - 1) {
			System.out.println("Queue is Full!!!");
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
		if (front == arr.length - 1) {
			int temp = arr[front];
			front = -1;
			return temp;
		} else if (!isEmpty())
			return arr[front++];
		else
			return -999;
	}

}
