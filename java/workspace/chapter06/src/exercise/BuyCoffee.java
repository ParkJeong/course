package exercise;

public class BuyCoffee {
	public static void main(String[] args) {
		Person kim = new Person("Kim");
		BeanCoffee beanCoffee = new BeanCoffee();
		StarCoffee starCoffee = new StarCoffee();
		
		kim.showInfo();
		
		kim.buyBeanCoffee(beanCoffee);
		kim.showInfo();
		
		kim.buyStarCoffee(starCoffee);
		kim.showInfo();
	}
	
}
