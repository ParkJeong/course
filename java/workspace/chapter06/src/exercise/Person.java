package exercise;

public class Person {
	int money = 10000;
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void buyStarCoffee(StarCoffee starCoffee) {
		starCoffee.sell(4000);
		this.money -= 4000;
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee) {
		beanCoffee.sell(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(this.name + "의 남은 돈은 " + this.money + "원입니다.");
	}
}
