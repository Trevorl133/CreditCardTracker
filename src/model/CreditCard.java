package model;

/**
 * @author Trevor Long - tlong5
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class CreditCard {
	
	double balance = 0;

	/**
	 * default no-arg constructor
	 */
	public CreditCard() {
	}

	/**
	 * @param balance
	 */
	public CreditCard(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void purchase(double purchaseAmount) {
		balance += purchaseAmount;
	}

	public void payment(double paymentAmount) {
		balance -= paymentAmount;
	}
	
	public double balance() {
		return balance;
	}
	
	public double chargeInterest(double balance) {
		double interestRate = .155;
		double interest = 0;
		
		interest = balance * interestRate;
		
		return interest;
	}
}
