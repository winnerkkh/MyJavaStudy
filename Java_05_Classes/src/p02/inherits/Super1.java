package p02.inherits;
/* *
 * 클래스파일(클래스명.java)에는 public클래스는 하나만 존재하며, public이 아닌 클래스는 여러개 존재
 * 
 * 	상속 
 * 	- 부모와 자식이 같은 변수이면 자식의 변수를 사용함(부모의 값이 가려짐).
 * 	- 자식에서 동일한 부모의 변수를 사용하려면 (super.변수명) 키워드를 사용해야함.
 *  - 자식의 변수에서는 this.가 생략됨.
 *  - 자식클래스에서 부모의 클래스를 재정의하는것을 "override" 라고 함.
 *  - override된 메소드는 override된 내용으로 실행됨.
 * */

public class Super1 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.print();
		b.display();
		System.out.println(b.a);
		System.out.println(b.b);
	}
} //Super1클래스 끝,

/////////////////////////////////////////////////////////////////////////////////////////////////////////

class B1{
	//필드(속성)
	int a=7; //B1의 a
	int b=7;
	void display() {
		System.out.println("B1의 메소드");
	}
	
	void print() {
		System.out.println("부모의 메소드");
	}
} //B1클래스 끝

/////////////////////////////////////////////////////////////////////////////////////////////////////////

// 부모클래스인 B1클래스를 상속받아서 B2 클래스를 만듬
// 자식클래스(B2) extends 부모클래스(B1)
class B2 extends B1{
	int a=10; //B2의 a //자식 클래스에서 필드를 재정의하면 부모필드의 값이 가려짐.
	
	void print() { //메소드 재정의(-override)
		super.print();// 부모메소드의 print()메소드를 호춣
		System.out.println("------------------------");
		System.out.println("자식 메소드, a=" + a);
		System.out.println("부모의 필드 a의 값= " +super.a); //부모의 필드값 출력
		System.out.println("b의 값=" + b); //부모의 값 출력
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////














