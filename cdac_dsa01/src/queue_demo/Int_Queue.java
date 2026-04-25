package queue_demo;

class Int_Queue {
	private int arr[];
	private int front, rear;

	public Int_Queue() {
		arr = new int[10];
		rear = front = -1;
	}

	public Int_Queue(int s) {
		arr = new int[s];
		rear = front = -1;
	}

	public boolean isFull() {
		if (rear == arr.length - 1)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	public void insert(int d) {
		if (!isFull()) {
			if (front == -1 && rear == -1) {
				front++;
				arr[++rear] = d;
			} else
				arr[++rear] = d;
		}
		else
		System.out.println("Queue is full!!!!!");
	}

	public int remove() {
		if (!isEmpty())
			return arr[front++];
		else
			return -999;
	}
	public int front() {
		if (!isEmpty())
			return arr[front];
		else
			return -999;
	}
}
