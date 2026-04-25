package queue_demo;

import java.util.Scanner;
public class Int_Queue_Main {
	 public static void main(String[] args) {
		 Scanner kbd = new Scanner(System.in);
		//Int_Queue  st = new Int_Queue();
		 //Circular_Queue st = new Circular_Queue(4);
		 //Slowest_Queue st = new Slowest_Queue(4);
		 Slow_Queue st = new Slow_Queue(4);
		int ch ;
		do {
			System.out.println("=========Queue Menu=========\n1. Insert Element\n2. Delete Element\n3. Front Element \n4. Queue is Empty\n5. Queue is Full\n6. Exit !!!");
			System.out.print("Enter Your Choice  :");
			ch = kbd.nextInt();
			
			switch(ch) {
			case 1: System.out.print("Enter the element to push : ");
			int num = kbd.nextInt();
			st.insert(num);
			break;
			case 2 : int resultpop  = st.remove();
			if(resultpop!=-999) {
				System.out.println(resultpop+" -> Element deleted sucessfully !!!");
			}
			else {
				System.out.println(" Queue is Already Empty!!!!!");
			}
			break;
			case 3 :
				int resultpeek  = st.front();
				if(resultpeek!=-999) {
					System.out.println(resultpeek+" -> is front Element !!!");
				}
				else {
					System.out.println(" Queue is Empty!!!!!");
				}
				break;
			case 4 : if( st.isEmpty()) {
				System.out.println("Queue is Empty !");
			}
			else {
				System.out.println("Queue is Not Empty !");
			}
			break;
			case 5 :if( st.isFull()) {
				System.out.println("Queue is Full !");
			}
			else {
				System.out.println("Queue is Not Full !");
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

