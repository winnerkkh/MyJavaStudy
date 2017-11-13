package p09.polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		// 객체 생성
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// 매개변수의 다형성
		// 인터페이;스로 대입되면서 자동형변환
		driver.drive(bus); // Vehicle인터페이스 대신 Bus구현체가 대입
		driver.drive(taxi); // taxi
		
	//Vehicle인터페이스에 버스 구현체를 대입	
	Vehicle vehicle = new Bus();
	vehicle.run();//bus에서 재정의된 메소드 호출
//	vehicle.checkFare(); <----인터페이스에는 없는 메소드 사용불가
	
	Bus bus2 = (Bus)vehicle; //강제 형변환(Casting)
	bus.checkFare(); //Bus타입으로 형변환되어서 추가된 메소드인 checkFare() 사용 가능
	}

}
