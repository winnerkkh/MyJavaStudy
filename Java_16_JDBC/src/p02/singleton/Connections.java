package p02.singleton;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import p01.jdbc.JDBCDelete;
/* *
 * 하나의 객체를 공유하며 사용,
 * 데이타 접속의 일관성 유지
 * Connection conn1 = DriverManager.getConnection();
 * Connection conn2 = DriverManager.getConnection();
 * */
public class Connections {
	
	// 필드 - private static 자신타입 필드명;
	private static Connections instance;
	
	// 생성자 - private 생성자
	private Connections() {}
	
	// 메소드 - public static 자신타입 getInstance(){}
	
	public static Connections getInstance() {
		if (instance == null)
			instance = new Connections();
		return instance;
	}

	public Connection getConnection() {
		Connection conn = null;
		// Statement
		Statement stmt = null;
		// ResultSet
		ResultSet rs = null;
		// 프로퍼티 객체 생성
		Properties props = new Properties();
		// 파일의 상대 경로
		String path = Connections.class.getResource("database.properties").getPath();
		try {
			props.load(new FileReader(path)); //프로퍼티에 db정보 저장
			String driver = props.getProperty("driver"); //정보 읽기
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if(conn==null)System.out.println("오류");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn; //connection객체를 반환
	}
}
