package single_server;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8385);
			
			System.out.println("연결대기");
			Socket socket = serverSocket.accept();
			
			System.out.println("Welcome to My Server");
			
			// 연결된 소켓을 메시지를 전송하는 클래스에게 전달한다.
			Sender sender = new Sender(socket);
			
			// 연결된 소켓을 메시지를 수신받는 클래스한테 전달한다.
			Receive receive = new Receive(socket);
			
			
			receive.start();
			sender.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
