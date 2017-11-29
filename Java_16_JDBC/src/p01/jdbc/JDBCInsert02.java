package p01.jdbc;
/* *
 * insert/update/delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row) 수를 리턴함.
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert02 {
	public static void main(String[] args) {
		// Connection 얻기
		Connection conn = null;

		// Statement
		Statement stmt = null;

		// 접속정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";
		
		//쿼리문
		String sql="";
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			  //입려처리
			  System.out.print("게시글 제목 입력>");
			  String title = scanner.nextLine();
			  System.out.print("게시글 내용 입력>");
			  String content = scanner.nextLine();
			  System.out.print("게시글 작성자 입력>");
			  String writer = scanner.nextLine();

			  sql = 
						 "insert into board(title,content,writer)" 
						  + " values('"+title+"','"+content+"','"+writer+"');";
						  System.out.println(sql);
			
			
			stmt = conn.createStatement();
		
			
			int result = stmt.executeUpdate(sql); //반형된 데이타의 행(row)수를 반환
			
			if(result>0) {
				System.out.println("저장이 완료되었습니다");
			}
			
			else {
				System.out.println("저장이 실패되었습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
