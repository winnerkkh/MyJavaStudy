package p02.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingletonJDBCPrepareSelect01 {
	public static void main(String[] args) {
		// PrepareStatement
		PreparedStatement pstmt = null;

		// ResultSet
		ResultSet rs = null;

		// Connection
		Connection conn = null;
		try {
			conn = Connections.getInstance().getConnection();
			pstmt = conn.prepareStatement("select no, name from member where flag != 'n'");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("회원번호:" + no + " 회원명:" + name);
			}
			
		//자원해제
			rs.close();
			conn.close();

		} catch (Exception e) {
			System.out.println();
		}
	}
}
