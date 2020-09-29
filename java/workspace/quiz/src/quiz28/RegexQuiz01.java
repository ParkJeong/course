package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	public static void main(String[] args) {
		/*
		 * 가격형식만 찾아서 순서대로 출력 4,500 6000 ...
		 */
		String str = "헠4,500원 헿~1,200원 엏? 6000원윀 120000원";
		
//		String pattern = "\\d{0,3},?\\d{1,3}원?"; 
		String pattern = "[0-9]+,*[0-9]+원"; 
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
//			System.out.println("시작인덱스:" + m.start());
			System.out.println("찾은 값:" + m.group());
//			System.out.println("끝인덱스:" + m.end());
		}
		
	}
}
