package day03;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("점수>");
		int point = scan.nextInt();

		if(point >= 90) {
			if(point > 100) {
				System.out.println("잘못된 점수 입니다.");
			} else if (point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if (point >= 80) {	// 80~89
			System.out.println("B학점");
		} else if (point >= 70) {
			System.out.println("C학점");
		} else if (point >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}
}
