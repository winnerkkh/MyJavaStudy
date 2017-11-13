package p09.polymorphism;

/* *
 * 인터페이스의 필드의 다형성
 * */



public class Car2Example {
	public static void main(String[] args) {
		// 객체 생성
		Car2 myCar = new Car2();
		myCar.run();

		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
	}
}
