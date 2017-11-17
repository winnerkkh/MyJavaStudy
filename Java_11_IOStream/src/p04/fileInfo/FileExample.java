package p04.fileInfo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* *
 * File클래스 - 파일의 정보를 저장하거나 파일 조작하는 클래스
 * */
public class FileExample {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Windows\\Temp\\DIR"); // 모두 파일로 간주
		File file1 = new File("C:\\Windows\\Temp\\file1.txt");
		File file2 = new File("C:\\Windows\\Temp\\file2.txt");

		if (dir.exists() == false) {
			dir.mkdirs(); // 파일생성(디렉토리 생성)
		}

		if (file1.exists() == false) { // 파일1이 존재하지 않는다면
			file1.createNewFile();
		}

		if (file2.exists() == false) { // 파일2가 존재하지 않는다면
			file2.createNewFile();
		}

		File temp = new File("C:\\Windows\\Temp\\"); // temp디렉터리의 정보 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   aa  HH:mm");
		File[] contents = temp.listFiles(); // 파일이디렉토리면 안의 파일 리스트를 출력

		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			// 최종 수정정보 출력 메소드 -lastModified()
			if (file.isDirectory()) { // 디렉토리이면
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			}

			else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());//
			}
			System.out.println();
		}

	}

}
