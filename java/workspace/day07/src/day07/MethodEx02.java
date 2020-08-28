package day07;

public class MethodEx02 {
	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 메서드를 호출할 때, 실행에 필요한 값을 전달하는 매개체이다.
		 * 2. 매개변수를 몇개를 받을지는 메서드 선언시에 결정한다
		 * 3. 매개변수를 여러개 받고 싶다면 ,로 연결하고,
		 *    받지 않는다면 ()를 비워두면 된다.
		 */
		
		int result = calSum(10);
		System.out.println("1~10까지 합: " + result);
		
		System.out.println(calSum(20));
	}
	
	static int calSum(int end) {
		
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int calSum2(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	static String calSum3(int start, int end, String s) {
		String str = "";
		for(int i = start; i <= end; i++) {
			str += s;
		}
		return str;
	}
}
