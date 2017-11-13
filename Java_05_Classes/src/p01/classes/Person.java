package p01.classes;
/* *
 * 클래스 = 객체(Object)를 자바에서 구체화한 설계도
 * 클래스의 선언
 * 	접근제한자 class 클래스명{
 * 		//속성
 * 		//기능
 * 	}
 * */

//사람은 이름과 나이라는 속성이 있고, 웃고 먹는 기능을 가지고 있다.

public class Person {
	
	//생성자(Constructor)- 모든 클래스는 생성자가 반드시 있어야함.
	//매개변수(Parameter)가 없는 형태의 생성자: default(기본 생성자).
	//클래스 작성시 기본생성자를 기술하지 않으면, 컴파일시 알아서 추가를 해줌.
	//생성자 역할 - 객체 생성 직후에 초기화를 해줌.

	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age= age;
	}
	
	
	
	//속성(Field, Property)
	String name;
	int age;
	
	//기능(Method)
	void smile() {
		System.out.println(name+"님께서 웃습니다.");
	}
	
	void eat() {
		System.out.println(name+"님께서 먹습니다.");
	}
}
