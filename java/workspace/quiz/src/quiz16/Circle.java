package quiz16;

public class Circle extends Shape{
	/*
	 * 원은 radius 변수를 가지고
	 * 생성될 때 이름과, 변의 길이를 받아서 생성된다.
	 * 상수 PI를 갖는다.
	 * getArea() 원의 넓이를 계산하도록 처리한다.
	 */
	private int radius;
	public static final double PI = 3.14;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}

}
