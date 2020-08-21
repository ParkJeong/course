package day02;

public class IntegerEx {
	public static void main(String[] args) {
		// 정수형
		byte b = 127;
		byte b1 = -128;
		
		short s = 32767;
		short s1 = -32768;
		
		int i = 2147483647;
		int i1 = -2147483648;
		
		long l = 9221999999999999990L;
		long l1 = -1;
		
//		2진수를 저장할 때는 앞에 0b를 붙인다.
//		8진수를 저장할 때는 앞에 0을 붙인다.
//		16진수를 저장할 때는 앞에 0x를 붙인다.
		int bin = 0b0011;
		System.out.println("2진수 0011: " + bin);
		
		int oct = 00011;
		System.out.println("8진수 0011: " + oct);
		
		int hex = 0x0011;
		System.out.println("16진수 0011: " + hex);
		
		System.out.println("------------------------");
		
		// 실수형
		float f1 = 3.14F; // float을 표현하고 싶다면 식별자 f, F를 붙여야한다.
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415923234F;
		double d2 = 3.141592123456789123456789;

		System.out.println(f2);
		System.out.println(d2);
		
		//지수형태 e표기법
		float f3 = 314.159e-2F;
		System.out.println(f3);
		float f4 = 0.00314e3F;
		System.out.println(f4);
		
		System.out.println("------------------------------");
		// 논리형 타입
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
