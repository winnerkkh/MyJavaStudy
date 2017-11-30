package p02.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/* *
 * scrollable ResultSet 
 * - 쿼리의 결과를 위/아래 커서를 이동하여 출력할수있는 객체
 * */
public class SingletonJDBCPrepareSelect02 {
	public static void main(String[] args) {
		// PrepareStatement
		PreparedStatement pstmt = null;
		// Connection
		Connection conn = null;
		// ResultSet
		ResultSet rs = null;
		try {
			conn = Connections.getInstance().getConnection();
			String sql = "select * from goods";
			pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			
			System.out.println("next()-----------");
			while (rs.next()) {
				System.out.println("no:" + rs.getInt(1) + ",name:" + rs.getString(2) + ",price:" + rs.getInt(3));
			}
			
			System.out.println("previous()----------");
			while (rs.previous()) {// 역순 출력
				System.out.println("no:" + rs.getInt(1) + ",name:" + rs.getString(2) + ",price:" + rs.getInt(3));
			}
			
			System.out.println("first()-----------");
			rs.first();
			System.out.println("no:" + rs.getInt(1) + ",name:" + rs.getString(2) + ",price" + rs.getInt(3));
			
			System.out.println("last()------------");
			rs.last();
			System.out.println("no:" + rs.getInt(1) + ",name:" + rs.getString(2) + ",price:" + rs.getInt(3));
			
			System.out.println("absolute(n)---------");
			rs.absolute(5);
			System.out.println("no:" + rs.getInt(1) + ",name:" + rs.getString(2) + ",price:" + rs.getInt(3));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
