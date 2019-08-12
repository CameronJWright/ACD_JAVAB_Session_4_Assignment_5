package hello.world;

import java.util.Scanner;

class Account {

	private int accNo;
	private String accName;
	private String accBal;

	Account(int accNo, String accName, String accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;

	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBal() {
		return accBal;
	}

	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}

	void display() {
		System.out.println("Account number: " + accNo);
		System.out.println("Account name: " + accName);
		System.out.println("Account balance: " + accBal);
	}

}

class Saving extends Account {

	private double rateOfInt;

	public Saving(int accNo, String acName, String accBal, double rateOfInt) {
		super(accNo, acName, accBal);
		this.rateOfInt = rateOfInt;

	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}

	void display() {
		System.out.println("Account number: " + getAccNo());
		System.out.println("Account name: " + getAccName());
		System.out.println("Account balance: " + getAccBal());
		System.out.println("Account balance: " + rateOfInt);
	}

}

class Current extends Account {

	private double rateOfInt;

	public Current(int accNo, String acName, String accBal, double rateOfInt) {
		super(accNo, acName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}

	void display() {
		System.out.println("Account number: " + getAccNo());
		System.out.println("Account name: " + getAccName());
		System.out.println("Account balance: " + getAccBal());
		System.out.println("Account balance: " + rateOfInt);
	}

}

public class TestAccount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int accNo;
		String accName;
		String accBal;
		double rateOfInt;

		System.out.println("Enter the savings account number: ");
		accNo = scan.nextInt();
		System.out.println("Enter the savings account name: ");
		accName = scan.next();
		System.out.println("Enter the savings account balance: ");
		accBal = scan.next();
		System.out.println("Enter the savings account rate of interest: ");
		rateOfInt = scan.nextDouble();

		Saving saving = new Saving(accNo, accName, accBal, rateOfInt);
		saving.display();

		System.out.println("Enter the current account number: ");
		accNo = scan.nextInt();
		System.out.println("Enter the current account name: ");
		accName = scan.next();
		System.out.println("Enter the current account balance: ");
		accBal = scan.next();
		System.out.println("Enter the current account rate of interest: ");
		rateOfInt = scan.nextDouble();

		Saving current = new Saving(accNo, accName, accBal, rateOfInt);
		current.display();
	}
}