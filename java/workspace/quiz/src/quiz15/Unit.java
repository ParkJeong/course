package quiz15;

public class Unit {
	int x = 0;
	int y = 0;
	int hp;
	
	void location() {
		System.out.println("x: " + x + ", y: " + y);
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void stop() {}
}
