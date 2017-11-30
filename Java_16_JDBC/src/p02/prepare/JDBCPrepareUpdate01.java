package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCPrepareUpdate01 {
	public static void main(String[] args) {
		
		//Connection 객체
		Connection conn = null;
		
		//preparedStatement 객체
		PreparedStatement pstmt =null;
		
		
		// db접속 정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String username = "user11";
		String password = "rlarudgns1";
		
		//쿼리문
		String sql = "update goods set name = ? , price = ? where id =?;";  //=>바인딩 변수 3개
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			pstmt = conn.prepareStatement(sql);
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("변경할 상품명?>");
			String name = scanner.next();
			
			System.out.print("변경할 가격?>");
			int price = Integer.parseInt(scanner.next());
			
			System.out.print("변경할 상품코드?>");
			int id = Integer.parseInt(scanner.next());
			
			int i = 0;
			
			pstmt.setString(++i, name);
			pstmt.setInt(++i,  price);
			pstmt.setInt(++i, id);
						
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("수정 성공");
			}
			
			else {
				System.out.println("수정 실패");
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
