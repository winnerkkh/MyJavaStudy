package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/* *
 * PrepareStatement 문 은 statement문과 다르게
 * 바인딩변수를 사용함.
 * */

public class JDBCPrepareSelec03 {
	public static void main(String[] args) {
		// Connection 객체
		Connection conn = null;
		// PrepareStatement 객체
		PreparedStatement pstmt = null;
		Statement stmt = null;
		// ResultSet
		ResultSet rs = null;
		// db접속 정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";
		// 쿼리문
		// 바인딩되는 변수의 개수만큼 ?를 표시함.
		// 바인딩순서는 ? 순서
		String name="";
		String sql = "select * from board where title like ? and writer like ?";
		
		//String sql1= "select * from goods where name = '"+name+"'";
		
		try {
			// 1단계
			Class.forName("com.mysql.jdbc.Driver");
			// 2단계
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계
			pstmt = conn.prepareStatement(sql);// 접속시에 쿼리문틀을 미리만듦
			
			String title = "게" + "%";
			String writer = "홍" + "%";
			
			pstmt.setString(1, title); // 바인딩변수(?) 와 실제 변수값을 매칭시키는 작업
 			pstmt.setString(2, writer);
 			
 			
			rs = pstmt.executeQuery();// 실행시는 만들어진(실제 변수값이 바인딩된) 쿼리를 실행
			// rs=stmt.executeQuery(sql);//실행시 완성된 만들어진 쿼리를 실행
			
			while(rs.next()) {
				int id = rs.getInt(1);
				title = rs.getString(2);
				String content = rs.getString(3);
				System.out.println("글번호:"+id+" 제목:"+title+" 내용:"+content);
			}
		
			//4단계
			rs.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
