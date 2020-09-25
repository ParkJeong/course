package api.io.reader_writer;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		/*
		 * 문자기반으로 읽어들이는 클래스는 FileReader 클래스이다.
		 * 2바이트 단위로 읽고 쓰기 때문에 문자를 쓰기에 적합하다.
		 */
		
		try(FileReader fr = new FileReader("text.txt")){
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
