package multi_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;

public class ClientManage extends Thread{
	private Socket socket;
	private String userId;
	private Iterator<String> ir;

	public ClientManage(Socket socket) {
		this.socket = socket;
		userId = null;
	}

	@Override
	public void run() {
		// 클라이언트로부터 받아온 입력스트림을 받는다.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			while(true) {
				String message = br.readLine();
				//1. message가 null인 경우 연결이 끊어졌다는 의미
				//2. 넘어온 메시지가 id인지 확인하는 부분
				String[] split = message.split(":", 2);
				if(split.length == 2 && split[0].equals("ID")) {

					// id가 중복된 경우
					if(MainServer.clients.containsKey(split[1])) {
						String idErrorMessage = "동일한 아이디가 존재합니다.\n";
						socket.getOutputStream().write(idErrorMessage.getBytes());
						socket.close();
						break;
					}

					this.userId = split[1];

					// 연결된 모든 소켓에 메시지를 전달.
					ir = MainServer.clients.keySet().iterator();					
					while(ir.hasNext()) {
						PrintWriter pw = MainServer.clients.get(ir.next());
						pw.println(this.userId + "님이 입장했습니다.");
						pw.flush();
					}
					System.out.println(this.userId + "님이 입장했습니다.");					
					MainServer.clients.put(userId, new PrintWriter(socket.getOutputStream()));
					continue;
				}

				/*
				 * 귓속말인경우
				 */
				split = message.split(" ", 3);
				if(split[0].equals("/w") && MainServer.clients.containsKey(split[1]) && split[1] != this.userId) {
					PrintWriter pw = MainServer.clients.get(split[1]);
					pw.println(this.userId + "님의 귓속말입니다.");

					message = split[2];
//					message = message.split(split[0] + " " + split[1] + " ")[1];
					pw.println(this.userId + ">" + message);
					pw.flush();
					continue;
				}

				/*
				 *  message가 null도 아니고, id를 넘겨준 형태가 아니라면 
				 *  일반 메시지를 모든 소켓에 전달
				 */
				ir = MainServer.clients.keySet().iterator();					
				while(ir.hasNext()) {
					PrintWriter pw = MainServer.clients.get(ir.next());
					pw.println(this.userId + ">" + message);
					pw.flush();
				}
			}

		} catch(SocketException e) {
			// 유저가 나간경우
			if(MainServer.clients.containsKey(this.userId)) {
				// 연결된 모든 소켓에 메시지를 전달.
				ir = MainServer.clients.keySet().iterator();					
				while(ir.hasNext()) {
					PrintWriter pw = MainServer.clients.get(ir.next());
					pw.println(this.userId + "님이 퇴장했습니다.");
					pw.flush();
				}
				System.out.println(this.userId + "님이 퇴장했습니다.");
			}
		}
		catch (Exception e) {
			//e.printStackTrace();
		} finally {
			// 종료시점에 실행되는  finally문
			if(MainServer.clients.containsKey(this.userId)) {
				MainServer.clients.get(this.userId).close();
				MainServer.clients.remove(this.userId);
			}
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
