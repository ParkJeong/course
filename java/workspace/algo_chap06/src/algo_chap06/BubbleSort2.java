package algo_chap06;

import java.util.Arrays;

public class BubbleSort2 {
	static int compareCount = 0;
	static int swapCount = 0;
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		arr[idx1] = arr[idx1] + arr[idx2];
		arr[idx2] = arr[idx1] - arr[idx2];
		arr[idx1] = arr[idx1] - arr[idx2];
		
		arr[idx1] = arr[idx1] ^ arr[idx2];
		arr[idx2] = arr[idx1] ^ arr[idx2];
		arr[idx1] = arr[idx1] ^ arr[idx2];
	}

	static void showElement(int[] a, int start, int end) {
		for(int i = start; i <= end; i++) {
			if(i == start) {
				System.out.print(a[i]);
			}else {
				System.out.printf("%4d", a[i]);
			}
		}
	}
	
	public static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int exchg = 0;
			for(int j = n - 1; j > i; j--) {
				if(a[j - 1] > a[j]) {
					showElement(a, 0, j - 1);
					System.out.print(" + ");
					showElement(a, j, n-1);
					swap(a, j, j - 1);
					swapCount++;
					exchg++;
				}else {
					showElement(a, 0, j - 1);
					System.out.print(" - ");
					showElement(a, j, n-1);
				}
				System.out.println();
				compareCount++;
			}
			if(exchg == 0) break;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 4, 3, 7, 1, 9, 8};
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("교환 횟수: " + swapCount);
		System.out.println("비교 횟수: " + compareCount);
		System.out.println("-----------------------");
	}
}
