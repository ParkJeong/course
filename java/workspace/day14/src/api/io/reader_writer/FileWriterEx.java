package api.io.reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할 때 사용하는 클래스 FileWriter 클래스이다.
		 * 기본적으로 2바이트 단위로 처리하기 때문에 문자를 쓰기에 적합하다.
		 */
		
		try(FileWriter fw = new FileWriter("text.txt")){
			String str = "오늘은 9월 25일 입니다~\n아 금요일이다.\n집에가야지";
			
			fw.write(str);
			
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch(IOException e) {
			
		}
	}
}
