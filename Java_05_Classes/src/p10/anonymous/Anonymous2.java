package p10.anonymous;

public class Anonymous2 {
	//필드초기값으로
	//인터페이스의 구현체를 생성하여 인터페이스타입으로 대입(Promotion 발생)
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
	};
	
	void method1(){
		//로컬변수
		//로컬변수의 초기값으로 인터페이스의 구현체 생성 대입
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};//
		
		rc.turnOn(); //로컬 변수의 초기값으로 대입한 인터페이스의 메소드  호출 
		rc.turnOff();
	}
	
	//메소드
	void method2(RemoteControl rc) { //매소드의 매개값으로 선언	
		rc.turnOn();
		rc.turnOff();
		
	}
	
	
	
}
