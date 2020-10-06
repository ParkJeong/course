package single_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender extends Thread{

	/*
	 * 서버측 메시지 전송 클래스
	 * 생성자로 연결된 소켓을 전달 받습니다.
	 */
	
	private Socket socket;
	
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			// 사용자한테 입력받음
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			
			// 출력 스트림을 통해 연결된 소켓에 전달
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				// 사용자에게 입력받은 message
				String message = br.readLine();
				
				if(message.equals("/exit")) {
					System.out.println("연결 종료");
					break;
				} else {
					//pw가 가리키는 client측으로 메시지 전달
					pw.println(message);
					pw.flush();
				}
			}
			
			pw.close();
			br.close();
			socket.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
