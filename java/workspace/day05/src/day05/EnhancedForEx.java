package day05;

public class EnhancedForEx {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("======================");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(String s : arr2) {
			System.out.println(s);
		}
		
		System.out.println("=====================");
		
		int[] score = {33, 66, 46};
		int sum = 0;
		double avg;
		
		for(int i : score) {
			sum += i;
		}
		avg = (double)(sum)/score.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.printf("합계: %d, 평균: %.2f", sum, avg);
	}
}
