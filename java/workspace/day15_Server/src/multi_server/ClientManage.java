package multi_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManage extends Thread{
	private Socket socket;
//	private int id;
	private String userId;
	
	public ClientManage(Socket socket) {
		this.socket = socket;
//		this.id = id;
	}
	
	@Override
	public void run() {
		// 클라이언트로부터 받아온 입력스트림을 받는다.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			
			while(true) {
				String message = br.readLine();
				
				//1. message가 null인 경우 연결이 끊어졌다는 의미
				if(message == null) {
					System.out.println(this.userId + "님이 퇴장했습니다.");
					// 연결된 모든 소켓에 메시지를 전달.
					for(int i = 0; i < MainServer.pws.size(); i++) {
						PrintWriter pw = MainServer.pws.get(i);
						pw.println(this.userId + "님이 퇴장했습니다.");
						pw.flush();
					}
					break; // 현재 클라이언트와 연결된 스레드가 종료.
				} 
				
				//2. 넘어온 메시지가 id인지 확인하는 부분
				String[] split = message.split(":", 2);
				if(split.length == 2 && split[0].equals("ID")) {
					this.userId = split[1];
					System.out.println(this.userId + "님이 입장했습니다.");
					
					// 연결된 모든 소켓에 메시지를 전달.
					for(int i = 0; i < MainServer.pws.size(); i++) {
						PrintWriter pw = MainServer.pws.get(i);
						pw.println(this.userId + "님이 입장했습니다.");
						pw.flush();
					}
					continue;
				}
				
				/*
				 *  message가 null도 아니고, id를 넘겨준 형태가 아니라면 
				 *  일반 메시지를 모든 소켓에 전달
				 */
				for(int i = 0; i < MainServer.pws.size(); i++) {
					PrintWriter pw = MainServer.pws.get(i);
					pw.println(this.userId + ">" + message);
					pw.flush();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 종료시점에 실행되는  finally문
			try {
				MainServer.pws.remove(new PrintWriter(socket.getOutputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
