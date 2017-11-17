package p04.fileInfo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\Windows\\Temp\\Origin\\forest.jpg";
		String targetFileName = "C:\\Windows\\Temp\\Target\\forest.jpg";

		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();// 출력 먼저닫음
		fis.close();// 입력 나중에 닫음
		System.out.println("복사 완료!");
	}
}
