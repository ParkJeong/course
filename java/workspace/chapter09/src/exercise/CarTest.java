package exercise;

import java.util.ArrayList;

import chapter09.Car;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
	
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car: carList) {
			car.run();
			System.out.println("=======================");
		}
	}
}
