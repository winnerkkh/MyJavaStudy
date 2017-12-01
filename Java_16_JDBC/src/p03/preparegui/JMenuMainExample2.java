package p03.preparegui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class JMenuMainExample2 extends JFrame implements ActionListener{
	//필드
	JTextField textField;
	//생성자
	public JMenuMainExample2() throws HeadlessException{
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JMenuBar jmb= new JMenuBar();//메뉴바 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		//메뉴 아이템 생성
		JMenuItem jmi = new JMenuItem("주소록 입력");
		jmi.addActionListener(this);//메뉴아이템에 리스너 붙이기
		menu1.add(jmi);//메뉴에 메뉴아이템 붙이기
		jmb.add(menu1);//메뉴바에 메뉴 붙이기
		
		jmi = new JMenuItem("주소록 출력");//메뉴아이템 생성
		jmi.addActionListener(this);//메뉴아이템에 리스너 붙이기
		menu1.add(jmi);//메뉴에 메뉴아이템 붙이기
		jmb.add(menu1);//메뉴바에 메뉴 붙이기
		setJMenuBar(jmb);//메뉴프레임에 메뉴바 추가
		
		
		textField = new JTextField();
		contentPane.add(textField,BorderLayout.SOUTH);
		setTitle("JMenuTest");
		setSize(300, 200);
		setVisible(true);
	}
	//이벤트 메소드
	// 발생한 이벤트 객체를 String타입으로 반환하는 메소드 getActionCommand();
	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText(e.getActionCommand());
		
	}
	public static void main(String[] args) {
		 new JMenuMainExample2();
	}

}
