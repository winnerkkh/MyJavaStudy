package p02_callables;

import java.sql.Connection;
import java.sql.PreparedStatement;

import p01.connections.Connections;

/* *
 * autocommit옵션을 false로 하여 자동 저장을
 * 못하게 한후 입력/수정 처리가 정상으로 끝나면 commit;
 * 입력/수정 처리가 하나라도 이상이 있으면 rollback;
 * */
public class TransactionExample {
	public static void main(String[] args) {
		// 1. 연결
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean success = false;

		try {
			conn = Connections.getInstance().getConnections();
			String sql = "Create table test1(id varchar(10), password varchar(10))";
				
		// 2. 쿼리문 생성
		// 3. transaction작업
			
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			//자동저장 기능 끄기
			conn.setAutoCommit(false);
			
		    sql = "insert into test1 values('sh1011','1111')";
		    pstmt = conn.prepareStatement(sql);
		    pstmt.executeUpdate();
		    
		    sql = "insert into test1 values('sh2011','2222')";
		    pstmt = conn.prepareStatement(sql);
		    pstmt.executeUpdate();
		    
		    sql = "insert into test1 values('sh1033','3333')"; //비정상 쿼리문
		    pstmt = conn.prepareStatement(sql);
		    pstmt.executeUpdate();
					
		success = true;
		// 4. 자원해제
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(success) {
					conn.commit();
				}
				
				else {
					conn.rollback();
				}
				
				if(pstmt !=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {
				
			}
			
		}
	}

}
