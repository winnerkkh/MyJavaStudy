package p04.getterAndSetters;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(-50);//입력오류
		
		System.out.println("현재속도:"+myCar.getSpeed());
		
		myCar.setSpeed(60); //정상입력
		System.out.println("현재속도: " + myCar.getSpeed());
		
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도:"+myCar.getSpeed());
	}
}
