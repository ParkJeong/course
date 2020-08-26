package quiz;

import java.util.Arrays;

public class Quiz31 {
	public static void main(String[] args) {
		
		// 버블 정렬
		// 가장 큰 값을 맨 뒤로 보내는 방법
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i ; j++) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
