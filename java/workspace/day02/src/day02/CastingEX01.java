package day02;

public class CastingEX01 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때(업 캐스팅)는
		 * JVM(Java Virtual Machine)이 자동으로 형변환을 해준다.
		 * 
		 */
		
		byte b = 10;
		short s = b; // byte > short 자동형변환
		int i = b;	// byte > int
		long l = b; // byte > long
		
		char c = '가'; // 2byte
		int j = c; // char > int
		System.out.println("가의 유니코드 숫자값: " + j);
		
		int k = 1000;
		double d = k; // int > double
		System.out.println(d);

		
		
	}
}
