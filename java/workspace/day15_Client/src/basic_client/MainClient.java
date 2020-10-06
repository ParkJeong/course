package basic_client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MainClient {
	public static void main(String[] args) {
		try {
			// 컴퓨터의 IP주소를 아는 법
			// CMD 실행후 ipconfig 명령어 실행
			// IPv4 주소를 확인
			// 첫번째 생성자의 매개변수 IP주소, PORT번호
			Socket socket = new Socket("192.168.104.61", 8383);
			
			// 소켓 클래스의 inputStream으로 서버로부터 데이터를 받는다.
			InputStream is = socket.getInputStream();
			
			// 서버로부터 받은 데이터를 문자열 데이터로 변경
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String result = br.readLine();
			
			System.out.println(result);
			
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
