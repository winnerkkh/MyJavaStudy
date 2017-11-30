package p03.preparegui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressGui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("연락처 프로그램");
		frame.setPreferredSize(new Dimension(250, 150));
		frame.setLocation(400, 300);

		Container contentPane = frame.getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));

		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();

		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("주소"));
		panel.add(text2);
		panel.add(new JLabel("전화번호"));
		panel.add(text3);
		contentPane.add(panel, BorderLayout.CENTER);
		JButton button = new JButton("입력");
		
		// 리스너 부착
		AddActionListener listener =  new AddActionListener(text1,text2,text3);
		
		button.addActionListener(listener);
		
		contentPane.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
