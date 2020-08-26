package quiz;

import java.util.Scanner;

public class Quiz29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int end = scan.nextInt();
		int sum = 0;
		boolean isPrimary;
		
		for(int i = 2; i <= end; i++) {
			isPrimary = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j  == 0) {
					isPrimary = false;
					break;
				}
			}
			if(isPrimary) {
				sum += i;
			}
		}
		System.out.println(end + "까지 소수의 합은: " + sum);
		
	}
}
