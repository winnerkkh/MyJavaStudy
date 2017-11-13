package p03.methods;
/* *
 * static멤버의 호출 => 클래스명.메소드()
 * instance멤버의 호출 => new 클래스명(); 후 접근 가능
 * */
public class CalculatorExample4 {
	public static void main(String[] args) {
		int result1= Calculator4.plus(10, 20); //객체를 생성하지 않고 바로 사용
		int result2= Calculator4.minus(20, 10);
		
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		Calculator4 Calculator4 = new Calculator4();
		Calculator4.setColor("빨강");
		System.out.println(Calculator4.color);
	}
}
