package p08.abstracts;

public class PhoneExample {
	
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // 부모클래스의 메소드 호출
		smartPhone.internetSearch(); // 자식클래스에서 추가된 메소드 호출
		smartPhone.turnOff(); // 부모클래스의 메소드 호출
		
		Phone phone = smartPhone; //자동형변환(자식타입 -> 부모타입):Promotion
		phone.turnOff(); //부모메소드 호출(자식메소드에서 재정의 안함)
//		phone.internetSearch() //부모클래스에 없는 메소드
		phone.turnOn(); //부모메소드 호출
	}
}
