package cdac_dsa01;

import java.util.Scanner;

public class CharStack_Main {
	 public static void main(String[] args) {
		 Scanner kbd = new Scanner(System.in);
		CharStack st = new CharStack();
		int ch ;
		do {
			System.out.println("=========Stack Menu=========\n1. Push Element\n2. Pop Element\n3. Peek Element \n4. Stack is Empty\n5. Stack is Full\n6. Exit !!!");
			System.out.print("Enter Your Choice  :");
			ch = kbd.nextInt();
			
			switch(ch) {
			case 1: System.out.print("Enter the element to push : ");
			char num = kbd.next().charAt(0);
			st.push(num);
			break;
			case 2 : char resultpop  = st.pop();
			if(resultpop!='*') {
				System.out.println(resultpop+" -> Element pop sucessfully !!!");
			}
			else {
				System.out.println(" Stack is Already Empty!!!!!");
			}
			break;
			case 3 :
				char resultpeek  = st.peek();
				if(resultpeek!='*') {
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
