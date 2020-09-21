package exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {

			try {
				System.out.println(">");
				scan.next();
				int num = scan.nextInt();

				System.out.println("입력결과: " + num);
			} catch(Exception e) {
				System.out.println("숫자로 입력해주세요.");
			}
		}
	}
}
