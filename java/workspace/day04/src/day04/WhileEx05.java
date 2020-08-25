package day04;

import java.util.Arrays;

public class WhileEx05 {
	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println(Arrays.toString(arr));
		
		int i = 0;
		int sum = 0;
		
		while(i < arr.length) {
			
			sum += arr[i];
			i++;
		}
		System.out.println("배열요소의 합: " + sum);
	}
}
