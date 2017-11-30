package p02.prepare;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import p01.jdbc.JDBCDelete;

public class JDBCPrepareDelete02 {
	
	public static void main(String[] args) {
		//Connection 객체
		Connection conn = null;
		
		//Statement 객체
		PreparedStatement pstmt = null;
		
		//ResultSet
		ResultSet rs = null;
		
		//쿼리
		String sql = "update member set flag = 'n' where no = ?";
		
		//프로퍼티 객체 생성
		Properties props = new Properties();
		
		// 파일의 상대 경로
		String path = JDBCDelete.class.getResource("database.properties").getPath();
		
		try {
			//프로퍼티에 db접속정보 저장
			props.load(new FileReader(path));
			
			String driver = props.getProperty("driver");
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			
			//밸류가 정확히 들어갔는지 확인
			System.out.println("driver= " + driver);
			System.out.println("url= " + url);
			System.out.println("user= " + user);
			System.out.println("[asswprd= " + password);
			
			//1단계
			Class.forName(driver);
			
			//2단계
			conn = DriverManager.getConnection(url, user, password);
			pstmt= conn.prepareStatement(sql); //쿼리 객체 생성
			
			//3단계
			Scanner scanner = new Scanner(System.in);
			System.out.println("탈퇴회원번호 입력");
			
			int no = scanner.nextInt();
			pstmt.setInt(1, no);
	
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("탈퇴 완료!");
			}
			
			else {
				System.out.println("탈퇴 오류!");
			}
			
			//4단계
			 pstmt.close();
			 conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
