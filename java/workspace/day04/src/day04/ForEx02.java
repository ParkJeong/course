package day04;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력>");
		int num = scan.nextInt();
		
		int count = 0;
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		System.out.println(count == 2 ? num + "은 소수" : num + "은 소수가 아닙니다." );
		
		scan.close();
		
	}
}
