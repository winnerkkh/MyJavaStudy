package p05.polymorphism;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); // 이륙 메소드 호출
		sa.fly(); //비행 메소드 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // flyMode가 2(Supersonic)이므로 자식메소드만 호출
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); //flyMode가 1이므로 부모메소드 super.fly()가 호출
		sa.land(); //부모메소드(자식메소드에서 재정의 되지 않았음.)
	}
}
