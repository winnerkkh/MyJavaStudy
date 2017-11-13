package p03.methods;

/* *
 * 리턴타입 메소드명(매개변수){실행부;}
 * 	메소드 호출=> 참조변수.메소드명(실제값);<---- 메소드의 선언부만 호출;
 * */

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//메소드 호출 - CalculatorExample이라는 외부객체가 Calculator
		//내부의 plus()메소드를 호출 => 참조변수.메소드(실제값, 실제값);
		
		cal.powerOn(); // void타입의 메소드 호출
		int result = 0;
		result = cal.plus(10, 20);
		System.out.println("결과: " + result);
		cal.devide(10, 5); // 리턴타입의 메소드의 결과값을 받지 않아도 됨.
		cal.powerOff(); //void타입의 메소드 호출
	}
}
