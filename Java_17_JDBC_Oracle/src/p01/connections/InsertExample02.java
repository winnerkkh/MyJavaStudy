package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* *
 * insert 문 executeUpdate();
 * */
// Ctrl + shift + F
public class InsertExample02 {
	public static void main(String[] args) {
		String sql = "insert into emp values(?,?,?,?,sysdate,?,?,?)";
		String sql2 = "select max(empno)+1 from emp";
		ResultSet rs = null;//사번의 최고값 +1을 받는 결과객체
		// 1.연결
		Connection conn 
		        = Connections.getInstance().getConnections();
		// 2.쿼리객체
		PreparedStatement pstmt;
		try {
			//select문도 같은 connection
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			int maxSeq = 0;
			if(rs.next())
				maxSeq = rs.getInt(1);
			//insert문도 같은 connection
			pstmt = conn.prepareStatement(sql);
			// 3.작업
			//바인딩 작업
			pstmt.setInt(1,maxSeq );
			pstmt.setString(2, "일지매");
			pstmt.setString(3,"CLERK");
			pstmt.setInt(4,7782);
			pstmt.setInt(5,1200);
			pstmt.setInt(6,0);
			pstmt.setInt(7, 10);
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
