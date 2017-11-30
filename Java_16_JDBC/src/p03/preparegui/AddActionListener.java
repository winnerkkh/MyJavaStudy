package p03.preparegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import p02.singleton.Connections;

public class AddActionListener implements ActionListener {
	// 필드
	JTextField text1, text2, text3;
	String sql = "insert into address(name, address, tel) values(?,?,?)";

	// 생성자
	public AddActionListener(JTextField text1, JTextField text2, JTextField text3) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	// 입력버튼 클릭이벤트 발생시 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// 연결
		Connection conn = Connections.getInstance().getConnection();

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//text에서 입력값 받기
			pstmt.setString(1, text1.getText());
			pstmt.setString(2, text2.getText());
			pstmt.setString(3, text3.getText());
			
			int result = pstmt.executeUpdate();
			
			String message = "이름: "+ text1.getText()+" 주소: "+text2.getText()+" 전화번호: "+text3.getText();
			if(result>0) {
				JOptionPane.showMessageDialog(text1, message+ " 입력 성공!");
			}
			
			else {
				System.out.println("입력 실패");
			}
			
			
			
		} catch (Exception Ee) {
			System.out.println(Ee.getMessage());

		}

	}
}
