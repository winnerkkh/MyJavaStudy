package p02.readerWriter;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\Windows\\Temp\\test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while (true) { //무한반복

			readCharNo = reader.read(cbuf); //읽은 문자의 갯수만큼 리턴
			if (readCharNo == -1) { //읽어들일 내용이 없으면 -1
				break; 
			}
			
			data += new String(cbuf, 0, readCharNo);//
		}
		System.out.println(data); // 만들어진 문자열 출력
		reader.close();
	}

}
