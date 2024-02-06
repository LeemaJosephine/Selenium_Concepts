package day20;

public class Account {

	public int balance;
	public int amount;
	
	public Account() {
		
		System.out.println(balance);
	}
	
	public Account(int balance, int amount) {
		
		this.balance=balance;
		this.amount=amount;
		
		
	}
	
	public int deposit() {
		balance = balance + amount;
		return balance;
		
	}
	
	public int withdraw() {
		balance = balance - amount;
		return balance;
		
	}
	
	public int balance() {
		return balance;
		
	}
}
