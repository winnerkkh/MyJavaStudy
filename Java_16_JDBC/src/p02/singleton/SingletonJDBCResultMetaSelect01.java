package p02.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/* *
 * MetaData - 실제 Data의 정보(타입, 길이 등의 정보)를 가진 데이타
 * */
public class SingletonJDBCResultMetaSelect01 {
	public static void main(String[] args) {
		// Connection객체
		Connection conn = null;

		// Statement 객체
		Statement stmt = null;

		ResultSet rs = null;
		ResultSetMetaData rsmt = null;
		try {
			conn = Connections.getInstance().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from goods");
			rsmt = rs.getMetaData();
			/* * 메타데이타를 이용한 헤드 출력용도로 메타데이타 사용 * */
			for(int i=1;i<rsmt.getColumnCount();i++) {
				System.out.print(rsmt.getColumnName(i)+"\t");	
			}
			System.out.println();
			while(rs.next()) {
				int i=0;
				System.out.println(rs.getInt(++i)+"\t"+
					               rs.getString(++i)+"\t"+
					               rs.getInt(++i)+"\t");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
