package p03.privilege2;

import p03.privilege.B;//다른 패키지에 만든 라이브러리를 마치
                       //현재의 패키지에 만든것처럼 사용가능

public class C {
	//A a; //접근제한이 default인 경우는 다른패키지에서 접근 불가
	B b;//접근제한이 public인 경우는 다른패키지에서 접근 가능
}
