package p02.inherits;

public class Car {
	//필드
	int a=7; //탑승인원
	//메소드
	void move() {
		System.out.println("이동 합니다!");
	}
}

/////////////////////////////////////////////////////
class Bus extends Car{
	int a=25; //자식클래스에서 재정의된 필드값과 메소드
	void move() {
		System.out.println(a+"명을 태우고 이동한다.");
	}
}

class Ambulance extends Bus{
	int a= 10;
	void move() {
		System.out.println("싸이렌을 울리면서 이동한다.");
	}
	
	//메소드 추가, 상속받은 자식의 클래스에서 메소드 추가 가능
	void special() {
		System.out.println("환자를 태우고 이동한다.");
	}
}
/////////////////////////////////////////////////////
class FireEngine extends Car{
	int a = 11; //재정의
	void move() {
		System.out.println("물을 뿌리면서 이동한다.");
	}
	
	
}