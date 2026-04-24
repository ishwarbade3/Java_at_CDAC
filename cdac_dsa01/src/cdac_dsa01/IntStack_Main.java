package cdac_dsa01;

import java.util.Scanner;

public class IntStack_Main {
	 public static void main(String[] args) {
		 Scanner kbd = new Scanner(System.in);
		IntStack st = new IntStack();
		int ch ;
		do {
			System.out.println("=========Stack Menu=========\n1. Push Element\n2. Pop Element\n3. Peek Element \n4. Stack is Empty\n5. Stack is Full\n6. Exit !!!");
			System.out.print("Enter Your Choice  :");
			ch = kbd.nextInt();
			
			switch(ch) {
			case 1: System.out.print("Enter the element to push : ");
			int num = kbd.nextInt();
			st.push(num);
			break;
			case 2 : int resultpop  = st.pop();
			if(resultpop!=-999) {
				System.out.println(resultpop+" -> Element pop sucessfully !!!");
			}
			else {
				System.out.println(" Stack is Already Empty!!!!!");
			}
			break;
			case 3 :
				int resultpeek  = st.peek();
				if(resultpeek!=-999) {
					System.out.println(resultpeek+" -> is Peak Element !!!");
				}
				else {
					System.out.println(" Stack is Empty!!!!!");
				}
				break;
			case 4 : if( st.isEmpty()) {
				System.out.println("Stack is Empty !");
			}
			else {
				System.out.println("Stack is Not Empty !");
			}
			break;
			case 5 :if( st.isFull()) {
				System.out.println("Stack is Full !");
			}
			else {
				System.out.println("Stack is Not Full !");
			}
			break;
			case 6 : 
			System.out.println("Byeeeee   User!!!!!!!!!!!!");
			break;
			default : 
				System.out.println("Invalid Choice !!!!");
			}
			
		}while (ch!=6);
		kbd.close();
	}
}
