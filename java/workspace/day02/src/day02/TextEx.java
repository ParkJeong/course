package day02;

public class TextEx {
	public static void main(String[] args) {
		// 단일 문자를 저장하는 데이터 타입 char
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 문자를 통일하기 위해서 유니코드의 등장 > char가 2Byte의 크기로 확장되고 65536개까지 표현가능
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("" + c3 + c4 + c5);
		
		// 문자열을 저장할 수 있는 String
		String s1 = "hello~!";
		String s2 = "my name is park";
		
		System.out.println(s1 + s2);
		System.out.println(s2);
		
		// 문자열과 다른 데이터 타입의 + 연산
		System.out.println(100 + 300);
		System.out.println("100" + 300); // 문자열에는 다른 타입이 붙으면 > 결과는 무조건 문자열
		System.out.println(100 + 300 + "world");
		System.out.println("hello" + 100 + 300);
		System.out.println("hello" + 100 + 300 + "world");
		
		System.out.println("A" + 100);
		System.out.println('A' + 100);
	}
}
