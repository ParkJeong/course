package static_.basic;

public class Calculator {
	/*
	 * 계산기 마다 색깔이나 결과값은 다르기 때문에 일반 멤버 변수가 된다.
	 * 계산기 마다 원주율은 동일하기 때문에 static변수로 선언하는게 좋다.
	 */
	
	String color;
	int result;
	static double pi = 3.14;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	/*
	 * 일반 멤버 변수를 참조하는 메서드는 static 메서드로 선언하면
	 * 안된다.
	 */
	
	public void add(int n) {
		result += n;
	}
	
	/*
	 * 메서드 내부에서 일반 멤버 변수를 쓰지 않고
	 * 범용성 있게 사용하는 메서드는 static 키워드를 사용하는 편이 좋다.
	 */
	
	public static double circle(int r) {
		return r * r * pi;
	}
}
