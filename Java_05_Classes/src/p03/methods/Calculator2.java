package p03.methods;
/* *
 * 동일 클래스내의 메소드 호출
 * - 외부객체에서 메소드 호출시 참조변수.메소드명()하지말고,
 *   메소드명()으로 호출, 결과값을 사용할수 도 있음.
 * */

public class Calculator2 {
	//int타입의 리턴 메소드
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	//double타입 
	double avg(int x, int y) {
		double sum = plus(x,y); //동일클래스내의 plus()메소드 호출
		double result = sum/2;
		return result;
	}
	
	//void타입
	void execute() {
		double result = avg(7,10);
		println("실행결과: "+ result);
	}
	
	//void타입
	void println(String message) {
		System.out.println(message);
	}
}
