package day07;

public class MethodEx03 {
	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type이다.
		 * 2. 반환유형이 있는 메서드는 호출문이 하나의 값이기 때문에, 다른 메서드의 매개값으로 사용이 가능합니다.
		 * 3. 반환값이 없는 경우는 void라고 적습니다.
		 * 4. 모든 메서드는 return을 만나면 강제 종료됩니다.
		 *    
		 */
		
		int result = add(add(1, 2), add(3, 5));
		System.out.println("결과: " + result);
		/*
		 * void형 메서드는 return이 없기 때문에 단수히 호출만 가능함
		 * System.out.println(sub(10, 5));
		 * int result2 = sub(10, 5);
		 */
		sub(10,5);
		multi();
	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	static void sub(int a, int b) {
		System.out.println(a + "-" + b + "=" + (a-b));
	}
	static void multi() {
		System.out.println(10*10);
	}
	
	void noReturn(String s) {
		
		if(s.equals("똑똑이")) {
			System.out.println("똑똑똑");
			return;
		}
		System.out.println(s + "가 아니고 똑똑이를 전달");
	}
}
