package p10.chatting;

import java.net.ServerSocket;
import java.net.Socket;

/* *
 * 서버는 SErverSocket을 가짐
 * 	ServerSocket을 생성
 * */
public class ServerExample {
	public static void main(String[] args) {
		// 소켓 생성
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(5003);// port번호5001로 서버소켓 생성
			socket = serverSocket.accept();// 소켓생성 메소드 accept();
			Thread th1 = new SenderThread(socket);
			Thread th2 = new ReceiverThread(socket);
			th1.start();
			th2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {// 서버 종료시 소켓을 해제
			try {
				serverSocket.close();
			} catch (Exception e) {
			}
		}
	}
}
