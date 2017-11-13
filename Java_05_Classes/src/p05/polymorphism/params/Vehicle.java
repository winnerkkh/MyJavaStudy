package p05.polymorphism.params;
/* *
 * 상속관계에서
 * 부모객체에서 선언된 메소드가 
 * 자식객체에서 재정의되면 
 * 무조건 자식 메소드가 호출됨(부모타입으로 바뀌어도 자식메소드가 호출)
 *  - 매개변수의 다형성
 *  - 메소드의 매개변수로 최상위 객체를 선언하면
 *    상속받은 하위의 객체들을 매개변수로 대입가능
 * */
public class Vehicle {
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}
