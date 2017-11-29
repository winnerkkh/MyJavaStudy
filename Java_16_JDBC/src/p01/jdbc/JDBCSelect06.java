package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCSelect06 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Connection 객체
		Connection conn = null;

		// Statement 객체
		Statement stmt = null;

		// ResultSet 객체
		ResultSet rs=null;
		System.out.print("상품명을 입력하세요>");
		String goodsname=scanner.next();
		System.out.print("제조사명을 입력하세요");
		String makername=scanner.next();
		
		// 쿼리문
		String sql= "select goods.id  id,"
			      + " goods.name  goodsname,"
			      + " maker.name  makername,"
			      + " goods.price price,"
			      + " qty qty"
			  +" from goods,"
			   +    " maker,"
			   +   " stock"
			 +" where goods.id = stock.goods_id"
			 +  " and goods.maker_makercd = maker.makercd"
			 +  " and goods.name ='"+goodsname
			 +  "' and maker.name ='"+makername+"';"
			    ;
		Scanner scanner = new Scanner(System.in);
		try {
			// 1단계 드라이버로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2단계 DB연결
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase01", "user11", "rlarudgns1");

			
			//입력처리 
			
			// 3단계 작업
				// -1. statment객체 생성
				stmt = conn.createStatement();
				// -2. statement문 실행 및 결과 얻기
				rs = stmt.executeQuery(sql);
				// -3. 쿼리결과 다음 객체에서 자료 추출

				   while(rs.next()) {
					   int id = rs.getInt(1);
					   String name=rs.getString(2);
					   String maker= rs.getString(3);
					   int price = rs.getInt(4);
					   int qty = rs.getInt(5);
					   System.out.println(id+" "+name+" "+maker+" "+price+" "+qty);
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
