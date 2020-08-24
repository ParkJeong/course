package quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		// quiz06
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		System.out.print(">");
		int num = scan.nextInt();
		String result;
		
		if(num > 0) {
			//result = (num % 2 == 0) ? num + "은(는) 짝수입니다." : num + "은(는) 홀수입니다.";	
			if (num % 2 == 0) {
				result = num + "은(는) 짝수입니다.";
			} else {
				result = num + "은(는) 홀수입니다.";
			}
		} else if (num < 0) {
			result = num + "은(는) 음의 정수입니다.";
		} else {
			result = "입력한 정수는 0입니다.";
		}
		System.out.println(result);
		
		scan.close();
	}
}
