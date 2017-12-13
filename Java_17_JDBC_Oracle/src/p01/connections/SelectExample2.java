package p01.connections;
/* *
 * JDBC를 이용한 DB작업
 * 1. DRIVER로딩, 2. CONNECTION, 3.작업, 4, 자원해제
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

//emp테이블의 사번, 사원명, 급여, 입사일자, 부서명
//부서번호가 10번인 부서의 사원들
public class SelectExample2 {
	public static void main(String[] args) {
		//
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		// 쿼리객체
		PreparedStatement pstmt = null; //preparestatement 바인딩 변수 ?

		// 결과 set객체
		ResultSet rs = null;

		// 쿼리문
		String sql = "select empno," + 
			     "           ename," + 
			     "             sal," + 
			     "        hiredate," + 
			     "    d.dname dname" + 
			     "      from emp e," + 
			     "           dept d" + 
			     " where e.deptno = d.deptno" +
			     "   and e.deptno = ?" ; //바인딩변수 하나(index=1)
			     
		//? ; //

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결
			conn = DriverManager.getConnection(url, user, password);

			// 3.작업
			System.out.println("sql=" + sql);
			pstmt = conn.prepareStatement(sql);
			
			// 바인딩변수에 값 지정
			pstmt.setInt(1, 10); //쿼리문에서 ?로 표시된 부분에 값을 대입
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				double sal = rs.getDouble(3);
				Date hiredate = rs.getDate(4);
				String dname = rs.getString(5);
				System.out.println(no+":"+name+":"+sal+":"+hiredate+":"+dname);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
