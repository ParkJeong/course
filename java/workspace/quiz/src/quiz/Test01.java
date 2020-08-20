package quiz;

import java.util.Scanner;

public class Test01 {
	
	static boolean isPrimary(int num) {
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		/*
		 * 스캐너를 통해서 정수를 입력받는다.
		 * 1부터 해당 정수까지 소수들의 합을 구하는 코드를 작성
		 * ex) 10을 입력받으면 2, 3, 5, 7의 합
		 */
		int target;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		target = sc.nextInt();
		sum = 0;
		
		for(int i = 2; i <= target; i++) {
			if ( isPrimary(i) ) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
