package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCSelect05 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Connection 객체
		Connection conn = null;

		// Statement 객체
		Statement stmt = null;

		// ResultSet 객체
		ResultSet rs=null;
		System.out.print("값을 입력하세요>");
		int goodsid=scanner.nextInt();
		
		
		// 쿼리문
		String sql="select * from goods where id="+goodsid;
		System.out.println(sql);
						
		
		try {
			// 1단계 드라이버로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2단계 DB연결
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase01", "user11", "rlarudgns1");

			// 3단계 작업
				// -1. statment객체 생성
				stmt = conn.createStatement();
				// -2. statement문 실행 및 결과 얻기
				rs = stmt.executeQuery(sql);
				// -3. 쿼리결과 다음 객체에서 자료 추출
/*				while (rs.next()) {
					int id = rs.getInt("id");
					String name=rs.getString("name");
					String maker_makercd = rs.getString("maker_makercd");
					int price = rs.getInt("price");
				    int category = rs.getInt("category");
					System.out.println(id+" "+name+" "+maker_makercd+" "+price+" "+category);
				}*/
					
					//getInt("칼럼명") => getInt(1), getString(2)
					// 숫자를 넣어주면 테이블의 왼쪽부터 시작하는 순서로 기준으로 값을 가져올수 잇다
				   while(rs.next()) {
					   int id = rs.getInt(1);
					   String name=rs.getString(2);
					   String maker_makercd = rs.getString(3);
					   int price = rs.getInt(4);
					   int category = rs.getInt(5);
					   System.out.println(id+" "+name+" "+maker_makercd+" "+price+" "+category);
				   }
				
				
				
			// 4단계 종료 - 생성된 역순으로 객체르르 해제함
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
