package assignment;

import java.util.Scanner;

public class Bank_Main {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Bank cust[] = new Bank[5];
		
		for(int i = 0 ;i<5 ;i++) {
			System.out.println("Enter which Customer you want Add :  \n 1. Current Account Holder \n 2. Saving Account Holder  \n : ");
			int choice = kbd.nextInt();
			
			if (choice == 1) {
				Bank bk = new Current_Bank();
				bk.addCustomer();
				cust[i] = bk;
			}
			else if (choice == 2) {
				Bank bk = new Saving_Bank();
				bk.addCustomer();
				cust[i] = bk;
			}
			else {
				System.out.println("Invalid Choice ");
				i--;
			}
			
		}
		
		System.out.println("Enter the Account No to See Details : ");
		int acc = kbd.nextInt();
		
		for(Bank a : cust) {
			if (a.getAccountNumber()== acc) {
				a.displayDetail();
			}
			else {
				System.out.println("Incorrect Account Number !!!!!!");
			}
		}
		
		System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Balance");
		System.out.print("Enter your choice: ");
		int ch = kbd.nextInt();

		System.out.print("Enter Account Number: ");
		long accNo = kbd.nextLong();

		Bank found = null;

		// search account
		for (Bank b : cust) {
			if (b.getAccountNumber() == accNo) {
				found = b;
				break;
			}
		}

		if (found == null) {
			System.out.println("Account not found!");
		} else {
			switch (ch) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				double dep = kbd.nextDouble();
				if (found instanceof Current_Bank) {
					((Current_Bank) found).deposit(dep);
				} else if (found instanceof Saving_Bank) {
					((Saving_Bank) found).deposit(dep);
				}
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				double wit = kbd.nextDouble();
				if (found instanceof Current_Bank) {
					((Current_Bank) found).withdrawal(wit);
				} else if (found instanceof Saving_Bank) {
					((Saving_Bank) found).withdrawal(wit);
				}
				break;

			case 3:
				if (found instanceof Current_Bank) {
					((Current_Bank) found).showBalance();
				} else if (found instanceof Saving_Bank) {
					((Saving_Bank) found).showBalance();
				}
				break;

			default:
				System.out.println("Invalid Choice!");
			}
		}
		
		
		
	}

}
