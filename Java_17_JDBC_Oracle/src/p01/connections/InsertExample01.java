package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* *
 * insert문 executeUpdate();
 * */
public class InsertExample01 {

	public static void main(String[] args) {

		String sql = "insert into emp values(?,?,?,?,sysdate,?,?,?)";
		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();

		// 2. 쿼리객체
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);

			// 3. 작업
			// 바인딩 작업
			pstmt.setInt(1, 5300);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "CLERK");
			pstmt.setInt(4, 7782);
			pstmt.setInt(5, 1200);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 10);

			// Insert실행
			int result = pstmt.executeUpdate(); // 반환값은 입력된 행의 수
			if (result > 0)
				System.out.println("입력성공!");
			else
				System.out.println("입력실패!");
			// 4. 자원 해제
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
