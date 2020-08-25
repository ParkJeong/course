package quiz;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		// 1. 7-100까지 정수 중 7의 배수를 가로로 출력
		for(int i = 7; i<=100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("=================");
		// 2. 1~100까지 정수 중 12의 배수를 가로로 출력
		for(int i = 1; i<=100; i++) {
			if(i % 12 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("=================");
		// 3. 1~200까지 정수 중 9의 배수의 개수
		int count = 0;
		for(int i = 1; i<=200; i++) {
			if(i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수: " + count + "개");
		System.out.println("=================");
		// 4. 50~100까지 두 수 사이의 합을 구할 것
		int sum = 0;
		for (int i = 50; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		

		System.out.println("=================");
		// 5. char를 이용해서 A~Z까지 출력(char형으로 for문이 가능)
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("=================");
		// 6. 입력받은 정수까지 팩토리얼 값 5!
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요>");
		int end = scan.nextInt();
		int result = 1;
		
		for(int i = 1; i<=end; i++) {
			result *= i;
		}
		System.out.println(end + "!=" + result);
		System.out.printf("%d! = %d", end, result);
		
		scan.close();
	}
}
