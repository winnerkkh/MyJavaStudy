package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelect02 {
	public static void main(String[] args) {
		// Connection 객체
		Connection conn = null;

		// Statement 객체
		Statement stmt = null;

		// ResultSet 객체
		ResultSet rs = null;

		// 쿼리문
		String sql="select goods.id  id," + 
				   "       goods.name  goodsname," + 
				   "       maker.name  makername," + 
				   "          goods.price price," + 
				   "          qty qty" + 
				   "     from goods," + 
				   "          maker," + 
				   "	      stock"  + 
				   " where goods.id = stock.goods_id" + 
				   "   and goods.maker_makercd = maker.makercd" + 
				   " ;";
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
				while (rs.next()) {
					int id = rs.getInt("id");
					String name=rs.getString("goodsname");
					String makername = rs.getString("makername");
					int price = rs.getInt("price");
				    int qty = rs.getInt("qty");
					System.out.println(id+" "+name+" "+makername+" "+price+" "+qty);
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
