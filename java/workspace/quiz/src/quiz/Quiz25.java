package quiz;

import java.util.Arrays;

public class Quiz25 {
	public static void main(String[] args) {
		int x = 1;
		int y = 5;
		
		System.out.println(x + " " + y);
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println(x + " " + y);
		
		// 1. 1~9까지 배열의 값 중에 절대 중복되지 않는 숫자로 만들어진 3개의 크기의
		// 배열을 만들어내는 프로그램
		// arr에서 중복되지 않게 3개의 숫자를 추출.
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] resultArr = new int[3];
		int rand;
		int count = 0;
		//배열 섞기
		for(int i = 0; i<arr.length; i++) {
			rand = (int)(Math.random()*arr.length);
			temp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = temp; 
		}

		System.out.println(Arrays.toString(arr));
		//for문을 다시 한번 이용해서 0, 1, 2 인덱스 값을 새로운 배열에 옮깁니다.
		for(int i = 0; i < 3; i++) {
			resultArr[i] = arr[i];
		}

		System.out.println(Arrays.toString(resultArr));
		
//		while(count < 3) {
//			rand = (int)(Math.random()*arr.length);
//
//			for(int i = 0; i < 3; i++) {
//				if (resultArr[i] != arr[rand] && resultArr[i] != 0) {
//					resultArr[i] =  arr[rand];
//					count++;
//					break;
//				}
//			}
//		}
		System.out.println(Arrays.toString(resultArr));
		
		
		
	}
}
