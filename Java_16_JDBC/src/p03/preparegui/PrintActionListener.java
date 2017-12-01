package p03.preparegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/* *
 * ActionListener - 이벤트 발생 여부를 모니터링하는 객체
 *                - 이벤트 발생시 처리하는 객체
 * */
public class PrintActionListener implements ActionListener {
	// 필드
	JTable table;

	// 생성자 - 객체 생성시 처리할 테이블을 가지고 생성됨.
	public PrintActionListener(JTable table) {
		this.table = table;
	}

	// 이벤트 발생시 처리할 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		int selectedRowNum = table.getSelectedRow();// 선택된 행
		System.out.println("selectedRowNum=" + selectedRowNum);
		if (selectedRowNum > -1) {
			int i = 0;
			int no = (int) table.getValueAt(selectedRowNum, i++);
			String name = (String) table.getValueAt(selectedRowNum, i++);
			String address = (String) table.getValueAt(selectedRowNum, i++);
			String tel = (String) table.getValueAt(selectedRowNum, i++);
			System.out.println(no + " " + name + " " + address + " " + tel);

		    String message = no+" "+name+" "+address+" "+tel;
		    JOptionPane.showMessageDialog(table, message + "출력성공");

		}
	}
}