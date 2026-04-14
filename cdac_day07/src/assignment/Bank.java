package assignment;

import java.util.Scanner;

public class Bank {
	private long accountNumber;
	private String name;
	private double balance;
	private String branch;

	public Bank() {

	}

	public Bank(long accountNumber, String name, double balance, String branch) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String toString() {
		return accountNumber + " " + name + " " + balance + " " + branch;
	}
	public void displayDetail() {
		System.out.println("Account Number      : "+ accountNumber);
		System.out.println("Account Holder Name : "+ name);
		System.out.println("Branch Name         : "+ branch);
	}
	public void addCustomer() {
	Scanner kbd = new Scanner(System.in);
	System.out.print("Enter Bank Account Number : ");
	accountNumber = kbd.nextLong();
	System.out.print("Enter Bank Account Holder Name : ");
	 name = kbd.next();
	System.out.print("Enter Bank Branch Name : ");
	branch = kbd.next();
	System.out.print("Enter the initial Balance : ");
	balance = kbd.nextLong();
	}

}
