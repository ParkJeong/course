package quiz15;

public class Tank extends Unit{
	
	public Tank() {
		super(0, 0, 100);
	}
	
	void changeMode() {
		
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("x: " + this.getX() + ", y: " + this.getY());
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		int distanceX = Math.abs(x - this.getX());
		int distanceY = Math.abs(y - this.getY());
		
		this.setX(x);
		this.setY(y);
		
		System.out.println((int)Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
	}
}
