package alone;

import chapter09.Car;

public class AutoCar extends Car{
	
	@Override
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}

}
