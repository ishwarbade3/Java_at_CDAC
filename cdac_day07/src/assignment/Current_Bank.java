package assignment;
import java.util.Scanner;

public class Current_Bank extends Bank {

	private long accountNumber;
	private String name;
	private double balance;
	private String branch;

	public Current_Bank() {

	}

	public Current_Bank(long accountNumber, String name, double balance, String branch) {
		super(accountNumber, name,balance,branch);
	}
	
	public void showBalance() {
//		double balance = new Bank().getBalance();
		System.out.println(this.getBalance());
	}
	public void withdrawal(double amt) {
		if((this.getBalance() - 1000 )> amt ) {
			this.setBalance(this.getBalance() - amt);
			System.out.println("Amount Withrawl Sucessfully !!!");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public void deposit(double amt) {
		if(amt > 0) {
		this.setBalance(this.getBalance()+amt);
		System.out.println("Amount Deposit sucessfully!!!");
		}
		else {
			System.out.println("Enter the Valid Amount");
		}
	}
	public void displayDetail() {
		super.displayDetail();
	}
	public void addCustomer() {
		
		super.addCustomer();
		
	}
	

}
