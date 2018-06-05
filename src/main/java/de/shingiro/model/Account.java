package de.shingiro.model;

/**
 * Account class
 * 
 * @author a.shingiro
 *
 */
public class Account {
	
	private Integer balance;
	
	public Account() {
		
	}
	
	public Account(Integer balance) {
		super();
		this.balance = balance;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	
}
