package static_.basic;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. 녹색 계산기와, 빨간색 계산기를 각각 생성
		 * 2. pi값을 사용해서 원의 넓이를 확인
		 * 3. circle() 를 사용해서 원의 넓이를 확인
		 */
		
		Calculator green = new Calculator();
		Calculator red = new Calculator();
		
		green.setColor("green");
		red.setColor("red");

		System.out.println(Calculator.pi * 1 * 1);
		System.out.println(Calculator.circle(1));
		
		
	}
}
