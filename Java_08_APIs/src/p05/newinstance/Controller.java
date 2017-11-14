package p05.newinstance;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Controller {
	static private Map<String, Action> map = new HashMap<String, Action>();

	public static void main(String[] args) {
		// command.properties의 정보를 저장할 객체 생성
		Properties props = new Properties();
		// File구분자 "/", "\\"
		File f = new File("src/p05/newinstance/command.properties");
		try {
			// file(외부객체)로 부터 정보를 입력받기 위한 통로(FileReader)
			FileReader fis = new FileReader(f);
			props.load(fis);// 입력받은 객체로 부터 property형식으로 값을 저장
			// property객체에는 키와 값으로 저장되어있고
			// 키가 중복이 되어있을수 없기 떄문에
			// 중복을 방지하는 Set에 키들만 다시 저장함.
			// Set객체는 자료를 중복저장하지 않고, 순서가 없는 저장객체

			Set KeySet = props.keySet(); // 키들만 set에 저장
			// 순서가 없는 객체를 저장한 Set에서
			// 값을 처음부터 끝까지 순화하면서 출력하기위한
			// 객체 - Iterator
			// Iterator는 객체의 처음, 현재, 다음 번지값만 저장.

			Iterator KeyItor = KeySet.iterator();

			while (KeyItor.hasNext()) { // Set에 키가 존재하는지확인 메소드 hasNext()
				String command = (String) KeyItor.next(); // 존재하는 키를 가져오는 메소드 next()
				String className = props.getProperty(command);
				Class clazz;
				clazz = Class.forName(className); // 문자열로 주어진 클래스를 메모리에 로딩
				Action action = (Action) clazz.newInstance(); // new SendAction();
				// map에 저장 put(키,값)
				map.put(command, action); // 키와 값의 형태로 자료 저장 put(키,값);

			}

			// 인스턴스 저장 작업완료
			while (true) {
				System.out.println("명령어 입력");
				Scanner scanner = new Scanner(System.in);
				String commandStr = scanner.next();
				Action action = map.get(commandStr);// 자동형변환이 아님.
				action.execute();// 재정의된 메소드 실행.
				System.out.println("계속하시겠습니까?");
				char yseNo = scanner.next().charAt(0);
				if (!(yseNo == 'y' || yseNo == 'Y'))
					break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
