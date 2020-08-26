package chapter06;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = CarFactory.createCar();
		Car yourSonata = CarFactory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}
}
