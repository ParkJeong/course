package quiz;

import java.util.Scanner;

public class Quiz32 {
	public static void main(String[] args) {
		/*
		 * up down 게임
		 * 
		 * 1~100까지 임의 숫자를 생성.
		 * 스캐너를 통해서 값을 입력받는다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요."
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요."
		 * 
		 * 정답이라면 시도횟수: x회를 출력하고 종료.
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean isCorrect = false;
		int target = (int)(Math.random()*100) + 1;
		int count = 0;
		int answer = 0;
		
		while(!isCorrect) {
			System.out.println("정수를 입력하세요>");
			answer = scan.nextInt();
			count++;
			
			if (target > answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if (target < answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				isCorrect = true;
			}
		}
		System.out.println("시도횟수: " + count + "회");
		
		scan.close();
	}
}
