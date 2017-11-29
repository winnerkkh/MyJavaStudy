package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest01 {
	public static void main(String[] args) throws SQLException {
		// 연결객체 생성
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1단계
			conn = DriverManager.getConnection( // 2단계
					url, user, password);
			System.out.println("데이타베이스에 접속했습니다"); //3단계 - 작업완료
			conn.close(); // 4단계  - 연결해제
			System.out.println("접속을 종료 합니다");
			
		} catch (ClassNotFoundException cbfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
			
		}catch(SQLException se) {
			System.out.println(se.getMessage()); //sql 오류 메세지
		}

	}
}
