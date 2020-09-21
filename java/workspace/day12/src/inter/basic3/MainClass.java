package inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		
		Printed p = new LG();
		p.turnOn();
		p.print("가나다");
		p.colorPrint("마바사", "BLACK");
		p.copy(10);
		p.turnOff();
	}
}
