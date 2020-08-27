package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int temp;
//		
//		for(int i = 4; i < arr.length-1; i++) {
//			arr[i] = arr[i+1];
//		}
//		arr[arr.length-1] = 0;
//		
//		System.out.println(Arrays.toString(arr));
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};

		System.out.println(Arrays.toString(arr));
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 학생의 별명을 입력하세요>");
		String name = scan.next();
		boolean chk = true;
		
		int count = arr.length;
		for(int i = 0; i < count; i++) {
			if(name.equals(arr[i])) {
				System.out.println(arr[i] + "을 삭제합니다.");
				
				for(int j = i; j < count - 1; j++) {
					arr[j] = arr[j+1];
				}
				arr[count - 1] = null;
				count--;
				chk = false;
			}
		}
		
		if(chk) {
			System.out.println("삭제할 이름이 없습니다.");
		} else {
			System.out.println("----------삭제 후 정보---------");
			System.out.print("[");
			for(int i = 0; i < count; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println("]");
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
