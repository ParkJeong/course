package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 2));
		
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		
		int[] newArr2 = Arrays.copyOfRange(arr, 2, arr.length);
		System.out.println(Arrays.toString(newArr2));
		
		
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열 요소가 같다.");
		}
	}
}
