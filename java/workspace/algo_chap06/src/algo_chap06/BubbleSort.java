package algo_chap06;

import java.util.Arrays;

public class BubbleSort {
	static int compareCount = 0;
	static int swapCount = 0;
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {

		for(int i = 0; i < n - 1; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					swapCount++;
				}
				compareCount++;
			}
		}

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

	static void bubbleSort2(int[] a, int n) {

		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j + 1]) {
					showElement(a, 0, j);
					System.out.print(" + ");
					showElement(a, j + 1, n-1);
					swap(a, j, j + 1);
					swapCount++;
				}else {
					showElement(a, 0, j);
					System.out.print(" - ");
					showElement(a, j + 1, n-1);
				}
				System.out.println();
				compareCount++;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = {6, 4, 3, 7, 1, 9, 8};
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("교환 횟수: " + swapCount);
		System.out.println("비교 횟수: " + compareCount);
		System.out.println("-----------------------");

		swapCount = 0;
		compareCount = 0;
		int[] arr2 = {6, 4, 3, 7, 1, 9, 8};
		bubbleSort2(arr2, arr.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println("교환 횟수: " + swapCount);
		System.out.println("비교 횟수: " + compareCount);


	}
}
