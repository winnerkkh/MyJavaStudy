package p04.model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class RemoveActionListener implements ActionListener {
	//처리할 컴포넌트는 table뿐
	JTable table;
	//생성자
	public RemoveActionListener(JTable table) {
		this.table = table;
	}
	//메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//선택된 행값 가져오기
		int row = table.getSelectedRow();//마우스로 클릭한 행의 번호를 리턴
		if(row==-1) return;//row==-1:선택된 행이 없으면....
		int choice 
		= JOptionPane.showConfirmDialog(table, "삭제하시겠습니까?");
		if(choice!=0) return;
		//System.out.println(choice);
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);
	}
}
