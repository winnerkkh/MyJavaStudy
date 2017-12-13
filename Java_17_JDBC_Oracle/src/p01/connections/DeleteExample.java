package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteExample {
	public static void main(String[] args) {

		String sql = "delete emp where empno > 7935";

		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();

		PreparedStatement pstmt;
		try {
			// 2. 쿼리객체 생성
			pstmt = conn.prepareStatement(sql);

			int dno = Integer.parseInt(getParameters());

			boolean ys = getYesNo(dno);
			pstmt.setInt(1, dno); //바인딩 변수 대입
			
			if (ys == true) {

				// 3. 삭제 작업
				int result = pstmt.executeUpdate(); // 삭제한 행수를 리턴

				if (result > 0) {
					System.out.println("삭제성공!");
				}

				else {
					System.out.println("삭제실패!");
				}

			}
			// 4. 자원해제
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	private static boolean getYesNo(int dno) {
		System.out.println("삭제할 사원번호는 " + dno + "부터입니다");
		System.out.println("정말 삭제하시겟습니까>");

		Scanner parameter = new Scanner(System.in);
		char c = parameter.next().charAt(0);

		if (c == 'y' || c == 'Y') {
			return true;
		}

		else
			return false;
	}

	private static String getParameters() {
		Scanner parameter = new Scanner(System.in);
		System.out.println("삭제할 사원번호를 입력하세요>");
		return parameter.next(); // 문자열값 리턴
	}
}
