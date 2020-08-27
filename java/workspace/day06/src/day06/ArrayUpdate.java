package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	public static void main(String[] args) {
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 학생의 별명을 입력>");
		String name = scan.next();
		
		boolean chk = true;
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i])) {
				System.out.println(arr[i] + "이름을 수정합니다.");
				System.out.print(">");
				arr[i] = scan.next();
				chk = false;
			}
		}
		if(chk) {
			System.out.println("이름이 존재하지 않습니다.");
		}
		else {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
