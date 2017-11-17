package p01.inputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* *
 * InputStream - byte단위의 데이타 입출력
 * */
public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\Temp\\test.txt");
			int readByte;
			while(true) {
				readByte = is.read();//한 byte를 읽어서 리턴
				if(readByte == -1) { //read()메소드로 값을 읽어들이지 못하면 -1을 리턴한다
					break;
				}
				System.out.println((char)readByte); //int타입의 값 ->char타입으로 casting
			}
			is.close(); //Stream 해제(자원해제)
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
