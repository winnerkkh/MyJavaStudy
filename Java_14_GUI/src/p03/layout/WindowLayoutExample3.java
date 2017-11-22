package p03.layout;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowLayoutExample3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("카 페 ");
		frame.setLocation(200, 100);
		Container contentPane = frame.getContentPane();
		
		//레이아웃생성
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("자바"));
		contentPane.add(new JButton("에스프레소"));
		contentPane.add(new JButton("카푸치노"));
		contentPane.add(new JButton("블루마운틴"));
		contentPane.add(new JButton("콜럼비아"));
		contentPane.add(new JButton("과테말라"));
		
		//default
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
