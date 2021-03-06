package day03;

import java.util.Scanner;


public class ScannerEx {
	public static void main(String[] args) {
		
		// 1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음
		System.out.print("이름>");
		String name = scan.next();
		
		System.out.print("나이>");
		int age = scan.nextInt();
		
		System.out.print("신장>");
		double height = scan.nextDouble();
		
		System.out.print("자기소개>");
		scan.nextLine();	// 위에서 남아있는 엔터값을 제거
		String intro = scan.nextLine();

		System.out.println("이름: " + name + ", 나이:" + age + ", 신장: " + height);
		System.out.println("자기소개: " + intro);
		
		
		scan.close();
	}
}
