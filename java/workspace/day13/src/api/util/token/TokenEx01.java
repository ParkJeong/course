package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {
	public static void main(String[] args) {
		
		// StringTokenizer 클래스 - 특정문자 기준으로 문자열을 잘라서 사용
		String str1 = "오늘 날씨는 맑고, 매우 시원하다.";
		String str2 = "2020/09/23";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		System.out.println(token1.countTokens());
		System.out.println(token1.nextToken());
		System.out.println(token1.nextToken());
		System.out.println(token1.hasMoreTokens());
		
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
//		
//		StringTokenizer token2 = new StringTokenizer(str2);
//		
//		
//		while(token2.hasMoreElements()) {
//			System.out.println(token2.nextToken());
//		}
//		
		System.out.println("=============================");
		
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
	}
}
