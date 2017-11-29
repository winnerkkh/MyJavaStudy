package p01.jdbc;

/* *
 * 글번만 입력받고 해당글번호의 readcount와 favor를 1씩 증가시킨 후 결과 출력
 * */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCUpdate02 {
	public static void main(String[] args) {
		//connection 개체
		Connection conn = null;
		
		//쿼리 객체
		Statement stmt = null;
		
		//ResultSet 객체
		ResultSet rs = null;

		
		// 접속정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";
		int count =0, fcount=0, no=0;
		
		// 쿼리문
		String sql = "";
		System.out.println("sql="+sql);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
	
			// 입력
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("글번호>");
			no = scanner.nextInt();
			sql = "update board set readcount = readcount+1, favor= favor+1 where no = " + no;
			
			//update
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql); //반영된 행의수 반환
			
			if(result>0) {
				System.out.println("수정 완료!");
				rs = stmt.executeQuery("select * from board where no="+no);
				if(rs.next()) {
					System.out.println(rs.getInt(1)+ rs.getInt(2) + rs.getInt(3) + rs.getInt(4));
				}
			}
			
			else {
				System.out.println("수정 실패!");
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
}
