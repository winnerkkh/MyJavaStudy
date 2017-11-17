package p02.readerWriter;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Windows\\Temp\\test.txt");
		Reader reader = new FileReader(f);
		
		int readerCharNo;
		char[] cbuf = new char[4]; //전체 배열
		
		readerCharNo = reader.read(cbuf, 1, 2); //index 1부터 2개의 char데이타 출력
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}
}
