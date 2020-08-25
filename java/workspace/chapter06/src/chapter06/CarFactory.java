package chapter06;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private static int carId = 10001;
	
	private CarFactory () {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
}
