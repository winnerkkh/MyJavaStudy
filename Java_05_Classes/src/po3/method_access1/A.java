package po3.method_access1;

public class A {

	//필드
	public int field1;
	int field2; //default
	private int field3; 
	
	//생성자
	public A() { //동일한 클래스내에서는 접근제한과 상관없이 모두 접근 가능
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
