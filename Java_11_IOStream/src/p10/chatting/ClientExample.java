package p10.chatting;
import java.net.Socket;

/* *
 * MultiThread방식의 Client 
 * 	- SenderThread와 ReceiveThread중 하나라도
 *    실행중이면 main메소드는 종료되지 않음.
 *  - 서버와 클라이언트간이 통신은 소켓간의 통신
 * */

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("localHost", 5003); //소켓생성(ip주소, port)
			Thread th1 = new SenderThread(socket);
			Thread th2 = new ReceiverThread(socket);
			
			th1.start();
			th2.start();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
