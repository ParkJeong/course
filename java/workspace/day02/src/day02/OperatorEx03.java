package day02;

public class OperatorEx03 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		// if 뒤에 소괄호가 true면 if 중괄호를 실행, false라면 else 중괄호를 실행
		if(x != 10 && ++y == 21) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x의 값: " + x + ", y의 값: " + y);
		
		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x의 값: " + x + ", y의 값: " + y);
		
		
	}
}
