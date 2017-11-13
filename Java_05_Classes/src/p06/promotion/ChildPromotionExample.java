package p06.promotion;

public class ChildPromotionExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; //부모참조변수에 자식객체를 대입
							   //부모타입으로 promotion(자동으로 부모타입으로 변환)
		
		//부모타입으로 변했기 때문에 부모타입의 메소드만 사용가능.
		parent.method1();
		parent.method2(); //자식 클래스에서 재정의된 메소드는 부모클래스로
						  //변환되더라도 자식의 메소드 내용이 출력됨.
//		parent.method3(); //부모클래스에 존재하지 않는 메소드이므로 사용불가.
	}

}
