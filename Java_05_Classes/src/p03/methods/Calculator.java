package p03.methods;
/* *
 * 메소드 선언
 *  리턴타입 메소드명 (매개변수){실행부; return문;}
 *  - 리턴타입이 없는 메소드 
 *    : void 메소드명(매개변수){실행부;}
 * 
 * */
public class Calculator {
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	//리턴 타입이 int이므로 실행부{}내에 리턴문;이 존재.
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	//리턴 타입이 double이므로 실행부{}내에 리턴문이 존재
	double devide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	//리턴타입이 없으므로 실행부{}내에 리턴문이 없음
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
}
