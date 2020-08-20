package day01;

public class IdentifierEx {
	public static void main(String[] args) {
		
		// 식별자는 대소문자를 구분함
		int age = 20;
		int Age = 21;
		
		// shift + home 커서에서 해당 줄의 처음까지 블록처리
		// shift + end 커서에서 해당 줄의 마지막까지 블록처리
		System.out.println(age);
		System.out.println(Age);
		
		// 식별자를 사용할 때 공백은 사용할 수 없음
		int phoneNumber = 4;
//		int phone number = 5; ctrl + / 빠른 주석
		/*
		 * int phone Number = 6; ctrl + shift + / 빠른 주석 
		 */
		
		// 예약어는 사용할 수 없다.
//		int class = 1;
	}
}
