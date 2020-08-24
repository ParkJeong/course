package day03;

public class WhileEx01 {
	public static void main(String[] args) {
		// 반복문
		
		int a = 1; // 제어변수: 반복문의 횟수를 제어할 변수
		int sum = 0; // 합계변수: 값을 누적할 변수
		
		while(a <= 10) {
			sum += a;
			System.out.println(sum);
			a++; // 제어변수 조작을 통해서 반복의 조건식이 언젠가 false가 되도록 처리
		}
		
		System.out.println("1~10까지 합: " + sum);
	}
}
