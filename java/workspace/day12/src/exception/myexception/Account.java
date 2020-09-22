package exception.myexception;

public class Account {
	/*
	 * 1. 잔액(balance:long)타입으로 멤버 변수
	 * 2. deposit : 입금 기능
	 * 3. withDraw : 출금기능
	 * 4. getBalance() : 잔액확인기능
	 * 
	 * 단, withDraw() 메서드에서 잔액이 출금보다 작다면 MyException을 발생시키는 코드 작성
	 */
	
	private long balance;
	
	public void deposit(long money) {
		balance += money;
	}
	
	public void withDraw(long money) throws MyException {
		if(balance < money) {
			throw new MyException("잔액이 부족합니다.");
		}
		balance -= money;
		System.out.println("출금 했습니다.");
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
