package p10.multiChat;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			System.out.println("서버 실행 중");
			serverSocket = new ServerSocket(5001);
			
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
