package quiz02;

public class Account {
	String name;
	String password;
	int balance;
	
	Account(String name, String password, int balance){
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withDraw(int money) {
		this.balance -= money;
	}
	
	public int getBalance() {
		return balance;
	}
}
