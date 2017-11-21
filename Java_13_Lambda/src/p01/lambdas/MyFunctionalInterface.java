package p01.lambdas;
/* *
 * 함수적 인터페이스
 * 	- 추상메소드가 하나만 존재하는 인터페이스
 * */

@FunctionalInterface // 함수적인터페이스를 컴파일에게 알려주는 어노테이션
public interface MyFunctionalInterface {
	public void method();
	// public void method2();

}
