package p01.inputOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:\\Windows\\Temp\\test.txt");
			String str = "DEF";
			byte[] data = str.getBytes();
			os.write(data);// byte타입의 배열전체를 write하는 메소드
			os.flush(); //스트림에 남아있는 데이타 밀어내기
			os.close(); //스트림 해제
			
			os = new FileOutputStream("C:\\Windows\\Temp\\test.txt");
			os.write(data, 1, 2); //배열의 일부만 기록하는 메소드 write();
			os.flush();
			os.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
