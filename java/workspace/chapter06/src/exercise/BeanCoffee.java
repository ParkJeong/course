package exercise;

public class BeanCoffee {
	private int money = 0;
	
	public BeanCoffee() {}
	
	public void sell(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("콩다방의 수익은 " + this.money + "입니다.");
	}
}
