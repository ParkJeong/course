package exercise;

public class Grandeur extends Car{
	private String name = "Grandeur";
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 끕니다");
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " 달립니다");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name + " 멈춥니다");
		
	}
}
