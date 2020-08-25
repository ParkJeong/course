package quiz;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		int sum = 0;
		while(num != 0) {
			System.out.print("정수입력>");
			num = scan.nextInt();
			sum += num;
		}
		
		System.out.println("정수의 합: " + sum);
	}
}
