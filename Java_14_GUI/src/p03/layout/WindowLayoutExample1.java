package p03.layout;
/* *
 * GridLayout - 테이블 표 형식의 레이아웃
 * */

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowLayoutExample1 {
	public static void main(String[] args) {
		//윈도우 객체 생성
		JFrame frame = new JFrame("동물원");
		
		//위치 선정
		frame.setLocation(400, 300);
		
		//컨테이너 구하기
		Container contentPane = frame.getContentPane();
		
		//레이아웃 컴포넌트 생성
		GridLayout layout = new GridLayout(3,2);
		
		//컨테이너의 레이아웃 설정
		contentPane.setLayout(layout); //GridLayour이 설정
		
		//컴포넌트 추가
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("코뿔소"));
		contentPane.add(new JButton("팽귄"));
		contentPane.add(new JButton("하이에나"));
		
		//X버튼 클릭이벤트 실행 종료 이벤트 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//크기 조정
		frame.pack();
		
		//화면에 보이기
		frame.setVisible(true);
		
	}
}
