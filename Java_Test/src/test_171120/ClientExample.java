package test_171120;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();// 클라이언트는 하나의 소켓만 생성
			System.out.println("[연결요청]");
			// 서버주소와 port번호로 연결요청
			socket.connect(new InetSocketAddress("192.168.10.39", 5001));
			System.out.println("[연결 성공]");
			
			
			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();// 출력객체 생성
			
			
			System.out.println("연산하시고 싶은 문자를 입력하여 주세요!ex)-, +, *, /, )");
			
			Scanner scanner = null;
			message = scanner.next();
			bytes = message.getBytes(); // String.getBytes()→문자열을 byte배열로 변환
			os.write(bytes); // 전송
			os.flush(); // 메세지 밀어내기
			
			System.out.println("첫번째 숫자를 입력해주세요!");
			message = scanner.next();
			bytes = message.getBytes(); // String.getBytes()→문자열을 byte배열로 변환
			os.write(bytes); // 전송
			os.flush(); // 메세지 밀어내기
			
			System.out.println("두번째 숫자를 입력해주세요!");
			message = scanner.next();
			bytes = message.getBytes(); // String.getBytes()→문자열을 byte배열로 변환
			os.write(bytes); // 전송
			os.flush(); // 메세지 밀어내기

			System.out.println("[데이터 보내기 성공]");
			

			
			
			
			
		} catch (Exception e) {
		}
		// 종료시 연결이 끊어지지 않으면 강제로 연결 해제
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
			}
		}

	}

}
