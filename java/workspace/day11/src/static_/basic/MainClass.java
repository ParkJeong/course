package static_.basic;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. ��� �����, ������ ���⸦ ���� ����
		 * 2. pi���� ����ؼ� ���� ���̸� Ȯ��
		 * 3. circle() �� ����ؼ� ���� ���̸� Ȯ��
		 */
		
		Calculator green = new Calculator();
		Calculator red = new Calculator();
		
		green.setColor("green");
		red.setColor("red");

		System.out.println(Calculator.pi * 1 * 1);
		System.out.println(Calculator.circle(1));
		
		
	}
}
