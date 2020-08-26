package quiz;

import java.util.Scanner;

public class Quiz28 {
	public static void main(String[] args) {
		// 1. 가로, 세로를 입력 받는다.
		// 2. 가로길이, 세로길이의 사각형을 출력하면 된다.
		// 3. 단, 윤곽만 나타낟록 처리한다.
		// 조건: 첫행, 마지막 행에 ㅊㄹ력, 첫열 마지막 열에 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int width = scan.nextInt();
		System.out.print("세로>");
		int height = scan.nextInt();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width*2 - 1; j++) {
				if(i == 0 || i == height-1) {
					System.out.print("*");
				}
				else if (j == 0 || j == width*2-2){
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
