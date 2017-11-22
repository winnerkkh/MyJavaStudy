package p05.graphic;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphicMainExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("성적 그래프 프로그램");
		frame.setLocation(400, 200);
		frame.setPreferredSize(new Dimension(400, 350));

		Container contentPane = frame.getContentPane();

		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JButton button = new JButton("그래프 그리기");
		controlPanel.add(new JLabel("국어"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("영어"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("수학"));
		controlPanel.add(text3);
		controlPanel.add(button);

		// 컨테이너에 컴포넌트 그룹 부착
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//리스너 객체 생성
		DrawingActionListener listener = new DrawingActionListener(text1,text2,text3,drawingPanel);
		button.addActionListener(listener);
		
		// button.addActionListener(listener);
		frame.pack();
		frame.setVisible(true);

	}
}
