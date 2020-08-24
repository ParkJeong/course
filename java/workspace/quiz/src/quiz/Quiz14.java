package quiz;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		// IfEx02와 구문이 동일하게 실행되도록 switch구문으로 변경
		// 힌트: 점수를 10으로 나눈 몫을 이용
		Scanner scan = new Scanner(System.in);

		System.out.println("점수>");
		int point = scan.nextInt();

		switch(point/10) {
		case 9:
			if(point > 95) {
				System.out.println("A+학점");
			}
			else {
				System.out.println("A학점");
			}
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			if(point == 100) {
				System.out.println("A+학점");
			} else if(point > 100) {
				System.out.println("잘못된 점수입니다.");
			} else {
				System.out.println("F학점");	
			}
		}
	}
}
