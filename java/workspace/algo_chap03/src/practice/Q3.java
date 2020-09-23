package practice;

public class Q3 {
	public static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
	}
	
	public static int binSearchX(int[] a, int n, int key) {
		int pStart = 0;
		int pEnd = n - 1;
		int pMiddle = (pStart + pEnd)/2;
		
		while(pStart <= pEnd) {
			pMiddle = (pStart + pEnd)/2;
			if(a[pMiddle] < key) {
				pStart = pMiddle + 1;
			} else if(a[pMiddle] > key) {
				pEnd = pMiddle -1;
			} else {
				for(; a[pMiddle - 1] == key; pMiddle--) {
				}
				return pMiddle;
			}
		}
		return -1;
	}
}
