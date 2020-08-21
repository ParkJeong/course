package day02;

public class CastingEx03 {
	public static void main(String[] args) {
		// 연산에서의 형변환
		char c = 'C';
		char c2 = 'D';
		int i = 2;
		
		// 1. 서로 다른 타입의 연산에서 큰 타입에 맞추어 자동 형변환된다.
		char cc = (char)(c + i);
//		char cc2 = c + (char)i;
		int ii = c + i;
		
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
		double d = 3.14;
		double result = j + d;
		int result2 = j + (int)d;
		int result3 = (int)(j + d);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		// 2. int형보다 작은 타입의 연산 결과는 int가 된다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		
		short s1 = 100;
		byte b4 = 10;
		short s2 = (short)(s1 + b4);
	}
}
