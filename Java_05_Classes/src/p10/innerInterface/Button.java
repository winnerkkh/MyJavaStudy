package p10.innerInterface;

/* *
 * 중첩인터페이스
 * - GUI프로그램에서 발생하는 EVENT를
 *   처리하기위한 객체로 사용됨.
 * - Listener객체는 이벤트가 발생하는지 여부를
 *   모니터링하는 객체로 사용됨.
 *   - 이벤트가 발생하면 미리 정해진 명령문을 사용하여 처리.
 * */
public class Button {
	//필드
	OnClickListener listener;
	
	//메소드
	//Shift + Alt + s
	
	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();//인터페이스의 onClick()메소드 호출
	}
	
	
	//중첩 인터페이스
	/*public static*/ interface OnClickListener{
		void onClick(); // 추상메소드 선언
	}
}
