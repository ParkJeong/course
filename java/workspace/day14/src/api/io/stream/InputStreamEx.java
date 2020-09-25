package api.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
		/*
		 * 1. 파일을 읽어들이는데 사용하는 클래스 FileInputStream이다.
		 * 2, 생성자에 매개값으로 읽어들일 파일의 전체경로를 적는다.
		 */
		
		try(FileInputStream fis = new FileInputStream("D:\\course\\course\\java\\file\\asdasd.txt")){
//			int i = 0;
//			
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);				
//			}
			byte[] arr = new byte[100];
			int result = fis.read(arr);
		
			int i = 0;
			while(arr[i] != 0) {
				System.out.print((char)arr[i++]);
			}
			
		} catch(IOException e) {
			
		}
		
	}
}
