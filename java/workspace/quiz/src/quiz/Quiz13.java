package quiz;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수1>");
		int num1 = scan.nextInt();

		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String operator = scan.next();

		System.out.print("정수2>");
		int num2 = scan.nextInt();

		switch(operator) {
		case "+":
			System.out.println("두 수의 덧셈은: " + (num1 + num2));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은: " + (num1 - num2));
			break;
		case "*":
			System.out.println("두 수의 곱셈은: " + (num1 * num2));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은: " + (num1 / num2));
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

	}
}
