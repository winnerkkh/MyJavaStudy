package p03.preparegui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * 주소록 출력 프로그램
 * - DB에서 데이타를 읽어서 출력하는 프로그램
 * */
public class AddressPrint2 implements ActionListener{
	static JTable table; 
	public static void main(String[] args) throws Exception {
		//윈도우 프레임 생성
		JFrame frame = new JFrame("연락처 출력 프로그램");
		//프레임사이즈 설정 
		frame.setPreferredSize(new Dimension(300, 200));
		//프레임 위치 조정
		frame.setLocation(300, 200);
		//Container 얻기
		Container contentPane = frame.getContentPane();
		//data구성
		String colNames[] = {"no","이름","주소","연락처"};//헤드 부분 데이타 생성
		Object[][] data = new Object[100][4];//데이타 저장공간 생성
		//1단계 연결
		 Connection conn = Cons.getInstance().getConnection();
		
		//2단계 쿼리 객체 생성
		 String sql = "select * from address";
		 PreparedStatement pstmt= conn.prepareStatement(sql);
		 ResultSet rs = pstmt.executeQuery();
		//3단계 데이타 저장하기
		 int i=0;
		 while(rs.next()) {
			  int j=0,k=0;
			 data[i][j++] = rs.getInt(++k);
			 data[i][j++] = rs.getString(++k);// 처리 후 1 증가
			 data[i][j++] = rs.getString(++k);
			 data[i++][j++] = rs.getString(++k);
		 }
		 Object[][] data2 = new Object[i][4];//입력된 행(row)만큼 이차원배열생성
		 //빈공백제거 후 data2 생성
		 for(int j=0;j<i;j++)//
			 for(int k=0;k<4;k++)
				  data2[j][k] = data[j][k];
		//4단계 쿼리 종료	
			rs.close();
			pstmt.close();
		//테이블 생성
		 table = new JTable(data2,colNames);
		//컨테이너 배치
		JScrollPane scrollPane = new JScrollPane(table);
		//중앙에 배치
		contentPane.add(scrollPane, BorderLayout.CENTER);
		//출력버튼 
		JButton button = new JButton("출력");
		//아래쪽 배치
		contentPane.add(button,BorderLayout.SOUTH);
		//리스너 생성
		PrintActionListener listener
		 = new PrintActionListener(table);//리스너 생성시 처리할 테이블 을 가지고 생성
		//리스너 부착
		button.addActionListener(listener);
		//보이기
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		//화면보정
		frame.pack();
		//보이기
		frame.setVisible(true);
	}
	//Listener 구현한 클래스- 메소드 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		int selectedRowNum = table.getSelectedRow();//선택된 행
		if(selectedRowNum > -1) {
			int i=0;
			int no = (int)table.getValueAt(selectedRowNum, i++);
		    String name= (String)table.getValueAt(selectedRowNum, i++);
		    String address = (String)table.getValueAt(selectedRowNum, i++);
		    String tel = (String)table.getValueAt(selectedRowNum, i++);
		    
		    String message = no+" "+name+" "+address+" "+tel;
		    JOptionPane.showMessageDialog(table, message);
		}
	}
}