package p09.data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* *
 * 서버 - 자료를 제공하는 객체
 * 	- 서버는 ServerSocket을 가진다.
 * */
public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버소켓 객체 선언
		try {
			serverSocket = new ServerSocket();// 서버소켓 객체 생성

			// 서버소켓의 주소 및 port번호 세팅
			serverSocket.bind(new InetSocketAddress("localhost", 5001));

			while (true) {
				System.out.println("[연결기다림]");
				Socket socket = serverSocket.accept(); // 요청이 들어오면 accept()메소드로소켓 생성

				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); // 요청이 들어온 client의 주소정보를
																								// 얻어옴
				System.out.println("[연결수락함]" + isa.getHostName());
				System.out.println("----연결 완료----");

				byte[] bytes = null; // byte단위의 메세지 저장용 배열
				String message = null;

				InputStream is = socket.getInputStream(); // socket으로 들어오는 스트림 얻기
				bytes = new byte[100]; // byte단위의 값을 읽어들임
				int readByteCnt = is.read(bytes);// 읽어들이만큼 배열에 저장후 저장된 갯수 readByteCnt에 대입
				message = new String(bytes, 0, readByteCnt);//
				System.out.println("[데이타 받기 성공]:" + message);

				// -------------------전송받은 메세지 출력 완료--------------//

				OutputStream os = socket.getOutputStream();// 출력
				message = "Hello Client";
				bytes = message.getBytes(); // Sring.getBytest() --> 문자열을 byte배열로 변환
				os.write(bytes);// 전송
				os.flush();// 메세지 밀어내기
				System.out.println("[데이터 보내기 성공]");

				is.close();
				os.close();
				socket.close(); // 소켓 종료
			}
		} catch (Exception e) {
		}
		// 서버소켓 종료시 클라이언트와 연결이 있으면 연결을 끊은 후 종료
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();

			} catch (IOException e) {
			}

		}
	}
}
