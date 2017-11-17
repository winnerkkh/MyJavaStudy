package p02.readerWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ReaderWriterExample {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Windows\\Temp\\test1.txt");
		Writer writer = new FileWriter(f); //출력스트림 생성
		Reader reader = new FileReader(f); //입력스트림 생성

		System.out.println("문구를 입력해 주세요!");

		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine(); //값 입력

		writer.write(data); //파일에 기록
		writer.flush(); // 스트
		writer.close(); //스트림 해제

		int readerCharNo;

		/*
		 * char[] cbuf = new char[10];
		 * 
		 * readerCharNo = reader.read(cbuf); for(int i=0; i<cbuf.length; i++) {
		 * System.out.print(cbuf[i]); } reader.close();
		 */

		while (true) {
			readerCharNo = reader.read(); //읽은 데이타 저장후 길이 저장 
			if (readerCharNo == -1) { //읽은 데이타가 없으면 종료
				break;
			}
			System.out.print((char) readerCharNo);  //문자열 객체 생성
		}
		reader.close();

	}
}