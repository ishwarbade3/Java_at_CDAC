
public class Employee_Stack {
	private Employee[] emp;
	private int top;

	public Employee_Stack() {
		emp = new Employee[5];
		top = -1;
	}

	public Employee_Stack(int size) {
		emp = new Employee[size];
		top = -1;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == emp.length - 1)
			return true;
		else
			return false;
	}

	public void push(Employee e) {
		if (!isFull()) {
			emp[++top] = e;
			return;
		}
		System.out.println("Employee Stack is Full;");
	}

	public Employee pop() {
		if (!isEmpty()) {
			return emp[top--];
		}
		return null;
	}

	public Employee peek() {
		if (!isEmpty()) {
			return emp[top];
		}
		return null;
	}

}
