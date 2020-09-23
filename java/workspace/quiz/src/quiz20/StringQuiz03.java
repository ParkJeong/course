package quiz20;

class Palindrome {
	public static String palindromeCheck(String str) {

		str = str.replace(" ", "");
	
		int length = str.length();

		for(int i = 0; i < length/2; i++) {
			if(str.charAt(i) != str.charAt(length - 1 - i)) {
				return "회문이 아닙니다";
			}
		}
		return "회문입니다.";
	}
}

public class StringQuiz03 {
	public static void main(String[] args) {
		System.out.println(Palindrome.palindromeCheck("다시다"));
		System.out.println(Palindrome.palindromeCheck("다시 합창 합시다"));
		System.out.println(Palindrome.palindromeCheck("아 좋다 좋아"));
		System.out.println(Palindrome.palindromeCheck("안녕하세요"));



	}
}
