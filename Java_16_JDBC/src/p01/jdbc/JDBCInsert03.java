package p01.jdbc;
/* *
 * insert/update/delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row) 수를 리턴함.
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert03 {
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
		String maxValueQuery = "select max(no) from board;"; //글번호 최대값
		int maxNo = 0;
		String sq12 = "";
		
		ResultSet rs = null; //최대글번호,쿼리 결과
		
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			   
			  //게시글 최대번호
			 stmt = conn.createStatement();
			 rs = stmt.executeQuery(maxValueQuery);
			 
			 if(rs.next()) {
				 maxNo = rs.getInt(1)+1;
				 sq12="select * from board where no = "+maxNo;
			 }
			//rs.close();//
			
			  //입려처리
			  System.out.print("게시글 제목 입력>");
			  String title = scanner.nextLine();
			  System.out.print("게시글 내용 입력>");
			  String content = scanner.nextLine();
			  System.out.print("게시글 작성자 입력>");
			  String writer = scanner.nextLine();

			  sql = 
						 "insert into board(no, title, content, writer)" 
						  + " values("+maxNo+",'"+title+"','"+content+"','"+writer+"');";
						  System.out.println(sql);
			
			
			stmt = conn.createStatement();
		
			
			int result = stmt.executeUpdate(sql); //변형된 데이타의 행(row)수를 반환
			
			if(result>0) {
				System.out.println("저장이 완료되었습니다");
				rs = stmt.executeQuery(sq12); // 쿼리 결과는 한건
				rs.next(); // <-- 시작이 0부터
				System.out.println("글번호 제목 내용 작성자 ");
				System.out.println(rs.getInt(1)+" " + rs.getString(2) + " " +rs.getString(3) + " " + rs.getString(4));
			}
			
			else {
				System.out.println("저장이 실패되었습니다.");
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
