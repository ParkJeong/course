package practice;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * Q01
		 * 바이트 크기가 작은 작은 자료형을 더 큰 자료형으로 대입하는 형 변환은 자동으로 이루어진다.
		 * -> 예
		 * 
		 * Q02
		 * 실수를 정수형 변수에 대입하는 경우에 형 변환이 자동으로 이루어지고, 소수점 이하 부분만 없어진다.
		 * -> 아니오
		 * 
		 * Q03
		 * 더 많은 실수를 표현하기 위해 가수부와 지수부로 비트를 나누어 표현하는 방식을
		 * 부동소수점 방식이라고 한다.
		 * 
		 * Q04 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해 보세요
		 */
		int iNum1 = 10;
		double dNum2 = 2.0;
		
		System.out.println(iNum1 + dNum2); // 12.0
		System.out.println(iNum1 - dNum2); // 8.0
		System.out.println(iNum1 * dNum2); // 20.0
		System.out.println(iNum1 / dNum2); // 5.0
		System.out.println(iNum1 % dNum2); // 0.0?
		
		char text = 0xAE00;
		
		System.out.println(text);
	}
}
