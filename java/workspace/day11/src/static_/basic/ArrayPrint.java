package static_.basic;

import java.util.Arrays;

public class ArrayPrint {
	// 메서?�� ?��버로?��, 문자?�� 배열?�� 받아?��, 배열?��?���? 문자?��?�� ?��?���? 리턴 
	// 1. 외부에서 객체를 생성하지 못하도록 접근 제어자를 선언
	// 2. staic 메서드로 변경해서 사용

	private ArrayPrint() {}
	
	public static String printArray(int[] arr) {
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1)
				System.out.print(",");
		}
		System.out.println("]");
		

		
		String str = "[";
		StringBuilder buffer = new StringBuilder(str);
		
		for(int i = 0 ; i < arr.length; i++) {
			buffer.append(arr[i]);
			if(i != arr.length - 1) {
				buffer.append(",");
			}
		}
		buffer.append("]");
		
		return buffer.toString();
		
	
		
//		return Arrays.toString(arr);
	}
	
	public static String printArray(String[] arr) {
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1)
				System.out.print(",");
		}
		System.out.println("]");
		

		
		String str = "[";
		StringBuilder buffer = new StringBuilder(str);
		
		for(int i = 0 ; i < arr.length; i++) {
			buffer.append(arr[i]);
			if(i != arr.length - 1) {
				buffer.append(",");
			}
		}
		buffer.append("]");
		
		return buffer.toString();
		
	
		
//		return Arrays.toString(arr);
	}
}
