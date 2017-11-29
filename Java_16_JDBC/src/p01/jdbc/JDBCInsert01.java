package p01.jdbc;
/* *
 * insert/update/delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row) 수를 리턴함.
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert01 {
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
			  System.out.print("상품코드입력>");
			  int code = scanner.nextInt();
			  System.out.print("상품명입력>");
			  String name = scanner.next();
			  System.out.print("가격입력>");
			  int price = scanner.nextInt();
			  System.out.print("카테고리입력>");
			  int category = scanner.nextInt();
			  System.out.print("maker코드입력>");
			  int makercd = scanner.nextInt();
			  sql = 
						 "insert into goods(id,name,price,category,maker_makercd)" 
						  + " values("+code+",'"+name+"',"+price+","+category+","+makercd+");";
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
