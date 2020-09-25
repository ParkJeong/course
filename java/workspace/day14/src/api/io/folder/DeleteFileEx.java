package api.io.folder;

import java.io.File;

public class DeleteFileEx {
	public static void main(String[] args) {
		try {
			File file = new File("test_folder");

			if(file.exists()) {//폴더가 존재하면 삭제
				if(file.delete()) {
					System.out.println("폴더를 삭제했습니다.");
				}else {
					System.out.println("폴더 삭제 실패했습니다.");
				}
			}else {
				System.out.println("폴더가 없습니다.");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
