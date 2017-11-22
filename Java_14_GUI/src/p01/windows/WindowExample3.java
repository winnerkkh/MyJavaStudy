package p01.windows;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



/*WindowExample2
타이틀: "내가만든 첫번째 윈도우 프로그램"
사이즈: 400, 300
윈도우 시작 위치: 300, 200
라벨내용: 반갑습니다 GUI - 콘테이너 위쪽으로 배치
X버튼 클릭시: 프로그램 종료되도록 추가*/
public class WindowExample3 {
	public static void main(String[] args) {
		
		//타이틀: "내가만든 첫번째 윈도우 프로그램"
		JFrame frame = new JFrame("내가 만든 첫번쨰 윈도우 프로그램");
		
		//창 사이즈: 400, 300
		frame.setPreferredSize(new Dimension(400, 300));
		
		//윈도우가 켜질시 화면상에 나타나는 위치
		//윈도우 시작 위치: 300, 200
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		//라벨내용: 반갑습니다 GUI - 콘테이너 위쪽으로 배치
		JLabel label = new JLabel("반갑습니다 GUI", SwingConstants.CENTER);
		contentPane.add(label);
		
		//X버튼 클릭시: 프로그램 종료되도록 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면 보정(추가했던 메소드를 합쳐주는것)
		frame.pack();
		
		frame.setVisible(true);
		
	}
}
