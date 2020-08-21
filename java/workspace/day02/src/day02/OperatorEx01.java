package day02;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		
		// 부호 연산자 +, -
		int i = -3;
		int j = -i;
		System.out.println(j);
		
		// 증감 연산자 ++, --
		int k = 1;
		int h = k++;	// 후위 연산자: 먼저 값을 이용하고, 그 다음에 1 증가시킨 후 저장
		int h2 = ++k;
		System.out.println("k값: " + k);
		System.out.println("h값: " + h);
		System.out.println("h2값: " + h2);
		
		int x = 1;
		int y = ++x;	// 전위 연산자: 먼저 값을 1 증가시킨후, 그 다음에 값을 이용한다
		System.out.println("x값: " + x);
		System.out.println("y값: " + y);
		
		// 일반적인 사용
		x = 1;
		x++;
		++x;
		
		System.out.println("---------------------------------------");
		
		x = 1;
		y = 1;
		
		System.out.println(x++);
		System.out.println(++x);
		
		x = 10;
		y = 10;
		
		int result = (x++) + (++y) + 10;
		System.out.println(result);
		
		// 예외적인 상황
		x = 10;
		y = 10;
		
		// 10 + 11 + 12로 계산됨, 앞의 것은 계산이 된다.
		int result2 = x++ + x++ + x++;
		System.out.println(result2);
		
		System.out.println("-----------------------------");
		
		// 비트 연산자 ~ (비트값을 반대로 치환)
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1); // 1111 0101
		
		System.out.println("-----------------------");
		
		// 논리반전 연산자 !
		System.out.println(!true);
		System.out.println(!false);
		
		
		
	}
}
