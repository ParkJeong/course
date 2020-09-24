package quiz20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 1. nextLine() 문장을 받는다.
		 * 2. 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 토큰개수를 확인
		 * 4. 분리된 토큰에 숫자를 붙여서 세로 형태로 출력.
		 * 		1. 안녕
		 * 		2. 하세요.
		 * 		3. 오늘은
		 * 5. 분리된 문자열을 배열에 저장
		 * 
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("문장입력>");
		String sentence = stdIn.nextLine();
		
		StringTokenizer token = new StringTokenizer(sentence);
		
		String[] arr = new String[token.countTokens()];
		
		int count = 0;
		while(token.hasMoreTokens()) {
			String temp = token.nextToken();
			arr[count++] = temp;

			System.out.printf("%d. %s\n", count, temp );
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
