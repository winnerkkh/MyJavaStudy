package p06.promotion;

/* *
 * 최상위 부모클래스에 선언한 두개읨 ㅔ소드는 자식클래스에서 사용 가능
 * 	- 자식클래스에서 추가한 메소드가 있는 경우
 * 	- 자식을 promotion 한 후 추가한 자식 메소드를 사용할수 없다.
 * */

public class Parent {
	public void method1() {
		System.out.println("parent-method1()");
	}
	
	public void method2() {
		System.out.println("parent-method2()");
	}
	
	
	
}
