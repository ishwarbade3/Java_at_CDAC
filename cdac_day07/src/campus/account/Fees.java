package campus.account;

import java.time.LocalDate;

import campus.acadamics.Student;

public class Fees {

	private Student student;
	private double ammount;
	private static double totalFees;
	private LocalDate paymentDate;

	public Fees() {
	}

	public Fees(Student student, double ammount, LocalDate paymentDate) {
		super();
		totalFees += ammount;
		this.student = student;
		this.ammount = ammount;
		this.paymentDate = paymentDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public static double getTotalFees() {
		return totalFees;
	}

	public static void setTotalFees(double totalFees) {
		Fees.totalFees = totalFees;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return"  Fees --> "+ ammount+"  "+paymentDate;
	}

}
