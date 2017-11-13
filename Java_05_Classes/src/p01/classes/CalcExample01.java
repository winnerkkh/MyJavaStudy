package p01.classes;

public class CalcExample01 {
	public static void main(String[] args) {
		//객체(instance) 생성
		Calculator calculator = new Calculator();
		
		calculator.setField1(10); //생성된 instance의 메소드호출시 매개변수는 실제값이 전달됨.
		calculator.setField2(5); // 생성된 instance의 메소드 호출시 매개변수는 실제값이 전달됨.
		calculator.setOp('+');//생성된 instance의 메소드호출시 매개변수는 실제값이 전달됨.
		
		//메소드 중복정의(이름은 같지만, 안에 들어있는 매개변수가 다름-오버로딩)
		calculator.calc();//메소드의 중복정의
		calculator.calc(10, 5, '+');//생성된 instance의 메소드호출시 매개변수는 실제값이 전달됨.
	}
}
