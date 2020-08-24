package quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		
		// quiz 05
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력하세요");
		
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		
		
		if(num1 > num2) {
			System.out.println(num1 + "이 큰 수입니다.");
		} else if (num1 < num2) {
			System.out.println(num2 + "이 큰 수입니다.");	
		} else {
			System.out.println("같은 수 입니다.");
		}
		

		scan.close();
	}
}
