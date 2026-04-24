import java.util.Scanner;

public class EmpStack_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Employee_Stack emp = new Employee_Stack();
		int ch;
		do {
			System.out.println(
					"=========Stack Menu=========\n1. Push Employee\n2. Pop Employee\n3. Peek Employee \n4. Stack is Empty\n5. Stack is Full\n6. Exit !!!");

			System.out.print("Enter Your Choice  :");
			ch = kbd.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter Employee Id  :");
				int id = kbd.nextInt();
				System.out.print("Enter Employee Name  :");
				String name = kbd.next();
				System.out.print("Enter Employee Designation  :");
				String desig = kbd.next();
				System.out.print("Enter Employee Salary :");
				double sal = kbd.nextDouble();

				Employee e = new Employee(id, name, desig, sal);
				emp.push(e);
				break;

			case 2:
				Employee e1 = emp.pop();
				if (e1 != null) {
					System.out.println(e1);
					System.out.println("Employee Poped Sucessfully!!!!");
				} else {
					System.out.println("Employee Stack IS Empty!!!");
				}
				break;
			case 3:
				Employee e2 = emp.peek();
				if (e2 != null) {
					System.out.println(e2);
					System.out.println("Employee Info Fetch Sucessfully!!!!");
				} else {
					System.out.println("Employee Stack IS Empty!!!");
				}
				break;

			case 4:
				if (emp.isEmpty()) {
					System.out.println("Stack is Empty !");
				} else {
					System.out.println("Stack is Not Empty !");
				}
				break;
			case 5:
				if (emp.isFull()) {
					System.out.println("Stack is Full !");
				} else {
					System.out.println("Stack is Not Full !");
				}
				break;
			case 6:
				System.out.println("Byeeeee   User!!!!!!!!!!!!");
				break;
			default:
				System.out.println("Invalid Choice !!!!");

			}
		} while (ch != 6);
		kbd.close();
	}

}
