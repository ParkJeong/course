package api.lang.string;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = new String("hello world");
		
		char[] arr = {'h', 'e', 'l', 'l', 'o'};
		String str2 = new String(arr);
		
		System.out.println(str);
		System.out.println(str2);
		
		// charAt() - 문자열 인덱스번호 자르기
		String str3 = "안녕하세요";
		char a1 = str3.charAt(0);
		System.out.println(a1);
		
		// indexOf() - 문자열을 찾아서 인덱스 반환
		int index = str3.indexOf("녕하");
		System.out.println(index);
		
		// lastIndexOf() - 문자열을 뒤에서 찾아서 인덱스 반환
		index = str3.lastIndexOf("세");
		System.out.println(index);
		
		// length() - 길이
		System.out.println(str.length());
		
		// replace() - 특정 문자열 변경
		String str4 = "자바의 유래를 아시나요? 자바는 커피집 이름입니다.";
		String str5 = str4.replace("자바", "java");// java의 유래를 아시나요? java는 커피집 이름입니다.
		System.out.println(str5);
		
		// substring() - 문자열 자르기
		String str6 = "123123-456456";
		String str7 = str6.substring(1,2); // 2
		System.out.println(str7); 
		str7 = str6.substring(5);// 3-456456
		System.out.println(str7);
		
		// toUpperCase() - 대문자로 변경, toLowerCase() - 소문자로 변경
		String str8 = "hello world";
		System.out.println(str8);
		System.out.println(str8.toUpperCase());
		
		// trim() - 앞뒤 공백제거
		String str9 = "  hello, world!!   ";
		System.out.println(str9);
		System.out.println(str9.trim());
		
		// valueOf() - 기본형 타입을 문자열로 변경, static 메서드이다. 
		System.out.println("String.valueOf(123) == \"123\" : " + String.valueOf(123).equals("123"));
		
		// split() - 문자열자르기
		String str10 = "010--1234-5678";
		String[] arr2 = str10.split("-");
		System.out.println(Arrays.toString(arr2));
		arr2 = str10.split("-",2);
		System.out.println(Arrays.toString(arr2));
		
	}
}
