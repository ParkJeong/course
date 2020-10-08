package algo_chap06;

public class BubbleSort3 {
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	static void bubbleSort(int[] arr, int n) {
		int k = 0;
		while(k < n - 1) {
			int last = n - 1;
			for(int j = n - 1; j > k; j--) {
				if(arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					last = j;
				}
			}
			k = last;
		}
	}
	
	static void bubbleSort2(int[] arr, int n) {
		for(int i = 0; i < n - 1; i++) {
			int exchg = 0;
			for(int j = n - 1; j > i; j--) {
				if(arr[j - 1] > arr[j]) {
					swap(arr, j-1, j);
					exchg++;
				}
			}
			if(exchg == 0) break;
		}
	}
}
