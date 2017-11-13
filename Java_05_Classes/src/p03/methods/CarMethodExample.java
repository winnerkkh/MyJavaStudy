package p03.methods;

public class CarMethodExample {
	public static void main(String[] args) {
		Car mycar = new Car(); // car instance생성 및 참조변수 대입.
		mycar.setGas(5); //참조변수.메소드(실제값); <- 메소드 호출
		System.out.println("초기 값:" + mycar.gas);
		
		boolean gasState = mycar.isLeftGas(); 
		//isLeftGas()메소드가 boolean타입을 리턴하므로
		// 리턴 값을 받는 변수는 boolean타입이 선언.
		
		if(gasState) {
			
			System.out.println("출발");
			mycar.run(); //mycar의 run ()메소드 호출
		}
		
		if(mycar.isLeftGas()) {//if()내의 값이 true이면
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		
		else {
			System.out.println("gas를 주입하세요");
		}
		
		
	}
}
