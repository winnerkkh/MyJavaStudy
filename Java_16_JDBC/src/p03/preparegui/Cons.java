package p03.preparegui;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/* *
 * singletone
 * - 필드와 생성자를 private으로 선언하여 외부접근을 막고
 * - 객체를 public접근자의 getInstance()메소드로 제공 후
 * - 다시 반환 받는 방식
 * - 객체의 데이타 정합성.
 * */
public class Cons {
	// 필드
	private static Cons instance;

	// 생성자
	private Cons() {
	}

	// 메소드
	public static Cons getInstance() {
		// 객체가 안만들어져있으면 생성하여 제공함
		if (instance == null) {
			instance = new Cons();
		}
		return instance;
	}

	// 연결 객체 반환 메소드
	public Connection getConnection() {

		// 연결 객체
		Connection conn = null;

		// 프로퍼티 객체 - 키와 값이 문자열로 한정된 map구조
		Properties props = new Properties();
		
		// 상대경로로 파일 읽기
		String path = Cons.class.getResource("database.properties").getPath();
		try {
			props.load(new FileReader(path));// 상대 경로로부터 자료 읽기
			String driver = props.getProperty("driver");
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			System.out.println("driver"+driver);
			System.out.println("url"+url);
			System.out.println("user"+user);
			System.out.println("password"+password);
			
			// 드라이버 로딩
			Class.forName(driver);
			// 연결 얻기
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {// 예외발생 처리
			System.out.println(e.getMessage());
		}
		return conn;//연결객체 반환
	}
}
