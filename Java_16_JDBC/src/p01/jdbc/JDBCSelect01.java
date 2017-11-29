package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect01 {
	public static void main(String[] args) {
		// Connection 객체 생성
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";

		// 쿼리 전송 객체
		Statement stmt = null;

		// 쿼리 결과 객체
		ResultSet rs = null;

		// 쿼리 스트링
		String sql = "select * from goods";

		try {
			// 1단계 드라이버로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2단계 DB연결
			conn = DriverManager.getConnection(url, user, password);
			// 3단계 작업
			// -1. statment객체 생성
			stmt = conn.createStatement();
			// -2. statement문 실행 및 결과 얻기
			rs = stmt.executeQuery(sql);
			// -3. 쿼리결과 다음 객체에서 자료 추출
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				int category = rs.getInt("category");
				int makercd = rs.getInt("maker_makercd");
				System.out.println("|" + id + "|" + name + "|" + category + "|" + price + "|" + makercd + "|");
			}
			System.out.println("|__________________________________|");

			// 4단계 종료 - 생성된 역순으로 객체르르 해제함
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
