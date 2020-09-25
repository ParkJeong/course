package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopyEx {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("pic.png");
			FileOutputStream fos = new FileOutputStream("picCopy2.png")){
			
			int i = 0;
			byte[] arr = new byte[100];
			while((i = fis.read(arr)) != -1) {
				fos.write(arr);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
