package day01;

public class VariableEx {
	public static void main(String[] args) {
		/*
		 * 변수선언 방법 <데이터타입> 이름;
		 * 
		 * int는 정수를 저장하는 대표적인 유형
		 */
		int num;
		num = 10;

		System.out.println(num);

		// 선언과 초기화를 동시에
		int num2 = 20;

		// 같은 이름으로 변수를 생성 할 수 없음
		// int num2 = 100;

		// 변수는 다른 변수의 값, 또는 연산의 결과도 저장할 수 있습니다.
		int result = num + num2 + num + 20;
		System.out.println(result);

		// 문자열을 저장하는 대표적인 타입
		String str = "1";

		// 자바에서 변수는 타입이 다르면, 바로 저장할 수 없다.
		// int num3 = str;
		
		System.out.println("-------------------");
		
		int result3 = 100;
		result3 = 50;
		result3 = result;
		result3 = 100;
		
	}
}
