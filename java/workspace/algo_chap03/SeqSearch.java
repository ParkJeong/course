package algo_chap03;

import java.util.Scanner;

public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n) {
				return -1;
			}
			if(a[i] == key) {
				return i;
			}
			i++;
		}
	}
	
	static int seqSearch2(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}
	
	static int seqSearchSen2(int[] a, int n, int key) {
		int i;
		
		a[n] = key;
		
		for(i = 0; a[i] != key; i++) {
		}

		return i == n ? -1 : i;
	}
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i +"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값: ");
		int key = stdIn.nextInt();
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있다.");
		}
	}
}
