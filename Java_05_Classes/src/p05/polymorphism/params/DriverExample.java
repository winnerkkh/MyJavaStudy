package p05.polymorphism.params;

public class DriverExample {
	public static void main(String[] args) {
		//객체 생성
		Driver driver = new Driver();
		//vehicle을 상속받은 자식 개체들
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //매게변수로 Vehicle객체 대신에 Bus객체를 대입
		driver.drive(taxi); //매게변수로 Vehicle객체 대신에 Bus객체를 대입
		
	}
}
