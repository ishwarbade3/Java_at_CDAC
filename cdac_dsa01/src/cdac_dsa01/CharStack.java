package cdac_dsa01;

public class CharStack {
	private char[] arr;
	private int top;

	public CharStack() {
		arr = new char[5];
		top = -1;
	}

	public CharStack(int size) {
		arr = new char[size];
		top = -1;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	public void push(char ch) {
		if (!isFull()) {
			arr[++top] = ch;
			//System.out.println("Element Push Sucessfully!!!");
			return;
		}
		//System.out.println("Stack is Already Full!!!");
	}

	public char pop() {
		if (!isEmpty()) {
			return arr[top--];
		}
		return '*';
	}

	public char peek() {
		if (!isEmpty()) {
			return arr[top];
		}
		return '*';
	}

}
