package testdrivendevelopment;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빨리 달린다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("멀리 멀리 점프 ");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("잘 돈다");
	}
}
