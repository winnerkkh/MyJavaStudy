package p03.constructor_acceess2;

import p03.constructor_access1.A;

public class C {
	//필드 // => ctrl + shift + o 를 눌르면 경로를 import함
	A a1 = new A(true); //public이므로 디른패키지내에서 접근가능
	// A a2 = new A(1); // default이므로 다른패키지내에서 접근불가
	// A a3 = new A("홍길동") // private이므로 접근 불가
}
