package p05.polymorphism;

/* *
 * 상속 클래스명 extends 부모 클래스
 * */

public class SportsCar extends Car{
	@Override//컴파일러에게 재정의 되었음을 알려주는 기능(여기서는 주석의 기능)
	public void speedUp() {
		//super.speedUp();//부모클래스의 메소드를 사용:super.메소드();
		speed +=10;//재정의 부모메소드에서 1씩증가 하는 메소드를
		           //자식클래스에소 10씩 증가 하도록 재정의
	}
	
	
	//부모클래스에서 final로 지정된 메소드이므로 자식클래스에서
	//재정의 불가!!!
	
	/*private void stop() {
	   System.out.println("자식 메소드에서 재정의");
	   speed=0;
	}*/
	
}
