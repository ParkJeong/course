package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요>");
		int size = scan.nextInt();
		int[] iarr = new int[size];
		
		int i = 0;
		while(i < size) {
			iarr[i] = i + 1;
			i++;
		}
		System.out.println("배열 iarr는:" + Arrays.toString(iarr));
		
	}
}
