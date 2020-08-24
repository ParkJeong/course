package chapter05;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + result + "입니다.");
		result = sub(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다.");
		result = mul(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + result + "입니다.");
		result = div(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + result + "입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
