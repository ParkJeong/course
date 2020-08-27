package day06;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		
		System.out.println(Arrays.toString(arr));
		
		int size = 0;
		String food;
		System.out.println("# 먹고 싶은 음식을 입력하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
		while(true) {
			System.out.print("> ");
			food = scan.nextLine();
			
			if(food.equals("그만")) {
				System.out.println("입력 종료!!");
				System.out.print("내가 먹고싶은 음식들: [");
				for(int i = 0; i < size; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("]");
				break;
			}
			
			arr[size] = food;
			size++;
		}
	}
}
