package cdac_dsa01;

public class IntStack {
	private int arr[];
	private int top;
	public IntStack() {
		arr = new int[5];
		top=-1;
	}
	public IntStack(int size) {
		arr = new int[size];
		top=-1;
	}
	
	public boolean isEmpty() {
		if(top ==-1) 
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(top== arr.length-1)
			return true;
		else 
			return false;
	}
	public void push(int element) {
		if(!isFull()) {
			arr[++top]=element;
			return;
		}
		System.err.println("Stack is Full!!!!");
	}
	public int pop() {
		if(!isEmpty()) {
			return arr[top--];
		}
		else
			return -999;
	}
	public int peek() {
		if(!isEmpty())
			return arr[top];
		else
			return-999;
	}
}
