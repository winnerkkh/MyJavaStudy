package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/* *
 * update
 * */

public class UpdateExample01 {
	public static void main(String[] args) {
		
		// 쿼리문
		String sql = "update emp set sal = sal+sal*0.05 where deptno = ?";
		
		// 1.연결
		Connection conn = Connections.getInstance().getConnections();
		
		// 2.쿼리객체 생성
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			
			Scanner getParameter = new Scanner(System.in);
			System.out.print("부서 코드를 입력하세요>");
			int dno = getParameter.nextInt();
			
			pstmt.setInt(1, dno);
			
		
			
			// 3.update작업
			int result = pstmt.executeUpdate();
			System.out.println("수정한 건수:" + result);
			
			if(result>0) { //업데이트된 행의 수를 반환
				System.out.println("수정 성공!");
			}
			
			else
				System.out.println("수정 실패!");
			
			// 4.자원해제
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
