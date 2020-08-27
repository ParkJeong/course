package exercise;

public abstract class Car {
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void drive();
	public abstract void stop();
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
}
