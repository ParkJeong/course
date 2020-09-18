package quiz16;

public class Rect extends Shape{
	/*
	 * 사각형은 side 변수를 가지고,
	 * 생성될 때 이름과, 변의 길이를 받아서 생성된다.
	 * getArea()는 사각형의 넓이를 계산하도록 처리한다.
	 */
	private int side;
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
