package p02.windows_event;

/* *
 * 리스너  - 컴포넌트에 이벤트가 발생하는지 여부를 모니터링하는 객체
 *		 - 이벤트 발생시 미리 정해진 명령문을 실행함.
 * */


import java.awt.event.ActionEvent;
/*
 * Consumer타입의 FunctionInterface
 */
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CancelButtonActionListener implements ActionListener {
	
	//처리대상 컴포넌트로 사용할 필드
	JTextField text;
	
	//생성자
	public CancelButtonActionListener(JTextField text) {
		this.text = text;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		text.setText("");

	}


}
