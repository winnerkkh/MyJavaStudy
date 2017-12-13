package p02_callables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

import p01.connections.Connections;

/* *
 * savepoint: commit과 commit사이의 작업 단위를 소단위로 쪼갠 트랜잭션 단위
 * */

public class SavePointExample1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement selectPs = null;
		PreparedStatement updatePs = null;
		ResultSet rs = null;
		String sql = null;
		try {
			conn = Connections.getInstance().getConnections();

			// 자동저장 기능 끄기
			conn.setAutoCommit(false);
			String sql1 = "select id, total from savepoint where total > ?";
			String sql2 = "update savepoint set total = ? where id = ?";

			// 쿼리객체 생성
			selectPs = conn.prepareStatement(sql1);
			updatePs = conn.prepareStatement(sql2);

			// 쿼리 실행
			selectPs.setInt(1, 100);
			rs = selectPs.executeQuery();

			// 첫번째 savepoint 지정
			Savepoint save1 = conn.setSavepoint();

			// 테이블 값 확인
			while (rs.next()) {
				String id = rs.getString("id");
				int oldTotal = rs.getInt("total");
				int newPrice = oldTotal * 2;
				updatePs.setInt(1, newPrice);
				updatePs.setString(2, id);
				updatePs.executeUpdate();
				System.out.println("new Total of " + oldTotal + " is " + newPrice);

				if (newPrice >= 5000) {
					conn.rollback(save1); // 첫번째 세이브 포인트 이후의 모든 작업 롤백
				}
			}
			System.out.println();
			selectPs = conn.prepareStatement(sql1);
			updatePs = conn.prepareStatement(sql2);
			selectPs.setInt(1, 100);
			rs = selectPs.executeQuery();

			// 두번째 savepoint 지정
			Savepoint save2 = conn.setSavepoint();

			while (rs.next()) {
				String id = rs.getString("id");
				int oldTotal = rs.getInt("total");
				int newPrice = oldTotal * 2;
				updatePs.setInt(1, newPrice);
				updatePs.setString(2, id);
				updatePs.executeUpdate();
				System.out.println("new Total of " + oldTotal + " is " + newPrice);

				if (newPrice >= 5000) {
					conn.rollback(save2); // 두번째 세이브 포인트 이후의 모든 작업 롤백
				}
			}
			System.out.println();
			conn.commit(); // 커밋
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, total from savepoint");
			System.out.println();
			while (rs.next()) {
				String id = rs.getString("id");
				int price = rs.getInt("total");

				System.out.println("id: " + id + ", total : " + price);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				if (rs != null)
					rs.close();
				
				if (selectPs != null)
					selectPs.close();
				
				if (updatePs != null)
					updatePs.close();
				
				if (conn != null)
					conn.close();
				
			} catch (Exception e) {
			}
		}
	}
}
