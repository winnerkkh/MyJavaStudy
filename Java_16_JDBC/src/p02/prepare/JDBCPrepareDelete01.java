package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCPrepareDelete01 {
	public static void main(String[] args) {
		// Connection
		Connection conn = null;
		//
		PreparedStatement pstmt = null;

		// db접속 정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String username = "user11";
		String password = "rlarudgns1";
		String sql = "delete from board where no = ?";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			pstmt = conn.prepareStatement(sql);

			Scanner scanner = new Scanner(System.in);
			System.out.print("삭제할 글번호를 입력하세요>");
			int no = Integer.parseInt(scanner.next());

			System.out.print("정말로 삭제하시겠습니까?");
			char c = scanner.next().charAt(0);

			if (c == 'y' || c == 'Y') {
				pstmt.setInt(1, no);

				if (pstmt.executeUpdate() > 0)// insert/update/delete
					System.out.println("삭제 성공!");

				else
					System.out.println("삭제 실패");
			} else
				System.out.println("삭제하지 않았습니다");
		} catch (Exception e) {

		}
	}

}
