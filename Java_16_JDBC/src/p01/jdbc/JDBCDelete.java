package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDelete {
	public static void main(String[] args) {
		// Connection 객체 생성
		Connection conn = null;

		// Statement 객체생성
		Statement stmt = null;

		// ResultSet 객체 생성
		ResultSet rs = null;

		// 쿼리문
		int no = 0;
		String sql = " ";

		// 접속정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();

			// scanner 입력
			Scanner scanner = new Scanner(System.in);
			System.out.print("삭제할 글번호를 입력하세요>");
			no = scanner.nextInt();

			System.out.println("정말로 삭제를 원하십니가?");

			if (scanner.next().charAt(0) == 'y' || scanner.next().charAt(0) == 'Y') {

				sql = "delete from board where no = " + no;
				int result = stmt.executeUpdate(sql); // 삭제된 행을 리턴

				if (result > 0) {
					System.out.println("삭제 성공!");
					rs = stmt.executeQuery("select * from board"); // /전체 select

					while (rs.next()) {
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+ rs.getString(3));
					}
				} else {
					System.out.println("삭제 실패!");
				}

				rs.close();
				stmt.close();
				conn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
