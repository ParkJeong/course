package quiz;

import java.util.Scanner;

public class Quiz33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int correct = 0;
		int correctCount = 0;
		int incorrectCount = 0;
		int randNum1;
		int randNum2;
		int randOperator;

		while(true) {
			System.out.println("-------------");
			randNum1 = (int)(Math.random()*100) + 1;
			randNum2 = (int)(Math.random()*100) + 1;
			randOperator = (int)(Math.random()*2);

			if(randOperator == 0) {
				System.out.printf("%d + %d = ?\n", randNum1, randNum2);
				correct = randNum1 + randNum2;
			} else {
				System.out.printf("%d - %d = ?\n", randNum1, randNum2);
				correct = randNum1 - randNum2;				
			}
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			
			answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("----------------");
				System.out.printf("정답 횟수: %d회\n", correctCount);
				System.out.printf("틀린 횟수: %d회\n", incorrectCount);
				break;
			}

			if(answer == correct) {
				System.out.println("정답입니다!!");
				correctCount++;
			}
			else {
				System.out.println("틀렸는데요??");
				incorrectCount++;	
			}

		}

	}
}
