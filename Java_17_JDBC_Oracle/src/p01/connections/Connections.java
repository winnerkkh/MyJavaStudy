package p01.connections;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



/* *
 * singleton:
 * 하나의 객체를 만들어서 사용후 반납하는 형태
 * 필드와 생성자를 private로 만들고
 * getInstance() 메소드를 호출하여 사용
 * */

public class Connections {
	// 필드
	private static Connections instance;

	// 생성자
	private Connections() {
	};

	// 메소드
	public static Connections getInstance() {
		if (instance == null)
			instance = new Connections();
		return instance;
	}

	// connection 객체를 반환하는 메소드
	public static Connection getConnections() {
		// Connection객체
		Connection conn = null;
		
		//프로퍼티 객체
		Properties props = new Properties();
		
		try {
			String path = Connections.class.getResource("database.properties").getPath();
			props.load(new FileReader(path)); //프로퍼티에 db정보 저장
			String driver = props.getProperty("driver"); //정보 읽기
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			
			//1. 드라이버 로딩
			Class.forName(driver);
			//2. 연결
			conn = DriverManager.getConnection(url,user,password);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
