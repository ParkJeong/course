package quiz19;

import java.util.Scanner;

public class Calculator {
	/*
	 * 1. 정수를 2개 받는다.
	 * 2. 입력한 값이 정수라면 합계를 반환하면 된다.
	 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 그 예의 메서지를 전달하면 된다.
	 * 4. scan.close() 또한 적절하게 처리
	 */
	Scanner scan = new Scanner(System.in);
	int num1;
	int num2;

	//	public Calculator() throws Exception{
	//		super();
	//		
	//		System.out.println("정수>");
	//		this.num1 = scan.nextInt();
	//		System.out.println("정수>");
	//		this.num2 = scan.nextInt();
	//		scan.close();
	//		
	//	}
	public Calculator() throws Exception{
		super();
		try {
			System.out.println("정수>");
			this.num1 = scan.nextInt();
			System.out.println("정수>");
			this.num2 = scan.nextInt();
		} catch(Exception e) {
			throw new Exception("숫자 값을 전달");
		} finally {
			scan.close();
		}
	}

}
