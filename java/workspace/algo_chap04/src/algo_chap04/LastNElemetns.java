package algo_chap04;

import java.util.Scanner;

public class LastNElemetns {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();
			
			retry = stdIn.nextInt();
		} while( retry == 1);
	}
}
