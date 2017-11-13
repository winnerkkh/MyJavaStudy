package p10.innerInterface;
/* *
 * 중첩인터페이스로 구현된 클래스
 *  클래스 implements 바깥클래스.안쪽인터페이스
 * */

public class MessageListener implements Button.OnClickListener{
	
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다");
	}
}
