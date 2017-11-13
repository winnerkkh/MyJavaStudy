package p09.polymorphism;

/* *
 * drive메소드의 매개변수로 인터페이스 (Vehicle)이 옴
 * */

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		
		//vehicle 타입이 Bus의 타입으로 형변환이 가능한지 조건 확인후 그렇게 된다면 형변환 하라는 의미
		if(vehicle instanceof Bus) { //casting가능여부 확인하는 메소드
			((Bus) vehicle).checkFare(); //강제형변환 casting
		}
	}
}
