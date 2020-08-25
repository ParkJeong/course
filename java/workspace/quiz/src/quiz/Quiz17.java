package quiz;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		// 1. 1부터 ~ 입력받은 정수까지 3의 배수이거나, 4의 배수일 경우에 출력

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요>");
		int end = scan.nextInt();

		int i = 1;
		while(i <= end) {
			if(i % 3 == 0 || i % 4 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println("==========================");
		// 2. 1 ~ 입력받은 정수까지 6의 배수의 합
		i = 1;
		int sum = 0;
		while(i <= end) {
			if(i % 6 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(end + "까지 6의 배수의 합: " + sum);
		System.out.println("==========================");
		
		// 3. 1 ~ 100까지 정수 중의 4의 배수이면서 8의 배수가 아닌 수의 개수
		i = 1;
		int count = 0;
		
		while(i <= 100) {
			if(i % 4 == 0 && i % 8 != 0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
		System.out.println("==========================");
		
		// 4. 1000까지 약수의 개수
		i = 1;
		int j = 1;
		count = 0;
		while(i <= 1000) {
			
			while(j <= i) {
				if(i % j == 0) {
					count++;
				}
				j++;
			}
			System.out.println(i + "의 약수의 개수: " + count);
			
			i++;
			j = 1;
			count = 0;
		}

		scan.close();
	}
}
