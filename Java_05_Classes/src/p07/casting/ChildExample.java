package p07.casting;

public class ChildExample {
	public static void main(String[] args) {
		//상속관계에 있는
		//부모타입의 참조변수에 자식클래스 객체를 대입
		Parent parent = new Child();
		parent.field1 = "data1"; //부모타입으로 변경된후, 부모필드접근 가능.
		parent.method1(); //부모타입으로 변경된 후, 부모메소드 접근
		parent.method2(); //부모타입으로 변경된 후, 부모메소드 접근
		
//		parent.field2 = "data"; 부모타입으로 변경된 후, 자식클래스에서 추가된 필드 접근불가. 
//		parent.method3(); //부모타입으로 변경된 후, 자식클래스에서 추가된 메소드 접근불가.
		
		//추가된 자식메소드와 필드 사용해야하는 경우
		Child child = (Child)parent;//Casting
		child.field2 ="yyyy"; //저식타입으로 강제 형 변환후, ,추가된 자식필드에 접근 가능
		child.method3();//자식클래스에서 추가된 메소드도 접근 가능
	}
}
