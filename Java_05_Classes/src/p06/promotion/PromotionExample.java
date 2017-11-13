package p06.promotion;

/* *
 * 개체의 다형성 - 최상위 객체 참조변수에는 상속을 받은 자식들의 
 * 				 Instance객체가 대입 가능하며,
 * 				 대입연산시 자동으로 부모타입으로 형변환(Promotion).
 * */


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//최상위(A) 참조변수에 대입
		
		A a1 = b; //자식 객체가 부모타입의 참조변수에 대입되면서 자동형변환.
		A a2 = c; // promotion
		A a3 = d; // promotion
		A a4 = e; // promotion
		
		B b1 = d; //상속관계에서 자식의 객체가 부모참조변수에 자동 대입. 자동형변환
		C c1 = e; //promotion
		
//		B b3 = e; // 상속관계가 아니기 때문에 대입 불가
//		C c3 = d; // 상속관계가 아니기 때문에 대입 불가		
		
		//문법적으로는 가능하나
		//실행시(Runtime)시 Catsting예외 발생함. 
		B b4 = new B();
		A a5 = b4;
		C c4 = (C)a5;
	}
}
