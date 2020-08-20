package quiz;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 2개의 정수를 입력받는다. 
		 * 2. 입력받은 값이 단순히 정수라면 두 값의 합을 출력하고 반복문을 종료한다.
		 * 3. 입력받은 값이 문자열이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받는다.
		 */

		String input1;
		String input2;
		int sum;
		int num1;
		int num2;
		boolean isNumber1 = false;
		boolean isNumber2 = false;

		sum = 0;
		num1 = 0;
		num2 = 0;
		Scanner sc = new Scanner(System.in);
		while((!isNumber1) || (!isNumber2)) {
			input1 = sc.next();
			input2 = sc.next();

			isNumber1 = false;
			isNumber2 = false;

			try {
				Integer.parseInt(input1);
				isNumber1 = true;
				num1 = Integer.parseInt(input1);
			} catch (NumberFormatException e) {
				System.out.println("정수로만 입력해주세요");
				continue;
			}
			try {
				Integer.parseInt(input2);
				isNumber2 = true;
				num2 = Integer.parseInt(input2);
			} catch (NumberFormatException e) { 
				System.out.println("정수로만 입력해주세요");
				continue;
			}
		}
		sum = num1 + num2;
		System.out.println(sum);
		
		

	}
}
