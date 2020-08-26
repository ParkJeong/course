package day05;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			int ran = (int)(Math.random() * 10) + 1;
			
			System.out.println("5 x " + ran +" = ?");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == 5*ran) {
				System.out.println("정답입니다~");
				break;
			}
			else {
				System.out.println("틀렸는데요?");
			}
		}
	}
}
