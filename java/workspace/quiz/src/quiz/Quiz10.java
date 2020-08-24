package quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 정수 3개를 받아서, 큰 값, 중간, 작은 값을 구분하면 된다.
		 * (단, 세 값이 같은 경우는 예외로 한다.)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		System.out.print(">");
		int num3 = scan.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		
		//35줄
		if(num1 > num2 && num1 > num3) {
			// num1이 가장 큰 경우
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			}
			else {
				mid = num3;
				min = num2;
			}
		}
		else if(num2 > num1 && num2 > num3) {
			// num2가 가장 큰 경우
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			}
			else {
				mid = num3;
				min = num1;
			}
		}
		else {
			// num3가 가장 큰 경우
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			}
			else {
				mid = num2;
				min = num1;
			}
		}
		
		
		//42줄
		if(num1 >= num2) {
			// num1, num2
			if(num2 >= num3) {
				//num1, num2, num3
				max = num1;
				mid = num2;
				min = num3;
			}
			else {
				//num1, num2 // num3, num2
				if(num1 >= num3) {
					max = num1;
					mid = num3;
					min = num2;
				}
				else {
					max = num3;
					mid = num1;
					min = num2;
				}
			}
		} else {
			// num2, num1
			if(num1 >= num3) {
				// num2, num1, num3
				max = num2;
				mid = num1;
				min = num3;
			} else {
				// num2, num1 // num3, num1
				if(num2 >= num3) {
					max = num2;
					mid = num3;
					min = num1;
				}
				else {
					max = num3;
					mid = num2;
					min = num1;
				}
			}
		}
		
		System.out.println("큰 값: " + max);
		System.out.println("중간 값: " + mid);
		System.out.println("작은 값: " + min);
	}
}
