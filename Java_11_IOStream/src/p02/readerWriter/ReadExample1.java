package p02.readerWriter;
import java.io.FileReader;
import java.io.Reader;
/* *
 * 문자단위의 입출력 스트림 - Reader/Writer
 * */
public class ReadExample1 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:\\Windows\\Temp\\test.txt");
		int readData;
		while(true) {
			readData = reader.read();//char ->int에 저장
			if(readData == -1) break;
			System.out.print((char)readData); //int -> char로 변환 출력
		}
		reader.close();
	}
}
