package api.io.folder;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {
		/*
		 * 자바에서 외부경로로 폴더를 생성할 때는 File 클래스를 사용하면 된다.
		 * 생성자 매개변수로 폴더를 생성할 경로 + 폴더명을 지정한다.
		 */
		
		try{
			File file = new File("test_folder");
			
			if(!file.exists()) { // 해당파일이 존재하면 true, 존재하지 않으면 false
				file.mkdir(); // 파일 생성
				System.out.println("폴더생성완료");
			} else {
				System.out.println("해당 폴더가 존재합니다.");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
