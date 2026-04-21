package assignment;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Account_Main {

	public static void get(Map<Integer, Account> m) {
		/*
		 * 
		 * TreeSet<Account> order = new TreeSet<Account>((a,b)->{ int x=
		 * Double.compare(a.getBalance(),b.getBalance()); return x; });
		 */

		Collection<Account> s = m.values();
		Comparator<Account> c = Comparator.comparing(Account::getBalance).reversed();
		s.stream().sorted(c).forEach(System.out::println);
	}

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		Map<Integer, Account> details = new HashMap<Integer, Account>();
		LinkedList<String> history = new LinkedList<String>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the " + (i + 1) + "product Details As Follow !!!");
			System.out.print("Enter Account Number  : ");
			int accNo = kbd.nextInt();
			System.out.print("Enter AccHolder Name  : ");
			String name = kbd.next();
			System.out.print("Enter Initial Balance : ");
			double balance = kbd.nextDouble();

			details.put(accNo, new Account(accNo, name, balance));

		}

		Account_Main.get(details);

		boolean con = true;
		while (con) {
			System.out.println("Operations!!!!!! \n1. Deposit Amount \n2. Withdraw Amount \n3. Balance \n4.Exit");
			System.out.println("Enter Choice!!!!!!");
			int choice = kbd.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Acc no : ");
				int acc = kbd.nextInt();
				if (details.containsKey(acc)) {
					System.out.print("Enter the Amount to add : ");
					double bal = kbd.nextDouble();
					if (bal > 0) {
						Account a = details.get(acc);
						a.setBalance(a.getBalance() + bal);
						history.add("Deposit Rs." + bal + " in Acc " + acc);

						if (history.size() > 5)
							history.removeFirst();
					} else {
						System.out.println("Enter the Valid Amount!");
					}
				} else {
					System.out.println("Enter the Valid Acount NO");
				}
				break;

			case 2:
				System.out.print("Enter Acc no : ");
				int accnt = kbd.nextInt();
				if (details.containsKey(accnt)) {
					System.out.print("Enter the Amount to withdraw : ");
					double bal = kbd.nextDouble();
					Account a = details.get(accnt);
					if (bal < a.getBalance()) {
						a.setBalance(a.getBalance() - bal);
						history.add("Withdraw Rs." + bal + " from Acc " + accnt);
						if (history.size() > 5)
							history.removeFirst();
					} else {
						System.out.println("Insufficient Balance !!!!");
					}
				} else {
					System.out.println("Enter the Valid Acount NO");
				}
				break;

			case 3:
				System.out.print("Enter Acc no : ");
				int accn = kbd.nextInt();
				if (details.containsKey(accn)) {
					Account a = details.get(accn);
					System.out.println("Balance : " + a.getBalance());
				} else {
					System.out.println("Enter the Valid Acount NO");
				}
				break;

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Enter Valid Choice!!!");
				break;

			}

		}

		// Account_Main.get(details);
//		System.out.println();
//		TreeSet<Account> order = new TreeSet<Account>((a,b)->{ int x=
//				  Double.compare(a.getBalance(),b.getBalance()); return x; });
//		
//		System.out.println(order);
		TreeSet<Account> order = new TreeSet<>((a, b) -> Double.compare(b.getBalance(), a.getBalance()));

		order.addAll(details.values());

		System.out.println(order);

	}

}

//TreeSet<Account> t =new TreeSet<Account>((a,b)->int x =
// Double.compare(b.ge));
