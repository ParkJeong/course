package quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		//각각 값의 결과는 몇인지 유추해 보세요.
		System.out.println(y += 10 - x++); // x = 3, y = 13
		System.out.println(x+=2); // x = 5
		System.out.println( !('A' <= c && c <='Z') ); // false 
		System.out.println('C'-c); // 2, int보다 작은 데이터 타입 값들의 연산은 int형으로 수렴한다.
		System.out.println(c+1); // B, B가 아니라 66이다. int형과 char형의 계산이라 int형으로 수렴한듯하다.
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c);  // C

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
