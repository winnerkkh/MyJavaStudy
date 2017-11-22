package p01.windows;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/* *
 * Frame위에 Container를 얹고 필요한 컴포넌트들을 담아서 만듬
 * */


public class WindowExample2 {
	
	public static void main(String[] args) {
		/* * 1단계. 윈도우 프로그램 만들기  * */
		//윈도우 프레임 설정
		JFrame frame = new JFrame("헬로자바 프로그램");
		
		//프레임 크기 조정
		frame.setPreferredSize(new Dimension(300, 200));
		
		//프레임 위치 조정
		//프레임의 시작위치(사각형의 윈쪽우측의 위치 조정)
		frame.setLocation(500, 400);
		
		//컴포넌트들을 담을 컨테이너 설정
		Container contentPane = frame.getContentPane();
		
		//문자를 출력한 라벨컴포넌트 생성
		JLabel label = new JLabel("Hello, Java", SwingConstants.CENTER);
		
		//생성한 라벨컴포넌트를 컨테이너에 담기
		contentPane.add(label);
		
		//윈도우 우측상단의 X버튼 클릭시 프로그램 종료하도록 이벤트 추가
		//실제로 윈도우창을 close했다 하더라도 자바 콘솔안에는 그대로 실행중임.
		//그래서 이 기능을 추가해야함
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		/* * 2단계. 화면에 디스플레이  * */
		//화면에 나타나는 모양 보정
		frame.pack();
		
		//화면에 나타내기 setVisible(true)
		frame.setVisible(true);
	}

}
