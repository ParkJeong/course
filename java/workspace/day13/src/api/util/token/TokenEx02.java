package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {
	public static void main(String[] args) {
		String log = "2020.09.23, /bno=30, user=홍길동";
		
		// 공백을 기준으로 토큰을 나눈다.
		StringTokenizer token = new StringTokenizer(log);
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		System.out.println("----------------------------");
		
		// ,을 기준으로 토큰을 나눈다.
		StringTokenizer token1 = new StringTokenizer(log, ",");
		
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		System.out.println("----------------------------");
		// ,도 토큰화시킨다.
		StringTokenizer token2 = new StringTokenizer(log, ",", true);
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}
}
