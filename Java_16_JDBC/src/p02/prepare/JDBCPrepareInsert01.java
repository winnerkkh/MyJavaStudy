package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/* *
 * PrepareStatement문은 바인딩 변수를 미리 만들어서
 * 실행시 바인딩된 실제값으로 된 쿼리문을 실행함.
 * */

public class JDBCPrepareInsert01 {
	public static void main(String[] args) {

		// Connection 객체
		Connection conn = null;

		// PreparedStatement문
		PreparedStatement pstmt = null;

		Statement stmt = null;
		// db접속 정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user11";
		String password = "rlarudgns1";

		// preparedstate문일경우
		String sql = "insert into goods(id, name, price, category,maker_makercd)" + "values(?, ?, ?, ?, ?);";

		// 일반 statement일경우
		/*
		 * int id=0,price=0,cate=0,cd=0; String name=""; String sql2 =
		 * "insert into goods(id,name,price,category,maker_makercd) " +
		 * "values("+id+",'"+name+"',"+price+","+cate+"m"+cd;
		 */

		try {
			// 1단계
			Class.forName("com.mysql.jdbc.Driver");

			// 2단계
			conn = DriverManager.getConnection(url, user, password);

			// 3단계
			pstmt = conn.prepareStatement(sql); // (1)쿼리문장 들이 생성됨.
	// 		stmt = conn.createStatement(); //쿼리문 없이 쿼리저장객체만 생성
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("값 입력");
			System.out.print("상품코드>");
			int id = scanner.nextInt();
			
			System.out.print("상품명>");
			String name= scanner.next();
			
			System.out.print("가격>");
			int price = scanner.nextInt();
			
			System.out.print("카테고리>");
			int category = scanner.nextInt();

			System.out.print("제조사코드>");
			int cd = scanner.nextInt();
			
			//(2)
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setInt(4, category);
			pstmt.setInt(5, cd);

			int result = pstmt.executeUpdate(); // (3) 실행한 행(row)수를 반환함
			
			System.out.println("입력된 행(row)의 수" + result);

			if (result > 0) {
				System.out.println("입력 성공");
			}

			else {
				System.out.println("입력 실패");
			}

	// 		stmt.executeUpdate(sql);//쿼리문으로 실행
			
			// 4단계 종료
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
