package day20;

public class Accmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account obj = new Account();
		Account obj1 = new Account(50000, 10000);
		System.out.println("Deposit: " + obj1.deposit());
		System.out.println("Withdraw " +obj1.withdraw());
		System.out.println("Final balance " + obj1.balance());
	}

}
