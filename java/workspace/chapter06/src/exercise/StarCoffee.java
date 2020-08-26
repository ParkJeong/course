package exercise;

public class StarCoffee {
	private int money = 0;
	
	public void sell(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("별다방의 수익은 " + this.money + "");
	}
}
