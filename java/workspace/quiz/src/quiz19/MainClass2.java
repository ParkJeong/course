package quiz19;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다.
		 * 입력한 값이 1에서 100까지의 값이 아니라면 예외처리 구문으로 넘기고
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 처리 됩니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */

		Scanner stdIn = new Scanner(System.in);
		int target = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;

		while(target != input) {
			System.out.println("정수(1~100)>");

			try {
				input = stdIn.nextInt();
			} catch (Exception e) {
				System.out.println("반드시 숫자만 입력하세요");
				stdIn.next();
				continue;
			} finally {
				count++;
			}
			
			if(target > input) {
				System.out.println("up");
			} else if (target < input){
				System.out.println("down");
			} else {
				System.out.println("정답");
			}
		}
		
		System.out.println("시도한 횟수: " + count);
		
		stdIn.close();
	}
}
