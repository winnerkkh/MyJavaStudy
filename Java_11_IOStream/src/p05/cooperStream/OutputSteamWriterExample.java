package p05.cooperStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* *
 *  char타입의 데이타를 byte타입의 데이타로 저장
 *   -OutputStreamWriter
 * */

public class OutputSteamWriterExample {
	public static void main(String[] args) {
		File f = new File("C:\\Windows\\Temp\\file9.txt");
		FileOutputStream fos;// byte단위의 출력스트림
		Writer writer;// char단위의 출력스트림

		try {

			fos = new FileOutputStream(f);
			writer = new OutputStreamWriter(fos);// char단위의데이타스트림을 byte단위의 스트림으로 변환하는 보조스트림객체
			String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
			writer.write(data); // 문자열(즉, char배열을 write()매소드의 값으로 전달)

			writer.flush(); // 스트림에 남아있을 데이타를 밀어냄
			writer.close(); // 스트림 자원 해제
			System.out.println("파일 저장이 끝났습니다.");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
