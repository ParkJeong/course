package chapter06;

public class Taxi {
	int taxiNumber;
	int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(this.taxiNumber + "의 수입은" + this.money + "입니다.");
	}
}
