package quiz15;

public class Marine extends Unit{
	static int attack;
	static int armor;
	
	static {
		attack = 0;
		armor = 0;
	}
	
	public Marine() {
		super(0, 0, 60);
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("x: " + this.getX() + ", y: " + this.getY());
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		int distanceX = x - this.getX();
		int distanceY = y - this.getY();
//		int distanceX = Math.abs(x - this.getX());
//		int distanceY = Math.abs(y - this.getY());
		
		this.setX(x);
		this.setY(y);
		
		
		
		System.out.println("이동거리: " + (int)Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
	}
}
