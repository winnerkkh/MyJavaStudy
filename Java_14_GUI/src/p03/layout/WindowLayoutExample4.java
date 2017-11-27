package p03.layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import p02.windows_event.ConfirmButtonActionListener;

public class WindowLayoutExample4 {
	public static void main(String[] args) {
		//윈도우 프레임 생성
		JFrame frame = new JFrame("연락처 프로그램");
		
		//윈도우 프레임 사이즈
		frame.setPreferredSize(new Dimension(250,150));
		
		//위치
		frame.setLocation(300, 200);
		
		//컨테이너
		Container contentPane = frame.getContentPane();
		
		//컴포넌트 그룹화하는 판넬 생성
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2)); // 파넬 객체에 레이아웃을 3행 2열로 설정
		
		//3*2 =6개의 컴포넌트 필요
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("주소");
		JLabel label3 = new JLabel("전화번호");
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		//그룹화 컴포넌트인 panel에 컴포넌트 저장
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		
		//컨테이너에 panel 부착
		contentPane.add(panel, BorderLayout.CENTER); //중앙
		
		JButton button = new JButton("입력");
		contentPane.add(button, BorderLayout.SOUTH); // 아래
		
		
		//리스너 생성
		ActionListener listener = new ConfrimButtonActionListener(text1,text2,text3);
		
		//리스너 부착
		button.addActionListener(listener);
		
		
		//default operation 부착
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}

}
