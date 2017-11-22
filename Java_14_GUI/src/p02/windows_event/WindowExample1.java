package p02.windows_event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowExample1 {

	public static void main(String[] args) {
		/* 1단계 - 화면 구성 */
		
		//윈도우 프레임 생성
		JFrame frame = new JFrame("헬로 자바 Program");
		
		//윈도우 사이즈 조정
		frame.setPreferredSize(new Dimension(300,80));
		
		//윈도우 위치 지정
		frame.setLocation(400, 250);
		
		//컨테이너 구하기
		Container contentPane = frame.getContentPane();
		
		//컨테이너에 담을 컴포넌트 생성
		JTextField text = new JTextField(); //문자열 입력 객체;
		JButton button = new JButton("확인");
		JButton cancelButton = new JButton("취소");
		JLabel label = new JLabel("Hello");
		
		//컴포넌트를 그룹화 하는 panel컴포넌트 생성
		JPanel panel = new JPanel();
		
		//한쪽방향(가로 혹은 세로 방향)으로 나열하는 레이아웃 BoxLayout
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		//판넬에 컴포넌트 담기
		panel.add(button);
		panel.add(cancelButton);
		
		
		//컴포넌트에 담기
		contentPane.add(text, BorderLayout.CENTER); //중앙배치
		//contentPane.add(button, BorderLayout.EAST); //오른쪽 배치
		contentPane.add(panel, BorderLayout.EAST); //판넬로 그룹화한 컴포넌트 배치
		contentPane.add(label, BorderLayout.SOUTH); // 아래쪽 배치
		
		//x버튼 클릭시 프로그램 종료 처리
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트 객체 생성
		ActionListener listener = //처리대상인 text필드와 label을 매개변수로 생성
						new ConfirmButtonActionListener(text,label); //메인메소드 선언된 text와 label 객체
		
		ActionListener cancelListener = //처리대상인 text필드와 label을 매개변수로 생성
				new CancelButtonActionListener(text); //메인메소드 선언된 text와 label 객체
		
		//이벤트객체를 컴포넌트에 붙이기
		button.addActionListener(listener);
		cancelButton.addActionListener(cancelListener);
		
		/*2단계 화면에 보이기*/
		
		//윈도우 크기 보정
		frame.pack();
		
		//회면에 띄우기
		frame.setVisible(true);
		
		
		
		
		
		
		
	}

}
