package day04;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		// 입력을 10번 받는다. 
		// 입력받은 값들의 합을 구하라.
		int i = 1;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(i <= 10) {
			System.out.print("정수를 입력해주세요>");
			sum += scan.nextInt();
			i++;
		}
		System.out.println("정수의 합계: " + sum);
	}
}
