package p01.inputOutputStream;
import java.io.FileNotFoundException;
/* *
 * OuputStream - byte단위 출력스트림
 *             - write()
 * */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:\\Windows\\Temp\\test.txt");
			String str = "ABC";
			byte[] data = str.getBytes();//[A][B][C]
			for(int i=0;i<data.length;i++) {
				os.write(data[i]);//1byte를 파일에 기록하는 메소드
			}
			os.flush();//스트림내의 자료 밀어내는 메소드
			os.close();//스트림해제 메소드
		} catch (Exception e) {
		  System.out.println(e.getMessage());
		}	
	}
}
