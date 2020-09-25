package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {
	public static void main(String[] args) {
		/*
		 * 1. FileOutputStream은 파일을 쓸 때 사용하는 클래스이다.
		 * 2. 생성자 매개값으로 파일을 쓸 전체 경로를 지정한다.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("파일명>");
		String name = stdIn.next();
		
		try(FileOutputStream fos = new FileOutputStream("D:\\course\\course\\java\\file\\" + name + ".txt")) {
						
			System.out.print("문장을 입력하세요>");
//			stdIn.nextLine(); // next() 다음에 nextLine()을 쓰려면
							  // 그냥 넘어가버리는 문제가 있기 때문에 엔터값을 제거
			String str = stdIn.nextLine();
			
			fos.write(str.getBytes());
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			
		} 
		
		
	}
}
