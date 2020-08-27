package exercise;

public class Sonata extends Car{
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 끕니다");
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 달립니다");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 멈춥니다");
		
	}

}
