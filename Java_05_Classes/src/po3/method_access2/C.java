package po3.method_access2;

import po3.method_access1.A; //ctrl + shift + o

public class C {
	public C() {
		A a = new A();
		a.field1=1; //필드가 public임으로 다른 패키지에서 접근 가능.
//		a.field2=1; //필드가 default이므로 다른 패키지에서 접근 불가.
//		a.field3=1; //필드가 private이므로 다른 패키지에서도 접근 불가.
		
		a.method1(); //메소드가 public임으로 다른 패키지에서 접근 가능 .
//		a.method2(); //메소드가 default임으로 다른 패키지에서 접근 불가.
//		a.method3(); //메소드가 private이므로 다른패키지에서도 접근 불가.
	}
}
