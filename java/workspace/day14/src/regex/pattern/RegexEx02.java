package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	public static void main(String[] args) {
		/*
		 * 주요 정규표현 형식
		 * \\d  - 숫자를 찾음
		 * \\d+ - 숫자 1개이상 찾음
		 * \\w  - 문자(_와 영소문자와 숫자)를 찾음
		 * \\w+ - 문자(_와 영소문자와 숫자) 1개 이상 찾음
		 * \\W  - 문자(_와 영소문자와 숫자를 제외한 문자)를 찾음
		 * \\W+ - 문자(_와 영소문자와 숫자를 제외한 문자) 1개이상 찾음
		 * 
		 * \\d{3}   - 숫자 3개
		 * \\d{3,4} - 숫자 3개이상 4개이하
		 * [0-9]    - 0~9까지 문자 1개 찾음
		 * [A-Z]    - A~Z까지 문자 1개 찾음
		 * [a-z]    - a~z까지 문자 1개 찾음
		 * [가 ~힣]  - 한글 1개 찾음
		 * [가~힣]+  - 한글 1개 이상 찾음 
		 * [가~힣]*  - 한글 0개 이상 찾음 
		 * [가~힣]?  - 한글 0개 or 1개 
		 * 
		 * 
		 * [A-Za-z] - 알파벳 중 1개
		 * 
		 * 특수문자\?는 그 자체를 의미함
		 */

		String info = "30세|서울시 강남구|02-1234-4566|010-1234-4566/kkk@naver.com";
		
		//1. 전화번호 형식
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		
		//m.find(), m.start(), m.end(), m.group()
		
		while(m.find()) {//info 문자열에서 정규표현식에 패턴에 매칭되면 true, 아니면 false를 반환
			System.out.println("시작인덱스:" + m.start());
			System.out.println("찾은값:" + m.group());
			System.out.println("끝인덱스:" + m.end());
		}

		System.out.println("--------------------------------");
		//2. 메일 형식
		
		String pattern2 = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+";
		
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(info);
		
		while(m2.find()) {
			System.out.println("시작인덱스:" + m2.start());
			System.out.println("찾은값:" + m2.group());
			System.out.println("끝인덱스:" + m2.end());
		}
	}
}
