package p10.inner;

public class Main {
	public static void main(String[] args) {
		//객체 생성
		A a = new A(); //인스턴스를 만든후,①
		
		//인스터스 멤버 클래스 객체 생성
		A.B b = a.new B(); //중첩클래스의 생성: 바깥쪽클래스변수.new 안쪽 생성자();
		// ②중첩클래스의 생성:바깥쪽클래스변수.new 안쪽생성자();
		b.field1=3;//중첩클래스의 필드에 접근
		b.method1();//중첩클래스의 메소드에 접근
		
		//정정 멤버클래스 객체 생성
		//바깥쪽 클래스명.안쪽클래스명();
		A.C c = new A.C();
		c.field1=3;//정적 중첩클래스의 인스턴스 필드
		c.method1();//정적 중첩클래스의 인스턴스 메소드
		
		A.C.field2 = 3;//정적 중첩클래스의 정적 필드
		A.C.method2();//정적 중첩클래스의 정적 메소드
		
		//로컬 클래스 객체 생성 메소드 호출
		a.method1();//바깥쪽 클래스의 메소드가 실행되어 안쪽 
		            //클래스의 객체와 필드,메소드가 생성됨
	}
}
