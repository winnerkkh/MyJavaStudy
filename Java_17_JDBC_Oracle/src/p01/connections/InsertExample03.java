package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* *
 * insert 문 executeUpdate();
 * */
// Ctrl + shift + F
public class InsertExample03 {
	public static void main(String[] args) {
	String sql 
	="insert into emp values(emp_seq2.nextval,?,?,?,sysdate,?,?,?)";
		ResultSet rs = null;//사번의 최고값 +1을 받는 결과객체
		// 1.연결
		Connection conn 
		        = Connections.getInstance().getConnections();
		// 2.쿼리객체
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			// 3.작업
			//바인딩 작업
			pstmt.setString(1, "임꺽정");
			pstmt.setString(2,"CLERK");
			pstmt.setInt(3,7782);
			pstmt.setInt(4,1200);
			pstmt.setInt(5,0);
			pstmt.setInt(6, 10);
			//insert실행
			int result = pstmt.executeUpdate();//반환값은 입력된 행의 수
			if(result>0)System.out.println("입력성공!");
			else
				System.out.println("입력실패!");
			// 4.자원해제
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
