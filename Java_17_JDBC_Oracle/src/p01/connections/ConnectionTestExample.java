package p01.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 1.driver로딩
// 2.connection얻기
// 3.작업
// 4.connection 종료

public class ConnectionTestExample {
	public static void main(String[] args) {
		// Connection 객체
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null)
				System.out.println("연결 성공!");
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
