package overloading.basic;

public class Basic {
	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 생성하는 것
	 * 규칙
	 * 1. 이름이 같음
	 * 2. 반환유형은 오버로딩에 영향을 미치지 않습니다.
	 * 3. 매개변수 타입이 달라야 한다.
	 * 4. 매개변수 종류가 달라야 한다.
	 * 5. 매개변수 순서가 달라야 한다.
	 * -> 즉 완전히 동일하지 않으면 된다.
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력됨");
	}

//	int input(int a) {
//		System.out.println("정수 1개가 입력됨");
//	}
	void input(String a) {
		System.out.println("문자열 1개 입력됨");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력됨");
	}
	
	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 입력됨");
	}

	void input(char a, int b, double c) {
		System.out.println("문자 1개, 정수 1개, 실수 1개 입력됨");
	}
}