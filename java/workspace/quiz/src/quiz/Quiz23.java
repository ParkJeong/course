package quiz;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		/*
		 * 두 정수를 입력받습니다.
		 * 단 두 수의 크기는 정해지지 않았습니다.
		 * 두 수 사이의 합을 구하는 코드를 최대한 간략하게
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요>");
		int num1 = scan.nextInt();
		System.out.println("정수를 입력해주세요>");
		int num2 = scan.nextInt();
		
		int sum = 0;
		for(int i = num1 == num2 ? 0 : (num1 <= num2 ? num1: num2); i<= (num1 == num2 ? 0 : (num2 >= num1 ? num2: num1)); i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
