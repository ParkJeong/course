package quiz;

import java.util.Arrays;

public class Quiz30 {
	public static void main(String[] args) {
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
		// 선택 정렬
		int temp;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

	}
}
