package quiz;

import java.util.Scanner;

public class MethodQuiz01 {
	public static void main(String[] args) {
		
		print();
		int num1 = input();
		int num2 = input();
		
		int result = add(num1, num2);
		showResult(result);
		
	}
	static void print() {
		System.out.println("정수 두개를 입력하세요");		
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();
		
		return num;
	}
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	static void showResult(int result) {
		System.out.println("결과:" + result);
	}
}
