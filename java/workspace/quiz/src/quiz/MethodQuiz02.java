package quiz;

import java.util.Arrays;

public class MethodQuiz02 {
	public static void main(String[] args) {
		System.out.println("--------method1--------");
		method1();
		
		System.out.println("--------method2--------");
		System.out.println(method2("토마토"));
		
		System.out.println("--------method3--------");
		System.out.println(method3(1, 2, 100.5));
		
		System.out.println("--------method4--------");
		System.out.println(method4(3));
		System.out.println(method4(4));
		
		System.out.println("--------method5--------");
		method5("안녕", 5);
		
		System.out.println("--------method6--------");
		char[] chArr = {'A', 'B', 'C', 'D'};
		System.out.println(method6(chArr));
		
		System.out.println("--------method7--------");
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(method7(arr));
		
		System.out.println("--------method8--------");
		System.out.println(Arrays.toString(method8("과일 ", "화채")));
		
		System.out.println("--------maxNum--------");
		System.out.println(maxNum(1, 10));
		System.out.println(maxNum(100, 10));
		
		System.out.println("--------abs--------");
		System.out.println(abs(5));
		System.out.println(abs(-5));
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String str) {
		return str;
	}
	static double method3(int num1, int num2, double num3) {
		return num1 + num2 + num3;
	}
	static String method4(int num) {
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	static void method5(String str, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
	static String method6(char[] chars) {
		String str = "";
		
//		for(int i = 0; i < chars.length; i++) {
//			str += chars[i];
//		}
		for(char c : chars) {
			str += c;
		}
		
		return str;
	}
	static int method7(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static String[] method8(String str1, String str2) {
		String[] arr = new String[2];
		arr[0] = str1;
		arr[1] = str2;
		
		return arr;
	}
	
	static int maxNum(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	static int abs(int num) {
		return num > 0 ? num : -num;
	}
}
