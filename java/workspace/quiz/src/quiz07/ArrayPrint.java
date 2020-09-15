package quiz07;

import java.util.Arrays;

public class ArrayPrint {
	// 메서드 오버로딩, 문자열 배열을 받아서, 배열요소를 문자열의 형태로 리턴 
	

	String printArray(int[] arr) {
		
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
	
	String printArray(String[] arr) {
		
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
